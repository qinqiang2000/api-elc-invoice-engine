package com.kingdee.fpy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 * 数据库代码生成器服务
 * 根据数据库连接和表名生成Model实体类、Mapper接口和XML映射文件
 */
@Slf4j
@Service
public class CodeGeneratorService {
    
    /**
     * 批量导出PostgreSQL表DDL
     * @param jdbcUrl 数据库连接URL
     * @param username 用户名
     * @param password 密码
     * @param tableNames 表名列表
     * @param schemaName 模式名（可选，默认为public）
     * @return DDL导出结果
     */
    public Map<String, Object> exportBatchPostgreSqlDdl(String jdbcUrl, String username, String password, 
                                                        List<String> tableNames, String schemaName) {
        Map<String, Object> result = new HashMap<>();
        
        if (schemaName == null || schemaName.trim().isEmpty()) {
            schemaName = "public";
        }
        
        try {
            // 确保使用PostgreSQL驱动
            if (!jdbcUrl.contains("postgresql")) {
                result.put("success", false);
                result.put("message", "此方法仅支持PostgreSQL数据库");
                return result;
            }
            
            StringBuilder allDdl = new StringBuilder();
            List<String> successTables = new ArrayList<>();
            List<String> failedTables = new ArrayList<>();
            
            // 添加文件头部信息
            allDdl.append("-- Batch DDL Export for PostgreSQL\n");
            allDdl.append("-- Generated at: ").append(new java.util.Date()).append("\n");
            allDdl.append("-- Schema: ").append(schemaName).append("\n");
            allDdl.append("-- Tables: ").append(String.join(", ", tableNames)).append("\n");
            allDdl.append("-- Total tables: ").append(tableNames.size()).append("\n\n");
            allDdl.append("-- ").append(repeatString("=", 80)).append("\n\n");
            
            // 逐个处理每个表
            for (String tableName : tableNames) {
                
                log.info("正在导出表：{}", tableName);
                
                try {
                    String singleTableDdl = generatePostgreSqlDdl(jdbcUrl, username, password, tableName, schemaName);
                    
                    if (singleTableDdl != null && !singleTableDdl.trim().isEmpty()) {
                        allDdl.append("-- ").append(repeatString("=", 80)).append("\n");
                        allDdl.append("-- Table: ").append(schemaName).append(".").append(tableName).append("\n");
                        allDdl.append("-- ").append(repeatString("=", 80)).append("\n\n");
                        
                        // 添加DROP TABLE语句
                        allDdl.append("-- 删除表（如果存在）\n");
                        allDdl.append("DROP TABLE IF EXISTS ").append(schemaName).append(".").append(tableName).append(" CASCADE;\n\n");
                        
                        allDdl.append(singleTableDdl).append("\n\n");
                        successTables.add(tableName);
                        log.info("表 {} 导出成功", tableName);
                    } else {
                        failedTables.add(tableName + " (表不存在或无法获取结构)");
                        log.warn("表 {} 导出失败：表不存在或无法获取结构", tableName);
                    }
                } catch (Exception e) {
                    failedTables.add(tableName + " (" + e.getMessage() + ")");
                    log.error("表 {} 导出失败", tableName, e);
                }
            }
            
            if (successTables.isEmpty()) {
                result.put("success", false);
                result.put("message", "所有表都导出失败");
                result.put("failedTables", failedTables);
                return result;
            }
            
            // 生成文件名（包含时间戳和表数量）
            String timestamp = String.valueOf(System.currentTimeMillis());
            String fileName = "batch_ddl_" + successTables.size() + "_tables_" + timestamp + ".sql";
            String filePath = "ddl_exports/" + fileName;
            
            // 保存DDL到文件
            saveToFile(filePath, allDdl.toString());
            
            // 构建结果
            result.put("success", true);
            result.put("message", String.format("批量DDL导出完成，成功：%d个，失败：%d个", 
                      successTables.size(), failedTables.size()));
            result.put("ddl", allDdl.toString());
            result.put("fileName", fileName);
            result.put("filePath", filePath);
            result.put("totalTables", tableNames.size());
            result.put("successTables", successTables);
            result.put("successCount", successTables.size());
            result.put("failedTables", failedTables);
            result.put("failedCount", failedTables.size());
            result.put("schemaName", schemaName);
            
        } catch (Exception e) {
            log.error("批量DDL导出失败", e);
            result.put("success", false);
            result.put("message", "批量DDL导出失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 导出PostgreSQL表DDL（单个表）
     * @param jdbcUrl 数据库连接URL
     * @param username 用户名
     * @param password 密码
     * @param tableName 表名
     * @param schemaName 模式名（可选，默认为public）
     * @return DDL导出结果
     */
    public Map<String, Object> exportPostgreSqlDdl(String jdbcUrl, String username, String password, 
                                                   String tableName, String schemaName) {
        List<String> tableNames = new ArrayList<>();
        tableNames.add(tableName);
        return exportBatchPostgreSqlDdl(jdbcUrl, username, password, tableNames, schemaName);
    }
    
    /**
     * 批量导出PostgreSQL表DDL并转换为MySQL格式
     * @param jdbcUrl 数据库连接URL
     * @param username 用户名
     * @param password 密码
     * @param tableNames 表名列表
     * @param schemaName 模式名（可选，默认为public）
     * @return MySQL DDL导出结果
     */
    public Map<String, Object> exportBatchPostgreSqlToMysql(String jdbcUrl, String username, String password, 
                                                            List<String> tableNames, String schemaName) {
        Map<String, Object> result = new HashMap<>();
        
        if (schemaName == null || schemaName.trim().isEmpty()) {
            schemaName = "public";
        }
        
        try {
            // 确保使用PostgreSQL驱动
            if (!jdbcUrl.contains("postgresql")) {
                result.put("success", false);
                result.put("message", "此方法仅支持PostgreSQL数据库");
                return result;
            }
            
            StringBuilder allDdl = new StringBuilder();
            List<String> successTables = new ArrayList<>();
            List<String> failedTables = new ArrayList<>();
            
            // 添加文件头部信息
            allDdl.append("-- Batch DDL Export for MySQL (Converted from PostgreSQL)\n");
            allDdl.append("-- Generated at: ").append(new java.util.Date()).append("\n");
            allDdl.append("-- Original Schema: ").append(schemaName).append("\n");
            allDdl.append("-- Original Tables: ").append(String.join(", ", tableNames)).append("\n");
            allDdl.append("-- Total tables: ").append(tableNames.size()).append("\n\n");
            allDdl.append("-- ").append(repeatString("=", 80)).append("\n\n");
            
            // 逐个处理每个表
            for (String tableName : tableNames) {
                
                log.info("正在转换表到MySQL格式：{}", tableName);
                
                try {
                    String singleTableDdl = generateMysqlDdlFromPostgreSql(jdbcUrl, username, password, tableName, schemaName);
                    
                    if (singleTableDdl != null && !singleTableDdl.trim().isEmpty()) {
                        allDdl.append("-- ").append(repeatString("=", 80)).append("\n");
                        allDdl.append("-- Table: ").append(tableName).append(" (Converted from PostgreSQL)\n");
                        allDdl.append("-- ").append(repeatString("=", 80)).append("\n\n");
                        
                        // 添加DROP TABLE语句
                        allDdl.append("-- 删除表（如果存在）\n");
                        allDdl.append("DROP TABLE IF EXISTS `").append(tableName).append("`;\n\n");
                        
                        allDdl.append(singleTableDdl).append("\n\n");
                        successTables.add(tableName);
                        log.info("表 {} 转换成功", tableName);
                    } else {
                        failedTables.add(tableName + " (表不存在或无法获取结构)");
                        log.warn("表 {} 转换失败：表不存在或无法获取结构", tableName);
                    }
                } catch (Exception e) {
                    failedTables.add(tableName + " (" + e.getMessage() + ")");
                    log.error("表 {} 转换失败", tableName, e);
                }
            }
            
            if (successTables.isEmpty()) {
                result.put("success", false);
                result.put("message", "所有表都转换失败");
                result.put("failedTables", failedTables);
                return result;
            }
            
            // 生成文件名（包含时间戳和表数量）
            String timestamp = String.valueOf(System.currentTimeMillis());
            String fileName = "mysql_batch_ddl_" + successTables.size() + "_tables_" + timestamp + ".sql";
            String filePath = "ddl_exports/" + fileName;
            
            // 保存DDL到文件
            saveToFile(filePath, allDdl.toString());
            
            // 构建结果
            result.put("success", true);
            result.put("message", String.format("批量PostgreSQL到MySQL DDL转换完成，成功：%d个，失败：%d个", 
                      successTables.size(), failedTables.size()));
            result.put("ddl", allDdl.toString());
            result.put("fileName", fileName);
            result.put("filePath", filePath);
            result.put("totalTables", tableNames.size());
            result.put("successTables", successTables);
            result.put("successCount", successTables.size());
            result.put("failedTables", failedTables);
            result.put("failedCount", failedTables.size());
            result.put("schemaName", schemaName);
            
        } catch (Exception e) {
            log.error("批量PostgreSQL到MySQL DDL转换失败", e);
            result.put("success", false);
            result.put("message", "批量PostgreSQL到MySQL DDL转换失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 生成代码（支持MySQL批量处理）
     * @param jdbcUrl 数据库连接URL
     * @param username 用户名
     * @param password 密码
     * @param tableNames 表名列表（多个表名用逗号分隔）
     * @param schemaName 数据库名称
     * @return 生成结果
     */
    public Map<String, Object> generateCode(String jdbcUrl, String username, String password, 
                                          String tableNames, String schemaName) {
        Map<String, Object> result = new HashMap<>();
        String packageName = "com.kingdee.fpy";
        
        try {
            // 确保使用MySQL驱动
            if (!jdbcUrl.contains("mysql")) {
                result.put("success", false);
                result.put("message", "此方法仅支持MySQL数据库");
                return result;
            }
            
            // 解析表名列表
            String[] tableNameArray = tableNames.split(",");
            List<String> tableNameList = new ArrayList<>();
            for (String tableName : tableNameArray) {
                String trimmedName = tableName.trim();
                if (!trimmedName.isEmpty()) {
                    tableNameList.add(trimmedName);
                }
            }
            
            if (tableNameList.isEmpty()) {
                result.put("success", false);
                result.put("message", "未找到有效的表名");
                return result;
            }
            
            List<String> successTables = new ArrayList<>();
            List<String> failedTables = new ArrayList<>();
            Map<String, Object> generatedFiles = new HashMap<>();
            
            // 逐个处理每个表
            for (String tableName : tableNameList) {
                try {
                    log.info("正在生成代码，表名：{}", tableName);
                    
                    // 获取表结构信息
                    List<ColumnInfo> columns = getMysqlTableColumns(jdbcUrl, username, password, tableName, schemaName);
                    
                    if (columns.isEmpty()) {
                        failedTables.add(tableName + " (表不存在或无法获取表结构)");
                        continue;
                    }
                    
                    // 去除表名前缀T，生成类名
                    String cleanTableName = tableName.startsWith("T") || tableName.startsWith("t") ? tableName.substring(2) : tableName;
                    String className = toCamelCase(cleanTableName, true);
                    
                    // 生成Model实体类
                    String modelCode = generateModelClass(className, tableName, columns, packageName);
                    
                    // 生成Mapper接口
                    String mapperCode = generateMapperInterface(className, columns, packageName);
                    
                    // 生成XML映射文件
                    String xmlCode = generateXmlMapper(className, tableName, columns, packageName);
                    
                    // 保存到文件
                    String basePath = "src/main/java/" + packageName.replace(".", "/");
                    String resourcePath = "src/main/resources/mapper";
                    
                    saveToFile(basePath + "/model/" + className + ".java", modelCode);
                    saveToFile(basePath + "/mapper/" + className + "Mapper.java", mapperCode);
                    saveToFile(resourcePath + "/" + className + "Mapper.xml", xmlCode);
                    
                    // 记录生成的文件信息
                    Map<String, String> tableFiles = new HashMap<>();
                    tableFiles.put("modelCode", modelCode);
                    tableFiles.put("mapperCode", mapperCode);
                    tableFiles.put("xmlCode", xmlCode);
                    tableFiles.put("className", className);
                    generatedFiles.put(tableName, tableFiles);
                    
                    successTables.add(tableName);
                    log.info("表 {} 代码生成成功", tableName);
                    
                } catch (Exception e) {
                    failedTables.add(tableName + " (" + e.getMessage() + ")");
                    log.error("表 {} 代码生成失败", tableName, e);
                }
            }
            
            if (successTables.isEmpty()) {
                result.put("success", false);
                result.put("message", "所有表都生成失败");
                result.put("failedTables", failedTables);
                return result;
            }
            
            result.put("success", true);
            result.put("message", String.format("代码生成完成，成功：%d个，失败：%d个", 
                      successTables.size(), failedTables.size()));
            result.put("totalTables", tableNameList.size());
            result.put("successTables", successTables);
            result.put("successCount", successTables.size());
            result.put("failedTables", failedTables);
            result.put("failedCount", failedTables.size());
            result.put("generatedFiles", generatedFiles);
            result.put("packageName", packageName);
            
        } catch (Exception e) {
            log.error("批量代码生成失败", e);
            result.put("success", false);
            result.put("message", "批量代码生成失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 获取表的列信息（原方法，保持兼容性）
     */
    private List<ColumnInfo> getTableColumns(String jdbcUrl, String username, String password, String tableName) 
            throws SQLException {
        List<ColumnInfo> columns = new ArrayList<>();
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            DatabaseMetaData metaData = conn.getMetaData();
            
            // 获取列信息
            try (ResultSet rs = metaData.getColumns(null, null, tableName, null)) {
                while (rs.next()) {
                    ColumnInfo column = new ColumnInfo();
                    column.setColumnName(rs.getString("COLUMN_NAME"));
                    column.setDataType(rs.getInt("DATA_TYPE"));
                    column.setTypeName(rs.getString("TYPE_NAME"));
                    column.setColumnSize(rs.getInt("COLUMN_SIZE"));
                    column.setNullable(rs.getInt("NULLABLE") == DatabaseMetaData.columnNullable);
                    column.setRemarks(rs.getString("REMARKS"));
                    column.setDefaultValue(rs.getString("COLUMN_DEF"));
                    columns.add(column);
                }
            }
            
            // 获取主键信息
            try (ResultSet rs = metaData.getPrimaryKeys(null, null, tableName)) {
                Set<String> primaryKeys = new HashSet<>();
                while (rs.next()) {
                    primaryKeys.add(rs.getString("COLUMN_NAME"));
                }
                
                for (ColumnInfo column : columns) {
                    if (primaryKeys.contains(column.getColumnName())) {
                        column.setPrimaryKey(true);
                    }
                }
            }
        }
        
        return columns;
    }
    
    /**
     * 获取MySQL表的列信息
     */
    private List<ColumnInfo> getMysqlTableColumns(String jdbcUrl, String username, String password, 
                                                  String tableName, String schemaName) throws SQLException {
        List<ColumnInfo> columns = new ArrayList<>();
        
        try {
            // 显式加载MySQL驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            try {
                // 尝试旧版本驱动
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e2) {
                throw new SQLException("MySQL驱动未找到，请检查依赖配置", e2);
            }
        }
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // 使用MySQL特定的查询来获取列信息
            String sql = "SELECT " +
                        "    COLUMN_NAME, " +
                        "    DATA_TYPE, " +
                        "    COLUMN_TYPE, " +
                        "    IS_NULLABLE, " +
                        "    COLUMN_DEFAULT, " +
                        "    COLUMN_COMMENT, " +
                        "    COLUMN_KEY, " +
                        "    EXTRA, " +
                        "    ORDINAL_POSITION, " +
                        "    CHARACTER_MAXIMUM_LENGTH, " +
                        "    NUMERIC_PRECISION, " +
                        "    NUMERIC_SCALE " +
                        "FROM INFORMATION_SCHEMA.COLUMNS " +
                        "WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ? " +
                        "ORDER BY ORDINAL_POSITION";
            
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, schemaName);
                stmt.setString(2, tableName);
                
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        ColumnInfo column = new ColumnInfo();
                        column.setColumnName(rs.getString("COLUMN_NAME"));
                        column.setTypeName(rs.getString("DATA_TYPE"));
                        column.setColumnSize(rs.getInt("CHARACTER_MAXIMUM_LENGTH"));
                        column.setNullable("YES".equals(rs.getString("IS_NULLABLE")));
                        column.setRemarks(rs.getString("COLUMN_COMMENT"));
                        column.setPrimaryKey("PRI".equals(rs.getString("COLUMN_KEY")));
                        
                        // 处理默认值和自增信息
                        String columnDefault = rs.getString("COLUMN_DEFAULT");
                        String extra = rs.getString("EXTRA");
                        if (extra != null && extra.toLowerCase().contains("auto_increment")) {
                            column.setDefaultValue("auto_increment");
                        } else {
                            column.setDefaultValue(columnDefault);
                        }
                        
                        // 设置JDBC数据类型
                        String dataType = rs.getString("DATA_TYPE").toLowerCase();
                        column.setDataType(getMysqlJdbcType(dataType));
                        
                        columns.add(column);
                    }
                }
            }
        }
        
        return columns;
    }
    
    /**
     * 获取MySQL数据类型对应的JDBC类型
     */
    private int getMysqlJdbcType(String mysqlType) {
        switch (mysqlType.toLowerCase()) {
            case "tinyint":
                return Types.TINYINT;
            case "smallint":
                return Types.SMALLINT;
            case "mediumint":
            case "int":
            case "integer":
                return Types.INTEGER;
            case "bigint":
                return Types.BIGINT;
            case "float":
                return Types.FLOAT;
            case "double":
                return Types.DOUBLE;
            case "decimal":
            case "numeric":
                return Types.DECIMAL;
            case "char":
                return Types.CHAR;
            case "varchar":
                return Types.VARCHAR;
            case "text":
            case "tinytext":
            case "mediumtext":
            case "longtext":
                return Types.LONGVARCHAR;
            case "date":
                return Types.DATE;
            case "time":
                return Types.TIME;
            case "datetime":
            case "timestamp":
                return Types.TIMESTAMP;
            case "bit":
                return Types.BIT;
            case "binary":
            case "varbinary":
                return Types.VARBINARY;
            case "blob":
            case "tinyblob":
            case "mediumblob":
            case "longblob":
                return Types.BLOB;
            case "json":
                return Types.LONGVARCHAR;
            default:
                return Types.VARCHAR;
        }
    }
    
    /**
     * 生成Model实体类
     */
    private String generateModelClass(String className, String tableName, List<ColumnInfo> columns, String packageName) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("package ").append(packageName).append(".model;\n\n");
        
        // 导入必要的包
        sb.append("import lombok.Data;\n");
        sb.append("import lombok.EqualsAndHashCode;\n");
        sb.append("import lombok.experimental.Accessors;\n");
        
        // 根据字段类型导入相应的包
        boolean needDate = false;
        boolean needBigDecimal = false;
        
        for (ColumnInfo column : columns) {
            String javaType = getJavaType(column);
            if ("Date".equals(javaType)) {
                needDate = true;
            } else if ("BigDecimal".equals(javaType)) {
                needBigDecimal = true;
            }
        }
        
        if (needDate) {
            sb.append("import java.util.Date;\n");
        }
        if (needBigDecimal) {
            sb.append("import java.math.BigDecimal;\n");
        }
        
        sb.append("\n");
        
        // 类注释
        sb.append("/**\n");
        sb.append(" * ").append(className).append("实体类\n");
        sb.append(" * 对应数据库表：").append(tableName).append("\n");
        sb.append(" * 自动生成，请勿手动修改\n");
        sb.append(" */\n");
        
        // Lombok注解
        sb.append("@Data\n");
        sb.append("@EqualsAndHashCode(callSuper = false)\n");
        sb.append("@Accessors(chain = true)\n");
        
        // 类定义
        sb.append("public class ").append(className).append(" {\n\n");
        
        // 生成字段
        for (ColumnInfo column : columns) {
            if (column.getRemarks() != null && !column.getRemarks().trim().isEmpty()) {
                sb.append("    /**\n");
                sb.append("     * ").append(column.getRemarks()).append("\n");
                sb.append("     */\n");
            }
            
            sb.append("    private ").append(getJavaType(column)).append(" ")
              .append(toPropertyName(column.getColumnName())).append(";\n\n");
        }
        
        sb.append("}\n");
        
        return sb.toString();
    }
    
    /**
     * 生成Mapper接口
     */
    private String generateMapperInterface(String className, List<ColumnInfo> columns, String packageName) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("package ").append(packageName).append(".mapper;\n\n");
        
        sb.append("import ").append(packageName).append(".model.").append(className).append(";\n");
        sb.append("import org.apache.ibatis.annotations.Mapper;\n");
        sb.append("import org.apache.ibatis.annotations.Param;\n");
        sb.append("import java.util.List;\n");
        sb.append("import java.util.Map;\n\n");
        
        // 接口注释
        sb.append("/**\n");
        sb.append(" * ").append(className).append("Mapper接口\n");
        sb.append(" * 自动生成，请勿手动修改\n");
        sb.append(" */\n");
        
        sb.append("@Mapper\n");
        sb.append("public interface ").append(className).append("Mapper {\n\n");
        
        // 获取主键字段
        ColumnInfo primaryKey = columns.stream()
                .filter(ColumnInfo::isPrimaryKey)
                .findFirst()
                .orElse(null);
        
        String pkType = primaryKey != null ? getJavaType(primaryKey) : "Long";
        String pkField = primaryKey != null ? toPropertyName(primaryKey.getColumnName()) : "id";
        
        // 基础CRUD方法
        sb.append("    /**\n");
        sb.append("     * 根据主键查询\n");
        sb.append("     */\n");
        sb.append("    ").append(className).append(" selectByPrimaryKey(@Param(\"").append(pkField).append("\") ").append(pkType).append(" ").append(pkField).append(");\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 查询所有记录\n");
        sb.append("     */\n");
        sb.append("    List<").append(className).append("> selectAll();\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 根据条件查询\n");
        sb.append("     */\n");
        sb.append("    List<").append(className).append("> selectByCondition(@Param(\"condition\") Map<String, Object> condition);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 根据条件统计数量\n");
        sb.append("     */\n");
        sb.append("    int countByCondition(@Param(\"condition\") Map<String, Object> condition);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 插入记录\n");
        sb.append("     */\n");
        sb.append("    int insert(").append(className).append(" record);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 选择性插入记录\n");
        sb.append("     */\n");
        sb.append("    int insertSelective(").append(className).append(" record);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 根据主键更新\n");
        sb.append("     */\n");
        sb.append("    int updateByPrimaryKey(").append(className).append(" record);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 根据主键选择性更新\n");
        sb.append("     */\n");
        sb.append("    int updateByPrimaryKeySelective(").append(className).append(" record);\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 根据主键删除\n");
        sb.append("     */\n");
        sb.append("    int deleteByPrimaryKey(@Param(\"").append(pkField).append("\") ").append(pkType).append(" ").append(pkField).append(");\n\n");
        
        sb.append("    /**\n");
        sb.append("     * 批量删除\n");
        sb.append("     */\n");
        sb.append("    int deleteByIds(@Param(\"ids\") List<").append(pkType).append("> ids);\n\n");
        
        sb.append("}\n");
        
        return sb.toString();
    }
    
