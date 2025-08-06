package com.kingdee.fpy.config.dbconfig;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import lombok.SneakyThrows;
import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.RowConstructor;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.relational.ComparisonOperator;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.FromItem;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SetOperationList;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.util.TablesNamesFinder;

/**
 * @author chenhuanwei
 * @date 2023/3/14
 */
public class SqlParseUtils {


    @SneakyThrows
    public static Statement parse(String sql){
        //已知这种SQL能正常执行，但在jsqlparser下会报错
        String formatSql = StrUtil.replace(sql,"'%' ? '%'", "concat('%',?,'%')");

        return CCJSqlParserUtil.parse(formatSql);
    }


    @SneakyThrows
    public static String getParseSql(String sql, Map<String, SqlParseVo> parseVoMap) {
        Statement parse = parse(sql);
        return getParseSql(parse, parseVoMap);
    }

    /**
     * 获取分表SQL
     */
    @SneakyThrows
    public static String getParseSql(Statement parse, Map<String, SqlParseVo> parseVoMap) {
        List<BinaryExpression> equalsList = new ArrayList<>();
        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder() {
            @Override
            public void visit(Insert insert) {
                super.visit(insert);
                //更换分表名
                Table table = insert.getTable();

                TableWrap tableWrap = getTableWrap(parseVoMap, table, false, Collections.emptyMap());
                if (null == tableWrap) {
                    return;
                }
                SqlParseVo sqlParseVo = switchTableName(tableWrap);
                addInsertColumn(insert, sqlParseVo);
            }

            @Override
            public void visit(Update update) {
                super.visit(update);
                List<TableWrap> tableList = getAllTable(update.getTable(), update.getJoins(), equalsList, parseVoMap);
                for (TableWrap table : tableList) {
                    //更换分表表名，添加where租户字段
                    switchTableNameAndAddTenantNoColumn(table, update.getWhere(), update::setWhere);
                }
            }

            @Override
            public void visit(Delete delete) {
                super.visit(delete);
                List<TableWrap> tableList = getAllTable(delete.getTable(), delete.getJoins(), equalsList, parseVoMap);
                for (TableWrap table : tableList) {
                    //更换分表表名，添加where租户字段
                    switchTableNameAndAddTenantNoColumn(table, delete.getWhere(), delete::setWhere);
                }
            }

            @Override
            public void visit(PlainSelect plainSelect) {
                super.visit(plainSelect);
                List<TableWrap> tableList = getAllTable(plainSelect.getFromItem(), plainSelect.getJoins(), equalsList, parseVoMap);
                for (TableWrap table : tableList) {
                    //更换分表表名，添加where租户字段
                    switchTableNameAndAddTenantNoColumn(table, plainSelect.getWhere(), plainSelect::setWhere);
                }
            }

            @Override
            public void visitBinaryExpression(BinaryExpression binaryExpression) {
                super.visitBinaryExpression(binaryExpression);
                if (binaryExpression instanceof ComparisonOperator) {
                    equalsList.add(binaryExpression);
                }
            }
        };
        tablesNamesFinder.getTableList(parse);

        return parse.toString();
    }

    private static void addInsertColumn(Insert insert, SqlParseVo sqlParseVo) {
        Select select = insert.getSelect();
        if (null == select) {
            return;
        }

        Map<String, String> columnMap = sqlParseVo.getColumnMap();

        List<Column> columns = insert.getColumns();
        for (Entry<String, String> entry : columnMap.entrySet()) {
            String columnName = entry.getKey();
            String columnValue = entry.getValue();
            boolean contains = columns.stream().map(Column::getColumnName).anyMatch(c -> c.equalsIgnoreCase(columnName));
            //已经有的字段不再添加
            if (contains) {
                continue;
            }
            //inert into table(x1,x2,x3..)，追加一个字段
            insert.addColumns(new Column(columnName));

            StringValue columnValueExpression = new StringValue(columnValue);

            SelectBody selectBody = select.getSelectBody();
            if (selectBody instanceof PlainSelect) {
                //处理insert into t1(c1,c2...) select c1,c2 from t2 where ...
                PlainSelect plainSelect = (PlainSelect) selectBody;
                plainSelect.addSelectItems(new SelectExpressionItem().withExpression(columnValueExpression));
            }

            if (selectBody instanceof SetOperationList) {
                ExpressionList expressionList = (ExpressionList) insert.getItemsList();
                List<Expression> expressions = expressionList.getExpressions();
                if (CollUtil.isEmpty(expressions)) {
                    throw new RuntimeException("不支持的格式化类型");
                }
                if (expressions.get(0) instanceof RowConstructor) {
                    //处理insert into t1(c1,c2...) values (v1,v2..),(v11,v22..)
                    for (Expression expression : expressions) {
                        if (expression instanceof RowConstructor) {
                            RowConstructor rowConstructor = (RowConstructor) expression;
                            rowConstructor.getExprList().addExpressions(columnValueExpression);
                        }
                    }
                } else {
                    //处理insert into t1(c1,c2...) values (v1,v2..)
                    expressions.add(columnValueExpression);
                }
            }
        }

    }

