package com.kingdee.fpy.config.dbconfig;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.schema.Table;

/**
 * @author chenhuanwei
 * @date 2023/5/6
 */
@Data
@AllArgsConstructor
public class TableWrap {

    private Table table;

    private Boolean leftJoinOrRightJoin;

    private List<BinaryExpression> expressionList;

    private SqlParseVo sqlParseVo;


    public TableWrap(Table table, Boolean leftJoinOrRightJoin, List<BinaryExpression> expressionList) {
        this.table = table;
        this.leftJoinOrRightJoin = leftJoinOrRightJoin;
        this.expressionList = expressionList;
    }
}