    /**
     * 生成XML映射文件
     */
    private String generateXmlMapper(String className, String tableName, List<ColumnInfo> columns, String packageName) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n");
        sb.append("<mapper namespace=\"").append(packageName).append(".mapper.").append(className).append("Mapper\">\n\n");
        
        // ResultMap
        sb.append("    <!-- 通用查询映射结果 -->\n");
        sb.append("    <resultMap id=\"BaseResultMap\" type=\"").append(packageName).append(".model.").append(className).append("\">\n");
        
        // 先输出所有主键字段（使用id标签）
        for (ColumnInfo column : columns) {
            if (column.isPrimaryKey()) {
                sb.append("        <id column=\"").append(column.getColumnName())
                  .append("\" jdbcType=\"").append(getJdbcType(column))
                  .append("\" property=\"").append(toPropertyName(column.getColumnName()))
                  .append("\" />\n");
            }
        }
        
        // 再输出所有非主键字段（使用result标签）
        for (ColumnInfo column : columns) {
            if (!column.isPrimaryKey()) {
                sb.append("        <result column=\"").append(column.getColumnName())
                  .append("\" jdbcType=\"").append(getJdbcType(column))
                  .append("\" property=\"").append(toPropertyName(column.getColumnName()))
                  .append("\" />\n");
            }
        }
        