    private static void switchTableNameAndAddTenantNoColumn(TableWrap tableWrap, Expression where, Consumer<Expression> consumer) {
        Table table = tableWrap.getTable();
        //更换分表名
        SqlParseVo sqlParseVo = switchTableName(tableWrap);
        Map<String, String> columnMap = sqlParseVo.getColumnMap();
        if (CollUtil.isEmpty(columnMap)) {
            return;
        }
        //为分表添加where租户字段
        List<BinaryExpression> equalsToList = Optional.ofNullable(tableWrap.getExpressionList()).orElseGet(Collections::emptyList);
        for (Entry<String, String> entry : columnMap.entrySet()) {
            String columnName = entry.getKey();
            String columnValue = entry.getValue();
            boolean contains = equalsToList.stream()
                    .anyMatch(e -> e.getLeftExpression(Column.class).getColumnName().equalsIgnoreCase(columnName));
            //已经有的字段不再添加
            if (contains) {
                continue;
            }
            //左连接或者右连接 ,不包含条件的表不用拼接租户条件，否则会改变语义
            if (null != where && tableWrap.getLeftJoinOrRightJoin() && equalsToList.isEmpty()) {
                continue;
            }
            EqualsTo equalsTo = new EqualsTo();
            equalsTo.setLeftExpression(new Column(table, columnName));
            equalsTo.setRightExpression(new StringValue(columnValue));

            where = null == where ? equalsTo : new AndExpression(equalsTo, where);
        }
        consumer.accept(where);
    }


    private static SqlParseVo switchTableName(TableWrap tableWrap) {
        Table table = tableWrap.getTable();
        SqlParseVo sqlParseVo = tableWrap.getSqlParseVo();
        table.setName(sqlParseVo.getNewTableName().toLowerCase());
        return sqlParseVo;
    }

    private static List<TableWrap> getAllTable(FromItem fromItem, List<Join> joins, List<BinaryExpression> equalsList, Map<String, SqlParseVo> parseVoMap) {
        Map<String, List<BinaryExpression>> whereMap = equalsList
                .stream()
                .filter(expression -> expression.getLeftExpression() instanceof Column)
                .collect(Collectors.groupingBy(expression -> Optional.ofNullable(expression.getLeftExpression(Column.class).getTable()).map(Table::getName).orElse("")));
        List<TableWrap> list = new ArrayList<>();
        //主表
        if (fromItem instanceof Table) {
            TableWrap tableWrap = getTableWrap(parseVoMap, (Table) fromItem, false, whereMap);
            if (null != tableWrap) {
                list.add(tableWrap);
            }
        }
        //join其他表的部分
        if (null != joins) {
            List<TableWrap> itemList = joins
                    .stream()
                    .map(join -> {
                        FromItem rightItem = join.getRightItem();
                        if (rightItem instanceof Table) {
                            boolean leftJoinOrRightJoin = join.isLeft() || join.isRight();
                            return getTableWrap(parseVoMap, (Table) rightItem, leftJoinOrRightJoin, whereMap);
                        }
                        return null;
                    })
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            if (CollUtil.isNotEmpty(itemList)) {
                list.addAll(itemList);
            }
        }
        return list;
    }

    private static TableWrap getTableWrap(Map<String, SqlParseVo> parseVoMap, Table table, boolean leftJoinOrRightJoin, Map<String, List<BinaryExpression>> whereMap) {
        SqlParseVo sqlParseVo = parseVoMap.get(table.getName().toUpperCase());
        //不在配置里面的，不需要再转换
        if (null == sqlParseVo) {
            return null;
        }
        String key = Optional.ofNullable(table.getAlias()).map(Alias::getName).orElseGet(table::getName);
        return new TableWrap(table, leftJoinOrRightJoin, whereMap.get(key), sqlParseVo);
    }


}