        sb.append("    </resultMap>\n\n");
        
        // Base Column List
        sb.append("    <!-- 通用查询结果列 -->\n");
        sb.append("    <sql id=\"Base_Column_List\">\n");
        sb.append("        ");
        for (int i = 0; i < columns.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(columns.get(i).getColumnName());
        }
        sb.append("\n    </sql>\n\n");
        
        // 获取主键信息
        ColumnInfo primaryKey = columns.stream()
                .filter(ColumnInfo::isPrimaryKey)
                .findFirst()
                .orElse(null);
        
        String pkColumn = primaryKey != null ? primaryKey.getColumnName() : "id";
        String pkField = primaryKey != null ? toPropertyName(primaryKey.getColumnName()) : "id";
        
        // 查询方法
        sb.append("    <!-- 根据主键查询 -->\n");
        sb.append("    <select id=\"selectByPrimaryKey\" resultMap=\"BaseResultMap\">\n");
        sb.append("        SELECT\n");
        sb.append("        <include refid=\"Base_Column_List\" />\n");
        sb.append("        FROM ").append(tableName).append("\n");
        sb.append("        WHERE ").append(pkColumn).append(" = #{").append(pkField).append("}\n");
        sb.append("    </select>\n\n");
        
        sb.append("    <!-- 查询所有记录 -->\n");
        sb.append("    <select id=\"selectAll\" resultMap=\"BaseResultMap\">\n");
        sb.append("        SELECT\n");
        sb.append("        <include refid=\"Base_Column_List\" />\n");
        sb.append("        FROM ").append(tableName).append("\n");
        sb.append("        ORDER BY ").append(pkColumn).append(" DESC\n");
        sb.append("    </select>\n\n");
        
        sb.append("    <!-- 根据条件查询 -->\n");
        sb.append("    <select id=\"selectByCondition\" resultMap=\"BaseResultMap\">\n");
        sb.append("        SELECT\n");
        sb.append("        <include refid=\"Base_Column_List\" />\n");
        sb.append("        FROM ").append(tableName).append("\n");
        sb.append("        <where>\n");
        
        for (ColumnInfo column : columns) {
            String property = toPropertyName(column.getColumnName());
            sb.append("            <if test=\"condition.").append(property).append(" != null\">\n");
            sb.append("                AND ").append(column.getColumnName()).append(" = #{condition.").append(property).append("}\n");
            sb.append("            </if>\n");
        }
        
        sb.append("        </where>\n");
        sb.append("        ORDER BY ").append(pkColumn).append(" DESC\n");
        sb.append("    </select>\n\n");
        
        sb.append("    <!-- 根据条件统计数量 -->\n");
        sb.append("    <select id=\"countByCondition\" resultType=\"int\">\n");
        sb.append("        SELECT COUNT(*)\n");
        sb.append("        FROM ").append(tableName).append("\n");
        sb.append("        <where>\n");
        
        for (ColumnInfo column : columns) {
            String property = toPropertyName(column.getColumnName());
            sb.append("            <if test=\"condition.").append(property).append(" != null\">\n");
            sb.append("                AND ").append(column.getColumnName()).append(" = #{condition.").append(property).append("}\n");
            sb.append("            </if>\n");
        }
        
        sb.append("        </where>\n");
        sb.append("    </select>\n\n");
        
        // 插入方法
        sb.append("    <!-- 插入记录 -->\n");
        sb.append("    <insert id=\"insert\"");
        if (primaryKey != null && isAutoIncrement(primaryKey)) {
            sb.append(" useGeneratedKeys=\"true\" keyProperty=\"").append(pkField).append("\"");
        }
        sb.append(">\n");
        sb.append("        INSERT INTO ").append(tableName).append("\n");
        sb.append("        (");
        for (int i = 0; i < columns.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(columns.get(i).getColumnName());
        }
        sb.append(")\n");
        sb.append("        VALUES\n");
        sb.append("        (");
        for (int i = 0; i < columns.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append("#{").append(toPropertyName(columns.get(i).getColumnName())).append("}");
        }
        sb.append(")\n");
        sb.append("    </insert>\n\n");
        
        // 选择性插入
        sb.append("    <!-- 选择性插入记录 -->\n");
        sb.append("    <insert id=\"insertSelective\"");
        if (primaryKey != null && isAutoIncrement(primaryKey)) {
            sb.append(" useGeneratedKeys=\"true\" keyProperty=\"").append(pkField).append("\"");
        }
        sb.append(">\n");
        sb.append("        INSERT INTO ").append(tableName).append("\n");
        sb.append("        <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n");
        
        for (ColumnInfo column : columns) {
            String property = toPropertyName(column.getColumnName());
            sb.append("            <if test=\"").append(property).append(" != null\">\n");
            sb.append("                ").append(column.getColumnName()).append(",\n");
            sb.append("            </if>\n");
        }
        
        sb.append("        </trim>\n");
        sb.append("        <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">\n");
        
        for (ColumnInfo column : columns) {
            String property = toPropertyName(column.getColumnName());
            sb.append("            <if test=\"").append(property).append(" != null\">\n");
            sb.append("                #{").append(property).append("},\n");
            sb.append("            </if>\n");
        }
        
        sb.append("        </trim>\n");
        sb.append("    </insert>\n\n");
        
        // 更新方法
        sb.append("    <!-- 根据主键更新 -->\n");
        sb.append("    <update id=\"updateByPrimaryKey\">\n");
        sb.append("        UPDATE ").append(tableName).append("\n");
        sb.append("        SET ");
        
        boolean first = true;
        for (ColumnInfo column : columns) {
            if (column.isPrimaryKey()) continue;
            
            if (!first) sb.append(",\n            ");
            sb.append(column.getColumnName()).append(" = #{").append(toPropertyName(column.getColumnName())).append("}");
            first = false;
        }
        
        sb.append("\n        WHERE ").append(pkColumn).append(" = #{").append(pkField).append("}\n");
        sb.append("    </update>\n\n");
        
        // 选择性更新
        sb.append("    <!-- 根据主键选择性更新 -->\n");
        sb.append("    <update id=\"updateByPrimaryKeySelective\">\n");
        sb.append("        UPDATE ").append(tableName).append("\n");
        sb.append("        <set>\n");
        
        for (ColumnInfo column : columns) {
            if (column.isPrimaryKey()) continue;
            
            String property = toPropertyName(column.getColumnName());
            sb.append("            <if test=\"").append(property).append(" != null\">\n");
            sb.append("                ").append(column.getColumnName()).append(" = #{").append(property).append("},\n");
            sb.append("            </if>\n");
        }
        
        sb.append("        </set>\n");
        sb.append("        WHERE ").append(pkColumn).append(" = #{").append(pkField).append("}\n");
        sb.append("    </update>\n\n");
        
        // 删除方法
        sb.append("    <!-- 根据主键删除 -->\n");
        sb.append("    <delete id=\"deleteByPrimaryKey\">\n");
        sb.append("        DELETE FROM ").append(tableName).append("\n");
        sb.append("        WHERE ").append(pkColumn).append(" = #{").append(pkField).append("}\n");
        sb.append("    </delete>\n\n");
        
        sb.append("    <!-- 批量删除 -->\n");
        sb.append("    <delete id=\"deleteByIds\">\n");
        sb.append("        DELETE FROM ").append(tableName).append("\n");
        sb.append("        WHERE ").append(pkColumn).append(" IN\n");
        sb.append("        <foreach item=\"id\" collection=\"ids\" open=\"(\" separator=\",\" close=\")\">\n");
        sb.append("            #{id}\n");
        sb.append("        </foreach>\n");
        sb.append("    </delete>\n\n");
        
        sb.append("</mapper>\n");
        
        return sb.toString();
    }
    
    /**
     * 保存内容到文件
     */
    private void saveToFile(String filePath, String content) throws IOException {
        File file = new File(filePath);
        
        // 创建目录
        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }
        
        // 写入文件
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
        
        log.info("文件已生成：{}", filePath);
    }
    
    /**
     * 下划线转驼峰
     */
    private String toCamelCase(String str, boolean firstUpperCase) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean nextUpperCase = firstUpperCase;
        
        for (char c : str.toCharArray()) {
            if (c == '_') {
                nextUpperCase = true;
            } else {
                if (nextUpperCase) {
                    sb.append(Character.toUpperCase(c));
                    nextUpperCase = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        
        return sb.toString();
    }
    
    /**
     * 生成属性名（去除f前缀并转驼峰）
     */
    private String toPropertyName(String columnName) {
        if (columnName == null || columnName.isEmpty()) {
            return columnName;
        }
        
        // 去除f前缀（如果存在）
        String cleanColumnName = columnName;
//        if (columnName.toLowerCase().startsWith("f") && columnName.length() > 1 && Character.isUpperCase(columnName.charAt(1))) {
        if (columnName.toLowerCase().startsWith("f") && columnName.length() > 1) {
            cleanColumnName = columnName.substring(1);
        } else if (columnName.toLowerCase().startsWith("f_")) {
            cleanColumnName = columnName.substring(2);
        }
        
        return toCamelCase(cleanColumnName, false);
    }
    
    /**
     * 获取Java类型
     */
    private String getJavaType(ColumnInfo column) {
        switch (column.getDataType()) {
            case Types.TINYINT:
            case Types.SMALLINT:
            case Types.INTEGER:
                return "Integer";
            case Types.BIGINT:
                return "Long";
            case Types.FLOAT:
                return "Float";
            case Types.DOUBLE:
                return "Double";
            case Types.DECIMAL:
            case Types.NUMERIC:
                return "BigDecimal";
            case Types.CHAR:
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
            case Types.NCHAR:
            case Types.NVARCHAR:
            case Types.LONGNVARCHAR:
                return "String";
            case Types.DATE:
            case Types.TIME:
            case Types.TIMESTAMP:
                return "Date";
            case Types.BOOLEAN:
            case Types.BIT:
                return "Boolean";
            case Types.BLOB:
            case Types.LONGVARBINARY:
            case Types.VARBINARY:
                return "byte[]";
            default:
                return "String";
        }
    }
    
    /**
     * 获取JDBC类型
     */
    private String getJdbcType(ColumnInfo column) {
        switch (column.getDataType()) {
            case Types.TINYINT:
                return "TINYINT";
            case Types.SMALLINT:
                return "SMALLINT";
            case Types.INTEGER:
                return "INTEGER";
            case Types.BIGINT:
                return "BIGINT";
            case Types.FLOAT:
                return "FLOAT";
            case Types.DOUBLE:
                return "DOUBLE";
            case Types.DECIMAL:
            case Types.NUMERIC:
                return "DECIMAL";
            case Types.CHAR:
                return "CHAR";
            case Types.VARCHAR:
                return "VARCHAR";
            case Types.LONGVARCHAR:
                return "LONGVARCHAR";
            case Types.DATE:
                return "DATE";
            case Types.TIME:
                return "TIME";
            case Types.TIMESTAMP:
                return "TIMESTAMP";
            case Types.BOOLEAN:
            case Types.BIT:
                return "BIT";
            case Types.BLOB:
                return "BLOB";
            case Types.LONGVARBINARY:
                return "LONGVARBINARY";
            case Types.VARBINARY:
                return "VARBINARY";
            default:
                return "VARCHAR";
        }
    }
    
    /**
     * 判断是否自增字段
     */
    private boolean isAutoIncrement(ColumnInfo column) {
        // 对于MySQL，检查默认值或者主键且为整型
        if (column.getDefaultValue() != null && column.getDefaultValue().toLowerCase().contains("auto_increment")) {
            return true;
        }
        // 简单判断：主键且为整型
        return column.isPrimaryKey() && 
               (column.getDataType() == Types.INTEGER || column.getDataType() == Types.BIGINT || column.getDataType() == Types.TINYINT);
    }
    
    /**
     * 重复字符串（Java 8兼容）
     */
    private String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    
    /**
     * 清理PostgreSQL默认值中的类型转换
     */
    private String cleanPostgreSqlDefault(String defaultValue) {
        if (defaultValue == null) {
            return null;
        }
        
        String cleaned = defaultValue.trim();
        
        // 去除常见的PostgreSQL类型转换
        cleaned = cleaned.replaceAll("::bpchar", "");
        cleaned = cleaned.replaceAll("::character varying", "");
        cleaned = cleaned.replaceAll("::varchar", "");
        cleaned = cleaned.replaceAll("::text", "");
        cleaned = cleaned.replaceAll("::char", "");
        cleaned = cleaned.replaceAll("::character", "");
        cleaned = cleaned.replaceAll("::bigint", "");
        cleaned = cleaned.replaceAll("::integer", "");
        cleaned = cleaned.replaceAll("::int", "");
        cleaned = cleaned.replaceAll("::smallint", "");
        cleaned = cleaned.replaceAll("::numeric", "");
        cleaned = cleaned.replaceAll("::decimal", "");
        cleaned = cleaned.replaceAll("::real", "");
        cleaned = cleaned.replaceAll("::double precision", "");
        cleaned = cleaned.replaceAll("::boolean", "");
        cleaned = cleaned.replaceAll("::bool", "");
        cleaned = cleaned.replaceAll("::timestamp", "");
        cleaned = cleaned.replaceAll("::timestamptz", "");
        cleaned = cleaned.replaceAll("::date", "");
        cleaned = cleaned.replaceAll("::time", "");
        cleaned = cleaned.replaceAll("::uuid", "");
        cleaned = cleaned.replaceAll("::json", "");
        cleaned = cleaned.replaceAll("::jsonb", "");
        
        // 使用正则表达式去除其他可能的类型转换 (::type_name)
        cleaned = cleaned.replaceAll("::[a-zA-Z_][a-zA-Z0-9_]*", "");
        
        // 去除多余的空格
        cleaned = cleaned.replaceAll("\\s+", " ").trim();
        
        return cleaned;
    }
    
    /**
     * 列信息类
     */
    public static class ColumnInfo {
        private String columnName;
        private int dataType;
        private String typeName;
        private int columnSize;
        private boolean nullable;
        private boolean primaryKey;
        private String remarks;
        private String defaultValue;
        
        // Getters and Setters
        public String getColumnName() { return columnName; }
        public void setColumnName(String columnName) { this.columnName = columnName; }
        
        public int getDataType() { return dataType; }
        public void setDataType(int dataType) { this.dataType = dataType; }
        
        public String getTypeName() { return typeName; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        
        public int getColumnSize() { return columnSize; }
        public void setColumnSize(int columnSize) { this.columnSize = columnSize; }
        
        public boolean isNullable() { return nullable; }
        public void setNullable(boolean nullable) { this.nullable = nullable; }
        
        public boolean isPrimaryKey() { return primaryKey; }
        public void setPrimaryKey(boolean primaryKey) { this.primaryKey = primaryKey; }
        
        public String getRemarks() { return remarks; }
        public void setRemarks(String remarks) { this.remarks = remarks; }
        
        public String getDefaultValue() { return defaultValue; }
        public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }
    }
    
    /**
     * 生成PostgreSQL表的DDL语句
     */
    private String generatePostgreSqlDdl(String jdbcUrl, String username, String password, 
                                        String tableName, String schemaName) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        try {
            // 显式加载PostgreSQL驱动
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL驱动未找到，请检查依赖配置", e);
        }
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // 1. 获取表基本信息和注释
            String tableComment = getTableComment(conn, tableName, schemaName);
            
            // 2. 获取列信息
            List<PostgreSqlColumnInfo> columns = getPostgreSqlTableColumns(conn, tableName, schemaName);
            
            if (columns.isEmpty()) {
                return null;
            }
            
            // 3. 生成CREATE TABLE语句
            ddl.append("-- DDL for table: ").append(schemaName).append(".").append(tableName).append("\n");
            ddl.append("-- Generated at: ").append(new java.util.Date()).append("\n\n");
            
            ddl.append("CREATE TABLE ").append(schemaName).append(".").append(tableName).append(" (\n");
            
            // 生成列定义
            for (int i = 0; i < columns.size(); i++) {
                PostgreSqlColumnInfo column = columns.get(i);
                ddl.append("    ").append(column.getColumnName()).append(" ")
                   .append(column.getDataType());
                
                // 添加长度限制（排除bigint和int类型）
                String dataType = column.getDataType().toLowerCase();
                if (!dataType.contains("bigint") && !dataType.contains("int") && !dataType.contains("serial")) {
                    if (column.getCharacterMaximumLength() != null && column.getCharacterMaximumLength() > 0) {
                        ddl.append("(").append(column.getCharacterMaximumLength()).append(")");
                    } else if (column.getNumericPrecision() != null && column.getNumericScale() != null 
                               && !dataType.contains("numeric") && !dataType.contains("decimal")) {
                        // 只对非numeric/decimal类型添加精度
                        ddl.append("(").append(column.getNumericPrecision()).append(",")
                           .append(column.getNumericScale()).append(")");
                    } else if (dataType.contains("numeric") || dataType.contains("decimal")) {
                        // numeric和decimal类型需要精度
                        if (column.getNumericPrecision() != null && column.getNumericPrecision() > 0) {
                            ddl.append("(").append(column.getNumericPrecision());
                            if (column.getNumericScale() != null && column.getNumericScale() > 0) {
                                ddl.append(",").append(column.getNumericScale());
                            }
                            ddl.append(")");
                        }
                    }
                }
                
                // 添加NOT NULL约束
                if (!column.isNullable()) {
                    ddl.append(" NOT NULL");
                }
                
                // 添加默认值（清理PostgreSQL类型转换）
                if (column.getColumnDefault() != null && !column.getColumnDefault().trim().isEmpty()) {
                    String defaultValue = cleanPostgreSqlDefault(column.getColumnDefault());
                    ddl.append(" DEFAULT ").append(defaultValue);
                }
                
                if (i < columns.size() - 1) {
                    ddl.append(",");
                }
                ddl.append("\n");
            }
            
            // 4. 获取并添加主键约束
            List<String> primaryKeys = getPrimaryKeys(conn, tableName, schemaName);
            if (!primaryKeys.isEmpty()) {
                ddl.append(",\n    CONSTRAINT ").append(tableName).append("_pkey PRIMARY KEY (")
                   .append(String.join(", ", primaryKeys)).append(")\n");
            }
            
            ddl.append(");\n\n");
            
            // 5. 添加表注释
            if (tableComment != null && !tableComment.trim().isEmpty()) {
                ddl.append("COMMENT ON TABLE ").append(schemaName).append(".").append(tableName)
                   .append(" IS '").append(tableComment.replace("'", "''")).append("';\n\n");
            }
            
            // 6. 添加列注释
            for (PostgreSqlColumnInfo column : columns) {
                if (column.getColumnComment() != null && !column.getColumnComment().trim().isEmpty()) {
                    ddl.append("COMMENT ON COLUMN ").append(schemaName).append(".").append(tableName)
                       .append(".").append(column.getColumnName())
                       .append(" IS '").append(column.getColumnComment().replace("'", "''")).append("';\n");
                }
            }
            
            // 7. 获取并添加索引
            List<String> indexes = getTableIndexes(conn, tableName, schemaName);
            if (!indexes.isEmpty()) {
                ddl.append("\n-- Indexes\n");
                for (String index : indexes) {
                    ddl.append(index).append("\n");
                }
            }
            
            // 8. 获取并添加外键约束
            List<String> foreignKeys = getForeignKeys(conn, tableName, schemaName);
            if (!foreignKeys.isEmpty()) {
                ddl.append("\n-- Foreign Keys\n");
                for (String fk : foreignKeys) {
                    ddl.append(fk).append("\n");
                }
            }
        }
        
        return ddl.toString();
    }
    
    /**
     * 获取PostgreSQL表的列信息
     */
    private List<PostgreSqlColumnInfo> getPostgreSqlTableColumns(Connection conn, String tableName, String schemaName) 
            throws SQLException {
        List<PostgreSqlColumnInfo> columns = new ArrayList<>();
        
        String sql = "SELECT " +
                    "    c.column_name, " +
                    "    c.data_type, " +
                    "    c.character_maximum_length, " +
                    "    c.numeric_precision, " +
                    "    c.numeric_scale, " +
                    "    c.is_nullable, " +
                    "    c.column_default, " +
                    "    c.ordinal_position, " +
                    "    col_description(pgc.oid, c.ordinal_position) as column_comment " +
                    "FROM information_schema.columns c " +
                    "LEFT JOIN pg_class pgc ON pgc.relname = c.table_name " +
                    "LEFT JOIN pg_namespace pgn ON pgn.oid = pgc.relnamespace AND pgn.nspname = c.table_schema " +
                    "WHERE c.table_name = ? AND c.table_schema = ? " +
                    "ORDER BY c.ordinal_position";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            stmt.setString(2, schemaName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    PostgreSqlColumnInfo column = new PostgreSqlColumnInfo();
                    column.setColumnName(rs.getString("column_name"));
                    column.setDataType(rs.getString("data_type"));
                    column.setCharacterMaximumLength(rs.getObject("character_maximum_length", Integer.class));
                    column.setNumericPrecision(rs.getObject("numeric_precision", Integer.class));
                    column.setNumericScale(rs.getObject("numeric_scale", Integer.class));
                    column.setNullable("YES".equals(rs.getString("is_nullable")));
                    column.setColumnDefault(rs.getString("column_default"));
                    column.setOrdinalPosition(rs.getInt("ordinal_position"));
                    column.setColumnComment(rs.getString("column_comment"));
                    columns.add(column);
                }
            }
        }
        
        return columns;
    }
    
    /**
     * 获取表注释
     */
    private String getTableComment(Connection conn, String tableName, String schemaName) throws SQLException {
        String sql = "SELECT obj_description(c.oid) as table_comment " +
                    "FROM pg_class c " +
                    "JOIN pg_namespace n ON n.oid = c.relnamespace " +
                    "WHERE c.relname = ? AND n.nspname = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            stmt.setString(2, schemaName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("table_comment");
                }
            }
        }
        
        return null;
    }
    
    /**
     * 获取主键信息
     */
    private List<String> getPrimaryKeys(Connection conn, String tableName, String schemaName) throws SQLException {
        List<String> primaryKeys = new ArrayList<>();
        
        String sql = "SELECT a.attname " +
                    "FROM pg_index i " +
                    "JOIN pg_attribute a ON a.attrelid = i.indrelid AND a.attnum = ANY(i.indkey) " +
                    "WHERE i.indrelid = (SELECT oid FROM pg_class WHERE relname = ? AND relnamespace = " +
                    "    (SELECT oid FROM pg_namespace WHERE nspname = ?)) " +
                    "AND i.indisprimary " +
                    "ORDER BY a.attnum";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            stmt.setString(2, schemaName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    primaryKeys.add(rs.getString("attname"));
                }
            }
        }
        
        return primaryKeys;
    }
    
    /**
     * 获取表索引
     */
    private List<String> getTableIndexes(Connection conn, String tableName, String schemaName) throws SQLException {
        List<String> indexes = new ArrayList<>();
        
        String sql = "SELECT " +
                    "    i.relname as index_name, " +
                    "    am.amname as index_type, " +
                    "    idx.indisunique, " +
                    "    string_agg(a.attname, ', ' ORDER BY array_position(idx.indkey, a.attnum)) as index_columns " +
                    "FROM pg_index idx " +
                    "JOIN pg_class i ON i.oid = idx.indexrelid " +
                    "JOIN pg_class t ON t.oid = idx.indrelid " +
                    "JOIN pg_namespace n ON n.oid = t.relnamespace " +
                    "JOIN pg_am am ON i.relam = am.oid " +
                    "JOIN pg_attribute a ON a.attrelid = t.oid AND a.attnum = ANY(idx.indkey) " +
                    "WHERE t.relname = ? AND n.nspname = ? " +
                    "AND NOT idx.indisprimary " +
                    "AND a.attnum > 0 " +
                    "GROUP BY i.relname, am.amname, idx.indisunique " +
                    "ORDER BY i.relname";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            stmt.setString(2, schemaName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String indexName = rs.getString("index_name");
                    boolean isUnique = rs.getBoolean("indisunique");
                    String indexType = rs.getString("index_type");
                    String indexColumns = rs.getString("index_columns");
                    
                    // 如果获取不到索引字段，跳过该索引
                    if (indexColumns == null || indexColumns.trim().isEmpty()) {
                        log.warn("索引 {} 无法获取字段信息，跳过生成", indexName);
                        continue;
                    }
                    
                    StringBuilder indexDdl = new StringBuilder();
                    indexDdl.append("CREATE ");
                    if (isUnique) {
                        indexDdl.append("UNIQUE ");
                    }
                    indexDdl.append("INDEX ").append(indexName)
                           .append(" ON ").append(schemaName).append(".").append(tableName);
                    
                    if (!"btree".equals(indexType)) {
                        indexDdl.append(" USING ").append(indexType);
                    }
                    
                    indexDdl.append(" (").append(indexColumns).append(");");
                    
                    indexes.add(indexDdl.toString());
                }
            }
        } catch (SQLException e) {
            log.warn("获取表 {} 的索引信息失败: {}", tableName, e.getMessage());
            // 返回空列表而不是抛出异常
        }
        
        return indexes;
    }
    
    /**
     * 获取外键约束
     */
    private List<String> getForeignKeys(Connection conn, String tableName, String schemaName) throws SQLException {
        List<String> foreignKeys = new ArrayList<>();
        
        String sql = "SELECT " +
                    "    tc.constraint_name, " +
                    "    kcu.column_name, " +
                    "    ccu.table_schema AS foreign_table_schema, " +
                    "    ccu.table_name AS foreign_table_name, " +
                    "    ccu.column_name AS foreign_column_name, " +
                    "    rc.update_rule, " +
                    "    rc.delete_rule " +
                    "FROM information_schema.table_constraints AS tc " +
                    "JOIN information_schema.key_column_usage AS kcu " +
                    "    ON tc.constraint_name = kcu.constraint_name " +
                    "    AND tc.table_schema = kcu.table_schema " +
                    "JOIN information_schema.constraint_column_usage AS ccu " +
                    "    ON ccu.constraint_name = tc.constraint_name " +
                    "    AND ccu.table_schema = tc.table_schema " +
                    "JOIN information_schema.referential_constraints AS rc " +
                    "    ON tc.constraint_name = rc.constraint_name " +
                    "    AND tc.table_schema = rc.constraint_schema " +
                    "WHERE tc.constraint_type = 'FOREIGN KEY' " +
                    "AND tc.table_name = ? AND tc.table_schema = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tableName);
            stmt.setString(2, schemaName);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String constraintName = rs.getString("constraint_name");
                    String columnName = rs.getString("column_name");
                    String foreignTableSchema = rs.getString("foreign_table_schema");
                    String foreignTableName = rs.getString("foreign_table_name");
                    String foreignColumnName = rs.getString("foreign_column_name");
                    String updateRule = rs.getString("update_rule");
                    String deleteRule = rs.getString("delete_rule");
                    
                    StringBuilder fkDdl = new StringBuilder();
                    fkDdl.append("ALTER TABLE ").append(schemaName).append(".").append(tableName)
                         .append(" ADD CONSTRAINT ").append(constraintName)
                         .append(" FOREIGN KEY (").append(columnName).append(")")
                         .append(" REFERENCES ").append(foreignTableSchema).append(".").append(foreignTableName)
                         .append(" (").append(foreignColumnName).append(")");
                    
                    if (!"NO ACTION".equals(updateRule)) {
                        fkDdl.append(" ON UPDATE ").append(updateRule);
                    }
                    if (!"NO ACTION".equals(deleteRule)) {
                        fkDdl.append(" ON DELETE ").append(deleteRule);
                    }
                    
                    fkDdl.append(";");
                    foreignKeys.add(fkDdl.toString());
                }
            }
        }
        
        return foreignKeys;
    }
    
    /**
     * PostgreSQL列信息类
     */
    public static class PostgreSqlColumnInfo {
        private String columnName;
        private String dataType;
        private Integer characterMaximumLength;
        private Integer numericPrecision;
        private Integer numericScale;
        private boolean nullable;
        private String columnDefault;
        private int ordinalPosition;
        private String columnComment;
        
        // Getters and Setters
        public String getColumnName() { return columnName; }
        public void setColumnName(String columnName) { this.columnName = columnName; }
        
        public String getDataType() { return dataType; }
        public void setDataType(String dataType) { this.dataType = dataType; }
        
        public Integer getCharacterMaximumLength() { return characterMaximumLength; }
        public void setCharacterMaximumLength(Integer characterMaximumLength) { this.characterMaximumLength = characterMaximumLength; }
        
        public Integer getNumericPrecision() { return numericPrecision; }
        public void setNumericPrecision(Integer numericPrecision) { this.numericPrecision = numericPrecision; }
        
        public Integer getNumericScale() { return numericScale; }
        public void setNumericScale(Integer numericScale) { this.numericScale = numericScale; }
        
        public boolean isNullable() { return nullable; }
        public void setNullable(boolean nullable) { this.nullable = nullable; }
        
        public String getColumnDefault() { return columnDefault; }
        public void setColumnDefault(String columnDefault) { this.columnDefault = columnDefault; }
        
        public int getOrdinalPosition() { return ordinalPosition; }
        public void setOrdinalPosition(int ordinalPosition) { this.ordinalPosition = ordinalPosition; }
        
        public String getColumnComment() { return columnComment; }
        public void setColumnComment(String columnComment) { this.columnComment = columnComment; }
    }
    
    /**
     * 从PostgreSQL表生成MySQL DDL语句
     */
    private String generateMysqlDdlFromPostgreSql(String jdbcUrl, String username, String password, 
                                                 String tableName, String schemaName) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        try {
            // 显式加载PostgreSQL驱动
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL驱动未找到，请检查依赖配置", e);
        }
        
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // 1. 获取表基本信息和注释
            String tableComment = getTableComment(conn, tableName, schemaName);
            
            // 2. 获取列信息
            List<PostgreSqlColumnInfo> columns = getPostgreSqlTableColumns(conn, tableName, schemaName);
            
            if (columns.isEmpty()) {
                return null;
            }
            
            // 3. 生成CREATE TABLE语句
            ddl.append("-- DDL for table: ").append(tableName).append(" (Converted from PostgreSQL)\n");
            ddl.append("-- Generated at: ").append(new java.util.Date()).append("\n\n");
            
            ddl.append("CREATE TABLE `").append(tableName).append("` (\n");
            
            // 生成列定义
            for (int i = 0; i < columns.size(); i++) {
                PostgreSqlColumnInfo column = columns.get(i);
                ddl.append("    `").append(column.getColumnName()).append("` ")
                   .append(convertPostgreSqlTypeToMysql(column));
                
                if (i < columns.size() - 1) {
                    ddl.append(",");
                }
                ddl.append("\n");
            }
            
            // 4. 获取并添加主键约束
            List<String> primaryKeys = getPrimaryKeys(conn, tableName, schemaName);
            if (!primaryKeys.isEmpty()) {
                ddl.append(",\n    PRIMARY KEY (`").append(String.join("`, `", primaryKeys)).append("`)");
            }
            
            ddl.append("\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;\n\n");
            
            // 5. 添加表注释
            if (tableComment != null && !tableComment.trim().isEmpty()) {
                ddl.append("ALTER TABLE `").append(tableName).append("` COMMENT = '")
                   .append(tableComment.replace("'", "\\'")).append("';\n\n");
            }
            
            // 6. 添加列注释
            for (PostgreSqlColumnInfo column : columns) {
                if (column.getColumnComment() != null && !column.getColumnComment().trim().isEmpty()) {
                    ddl.append("ALTER TABLE `").append(tableName).append("` MODIFY COLUMN `")
                       .append(column.getColumnName()).append("` ")
                       .append(convertPostgreSqlTypeToMysql(column))
                       .append(" COMMENT '").append(column.getColumnComment().replace("'", "\\'")).append("';\n");
                }
            }
            
            // 7. 获取并添加索引
            List<String> indexes = getTableIndexes(conn, tableName, schemaName);
            if (!indexes.isEmpty()) {
                ddl.append("\n-- Indexes\n");
                for (String index : indexes) {
                    String mysqlIndex = convertPostgreSqlIndexToMysql(index, tableName);
                    if (mysqlIndex != null) {
                        ddl.append(mysqlIndex).append("\n");
                    }
                }
            }
            
            // 8. 获取并添加外键约束
            List<String> foreignKeys = getForeignKeys(conn, tableName, schemaName);
            if (!foreignKeys.isEmpty()) {
                ddl.append("\n-- Foreign Keys\n");
                for (String fk : foreignKeys) {
                    String mysqlFk = convertPostgreSqlForeignKeyToMysql(fk, tableName);
                    if (mysqlFk != null) {
                        ddl.append(mysqlFk).append("\n");
                    }
                }
            }
        }
        
        return ddl.toString();
    }
    
    /**
     * 将PostgreSQL数据类型转换为MySQL数据类型
     */
    private String convertPostgreSqlTypeToMysql(PostgreSqlColumnInfo column) {
        String dataType = column.getDataType().toLowerCase();
        StringBuilder mysqlType = new StringBuilder();
        
        switch (dataType) {
            case "bigint":
                mysqlType.append("BIGINT");
                break;
            case "integer":
            case "int":
                mysqlType.append("INT");
                break;
            case "smallint":
                mysqlType.append("SMALLINT");
                break;
            case "numeric":
            case "decimal":
                mysqlType.append("DECIMAL");
                if (column.getNumericPrecision() != null && column.getNumericPrecision() > 0) {
                    mysqlType.append("(").append(column.getNumericPrecision());
                    if (column.getNumericScale() != null && column.getNumericScale() > 0) {
                        mysqlType.append(",").append(column.getNumericScale());
                    }
                    mysqlType.append(")");
                }
                break;
            case "real":
                mysqlType.append("FLOAT");
                break;
            case "double precision":
                mysqlType.append("DOUBLE");
                break;
            case "character varying":
            case "varchar":
                mysqlType.append("VARCHAR");
                if (column.getCharacterMaximumLength() != null && column.getCharacterMaximumLength() > 0) {
                    mysqlType.append("(").append(column.getCharacterMaximumLength()).append(")");
                } else {
                    mysqlType.append("(255)");
                }
                break;
            case "character":
            case "char":
                mysqlType.append("CHAR");
                if (column.getCharacterMaximumLength() != null && column.getCharacterMaximumLength() > 0) {
                    mysqlType.append("(").append(column.getCharacterMaximumLength()).append(")");
                } else {
                    mysqlType.append("(1)");
                }
                break;
            case "text":
                mysqlType.append("TEXT");
                break;
            case "boolean":
                mysqlType.append("TINYINT(1)");
                break;
            case "date":
                mysqlType.append("DATE");
                break;
            case "time":
                mysqlType.append("TIME");
                break;
            case "timestamp":
            case "timestamptz":
                mysqlType.append("TIMESTAMP");
                break;
            case "uuid":
                mysqlType.append("CHAR(36)");
                break;
            case "json":
            case "jsonb":
                mysqlType.append("JSON");
                break;
            case "bytea":
                mysqlType.append("LONGBLOB");
                break;
            default:
                mysqlType.append("VARCHAR(255)");
                break;
        }
        
        // 添加NOT NULL约束
        if (!column.isNullable()) {
            mysqlType.append(" NOT NULL");
        }
        
        // 添加默认值
        if (column.getColumnDefault() != null && !column.getColumnDefault().trim().isEmpty()) {
            String defaultValue = cleanPostgreSqlDefault(column.getColumnDefault());
            // 处理特殊默认值
            if ("CURRENT_TIMESTAMP".equalsIgnoreCase(defaultValue)) {
                mysqlType.append(" DEFAULT CURRENT_TIMESTAMP");
            } else if ("true".equalsIgnoreCase(defaultValue) || "false".equalsIgnoreCase(defaultValue)) {
                mysqlType.append(" DEFAULT ").append("true".equalsIgnoreCase(defaultValue) ? "1" : "0");
            } else if (defaultValue.startsWith("'") && defaultValue.endsWith("'")) {
                mysqlType.append(" DEFAULT ").append(defaultValue);
            } else {
                mysqlType.append(" DEFAULT ").append(defaultValue);
            }
        }
        
        // 添加自增
        if (isAutoIncrementColumn(column)) {
            mysqlType.append(" AUTO_INCREMENT");
        }
        
        return mysqlType.toString();
    }
    
    /**
     * 判断是否为自增列
     */
    private boolean isAutoIncrementColumn(PostgreSqlColumnInfo column) {
        // 检查是否为序列类型或包含nextval
        if (column.getColumnDefault() != null && column.getColumnDefault().contains("nextval")) {
            return true;
        }
        
        // 检查数据类型是否为serial类型
        String dataType = column.getDataType().toLowerCase();
        return dataType.contains("serial");
    }
    
    /**
     * 将PostgreSQL索引转换为MySQL索引
     */
    private String convertPostgreSqlIndexToMysql(String postgreSqlIndex, String tableName) {
        try {
            // 解析PostgreSQL索引DDL
            if (postgreSqlIndex.contains("CREATE UNIQUE INDEX")) {
                // 唯一索引
                String indexName = extractIndexName(postgreSqlIndex);
                String columns = extractIndexColumns(postgreSqlIndex);
                return "CREATE UNIQUE INDEX `" + indexName + "` ON `" + tableName + "` (" + columns + ");";
            } else if (postgreSqlIndex.contains("CREATE INDEX")) {
                // 普通索引
                String indexName = extractIndexName(postgreSqlIndex);
                String columns = extractIndexColumns(postgreSqlIndex);
                return "CREATE INDEX `" + indexName + "` ON `" + tableName + "` (" + columns + ");";
            }
        } catch (Exception e) {
            log.warn("转换索引失败: {}", postgreSqlIndex, e);
        }
        return null;
    }
    
    /**
     * 提取索引名称
     */
    private String extractIndexName(String indexDdl) {
        // 简单的正则提取，可以根据需要优化
        int start = indexDdl.indexOf("INDEX ") + 6;
        int end = indexDdl.indexOf(" ON ");
        if (start > 5 && end > start) {
            return indexDdl.substring(start, end).trim();
        }
        return "idx_" + System.currentTimeMillis();
    }
    
    /**
     * 提取索引列
     */
    private String extractIndexColumns(String indexDdl) {
        int start = indexDdl.indexOf("(");
        int end = indexDdl.lastIndexOf(")");
        if (start > 0 && end > start) {
            String columns = indexDdl.substring(start + 1, end);
            // 转换为MySQL格式（添加反引号）
            return "`" + columns.replace(", ", "`, `") + "`";
        }
        return "";
    }
    
    /**
     * 将PostgreSQL外键转换为MySQL外键
     */
    private String convertPostgreSqlForeignKeyToMysql(String postgreSqlFk, String tableName) {
        try {
            // 解析PostgreSQL外键DDL
            if (postgreSqlFk.contains("FOREIGN KEY")) {
                // 提取外键信息
                String constraintName = extractConstraintName(postgreSqlFk);
                String columnName = extractFkColumnName(postgreSqlFk);
                String refTable = extractRefTable(postgreSqlFk);
                String refColumn = extractRefColumn(postgreSqlFk);
                String updateRule = extractUpdateRule(postgreSqlFk);
                String deleteRule = extractDeleteRule(postgreSqlFk);
                
                StringBuilder mysqlFk = new StringBuilder();
                mysqlFk.append("ALTER TABLE `").append(tableName).append("` ");
                mysqlFk.append("ADD CONSTRAINT `").append(constraintName).append("` ");
                mysqlFk.append("FOREIGN KEY (`").append(columnName).append("`) ");
                mysqlFk.append("REFERENCES `").append(refTable).append("` (`").append(refColumn).append("`)");
                
                if (updateRule != null && !"NO ACTION".equals(updateRule)) {
                    mysqlFk.append(" ON UPDATE ").append(updateRule);
                }
                if (deleteRule != null && !"NO ACTION".equals(deleteRule)) {
                    mysqlFk.append(" ON DELETE ").append(deleteRule);
                }
                
                mysqlFk.append(";");
                return mysqlFk.toString();
            }
        } catch (Exception e) {
            log.warn("转换外键失败: {}", postgreSqlFk, e);
        }
        return null;
    }
    
    /**
     * 提取约束名称
     */
    private String extractConstraintName(String fkDdl) {
        int start = fkDdl.indexOf("CONSTRAINT ") + 11;
        int end = fkDdl.indexOf(" FOREIGN KEY");
        if (start > 10 && end > start) {
            return fkDdl.substring(start, end).trim();
        }
        return "fk_" + System.currentTimeMillis();
    }
    
    /**
     * 提取外键列名
     */
    private String extractFkColumnName(String fkDdl) {
        int start = fkDdl.indexOf("FOREIGN KEY (") + 13;
        int end = fkDdl.indexOf(")", start);
        if (start > 12 && end > start) {
            return fkDdl.substring(start, end).trim();
        }
        return "";
    }
    
    /**
     * 提取引用表名
     */
    private String extractRefTable(String fkDdl) {
        int start = fkDdl.indexOf("REFERENCES ") + 11;
        int end = fkDdl.indexOf(" (", start);
        if (start > 10 && end > start) {
            String refTable = fkDdl.substring(start, end).trim();
            // 移除schema前缀
            if (refTable.contains(".")) {
                refTable = refTable.substring(refTable.lastIndexOf(".") + 1);
            }
            return refTable;
        }
        return "";
    }
    
    /**
     * 提取引用列名
     */
    private String extractRefColumn(String fkDdl) {
        int start = fkDdl.lastIndexOf("(") + 1;
        int end = fkDdl.lastIndexOf(")");
        if (start > 0 && end > start) {
            return fkDdl.substring(start, end).trim();
        }
        return "";
    }
    
    /**
     * 提取更新规则
     */
    private String extractUpdateRule(String fkDdl) {
        if (fkDdl.contains("ON UPDATE")) {
            int start = fkDdl.indexOf("ON UPDATE ") + 10;
            int end = fkDdl.indexOf(" ", start);
            if (end == -1) {
                end = fkDdl.indexOf(";", start);
            }
            if (start > 9 && end > start) {
                return fkDdl.substring(start, end).trim();
            }
        }
        return null;
    }
    
    /**
     * 提取删除规则
     */
    private String extractDeleteRule(String fkDdl) {
        if (fkDdl.contains("ON DELETE")) {
            int start = fkDdl.indexOf("ON DELETE ") + 10;
            int end = fkDdl.indexOf(" ", start);
            if (end == -1) {
                end = fkDdl.indexOf(";", start);
            }
            if (start > 9 && end > start) {
                return fkDdl.substring(start, end).trim();
            }
        }
        return null;
    }
}