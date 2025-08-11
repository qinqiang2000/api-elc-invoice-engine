package com.kingdee.fpy.controller;

import com.kingdee.fpy.service.CodeGeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 代码生成器控制器
 * 提供数据库代码生成的REST API接口
 */
@Slf4j
@RestController
@RequestMapping("/api/code-generator")
public class CodeGeneratorController {
//    devscm_test_up_pg_sys
    @Autowired
    private CodeGeneratorService codeGeneratorService;
    
    @Autowired
    private com.kingdee.fpy.util.SqlCommentProcessor sqlCommentProcessor;
    
    // PostgreSQL数据库配置常量
//    private static final String PG_JDBC_URL = "jdbc:postgresql://152.136.109.53:15432/template_piaozone";
//    private static final String PG_JDBC_URL = "jdbc:postgresql://172.18.9.62:5432/devscm_test_up_pg_taxc";
    private static final String PG_JDBC_URL = "jdbc:postgresql://172.18.9.62:5432/devscm_test_up_pg_sys";
//    private static final String PG_USERNAME = "postgres";
    private static final String PG_USERNAME = "mc_devscm_test_up_pg";
//    private static final String PG_PASSWORD = "piaozone@ec3hCV";
    private static final String PG_PASSWORD = "mc_devscm_test_up_pg";
    private static final String PG_SCHEMA_NAME = "public";
    
    // MySQL数据库配置常量
    private static final String MYSQL_JDBC_URL = "jdbc:mysql://jump-test.piaozone.com:3306";
    private static final String MYSQL_USERNAME = "rnd";
    private static final String MYSQL_PASSWORD = "ZaFOjoFp&SdB8bum";
    private static final String MYSQL_SCHEMA_NAME = "test_jin";
    
    /**
     * 生成代码
     * @param request 请求参数
     * @return 生成结果
     */
    @PostMapping("/generate")
    public Map<String, Object> generateCode(@RequestBody BatchExportDdlRequest request) {
        log.info("开始生成代码，表名：{}", request.getTableNames());
        
        try {
            // 参数校验
            if (request.getTableNames() == null || request.getTableNames().trim().isEmpty()) {
                return createErrorResponse("表名不能为空");
            }
            
            // 调用代码生成服务
            Map<String, Object> result = codeGeneratorService.generateCode(
                MYSQL_JDBC_URL,
                MYSQL_USERNAME,
                MYSQL_PASSWORD,
                request.getTableNames(),
                MYSQL_SCHEMA_NAME
            );
            
            log.info("代码生成完成，表名：{}，结果：{}", request.getTableNames(), result.get("success"));
            return result;
            
        } catch (Exception e) {
            log.error("代码生成失败", e);
            return createErrorResponse("代码生成失败：" + e.getMessage());
        }
    }
    
    /**
     * 批量导出PostgreSQL表DDL
     * @param request 请求参数
     * @return 导出结果
     */
    @PostMapping("/export-postgresql-ddl")
    public Map<String, Object> exportPostgreSqlDdl(@RequestBody BatchExportDdlRequest request) {
        log.info("开始批量导出PostgreSQL DDL，表名列表：{}", request.getTableNames());
        
        try {
            // 参数校验
            if (request.getTableNames() == null || request.getTableNames().trim().isEmpty()) {
                return createErrorResponse("表名不能为空");
            }
            
            // 检查数据库配置
            if (PG_JDBC_URL.trim().isEmpty() || PG_USERNAME.trim().isEmpty()) {
                return createErrorResponse("数据库配置未设置，请联系管理员配置数据库连接信息");
            }
            
            // 解析表名列表
            String[] tableNameArray = request.getTableNames().split(",");
            List<String> tableNames = new java.util.ArrayList<>();
            for (String tableName : tableNameArray) {
                String trimmedName = tableName.trim();
                if (!trimmedName.isEmpty()) {
                    tableNames.add(trimmedName);
                }
            }
            
            if (tableNames.isEmpty()) {
                return createErrorResponse("未找到有效的表名");
            }
            
            log.info("解析到{}个表名：{}", tableNames.size(), tableNames);
            
            // 调用批量DDL导出服务
            Map<String, Object> result = codeGeneratorService.exportBatchPostgreSqlDdl(
                PG_JDBC_URL,
                PG_USERNAME,
                PG_PASSWORD,
                tableNames,
                PG_SCHEMA_NAME
            );
            
            log.info("批量DDL导出完成，表数量：{}，结果：{}", tableNames.size(), result.get("success"));
            return result;
            
        } catch (Exception e) {
            log.error("批量DDL导出失败", e);
            return createErrorResponse("批量DDL导出失败：" + e.getMessage());
        }
    }
    
    /**
     * 测试数据库连接
     * @param request 连接参数
     * @return 测试结果
     */
    @PostMapping("/test-connection")
    public Map<String, Object> testConnection(@RequestBody TestConnectionRequest request) {
        log.info("测试数据库连接：{}", request.getJdbcUrl());
        
        Map<String, Object> result = new HashMap<>();
        
        try {
            // 参数校验
            if (request.getJdbcUrl() == null || request.getJdbcUrl().trim().isEmpty()) {
                return createErrorResponse("数据库连接URL不能为空");
            }
            
            // 测试连接
            java.sql.Connection conn = java.sql.DriverManager.getConnection(
                request.getJdbcUrl(),
                request.getUsername(),
                request.getPassword()
            );
            
            // 获取数据库信息
            java.sql.DatabaseMetaData metaData = conn.getMetaData();
            
            result.put("success", true);
            result.put("message", "连接成功");
            result.put("databaseProductName", metaData.getDatabaseProductName());
            result.put("databaseProductVersion", metaData.getDatabaseProductVersion());
            result.put("driverName", metaData.getDriverName());
            result.put("driverVersion", metaData.getDriverVersion());
            
            conn.close();
            
            log.info("数据库连接测试成功");
            
        } catch (Exception e) {
            log.error("数据库连接测试失败", e);
            result.put("success", false);
            result.put("message", "连接失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 获取数据库中的所有表
     * @param request 连接参数
     * @return 表列表
     */
    @PostMapping("/list-tables")
    public Map<String, Object> listTables(@RequestBody TestConnectionRequest request) {
        log.info("获取数据库表列表：{}", request.getJdbcUrl());
        
        Map<String, Object> result = new HashMap<>();
        
        try {
            // 参数校验
            if (request.getJdbcUrl() == null || request.getJdbcUrl().trim().isEmpty()) {
                return createErrorResponse("数据库连接URL不能为空");
            }
            
            java.util.List<String> tables = new java.util.ArrayList<>();
            
            try (java.sql.Connection conn = java.sql.DriverManager.getConnection(
                    request.getJdbcUrl(),
                    request.getUsername(),
                    request.getPassword())) {
                
                java.sql.DatabaseMetaData metaData = conn.getMetaData();
                
                // 获取表信息
                try (java.sql.ResultSet rs = metaData.getTables(null, null, "%", new String[]{"TABLE"})) {
                    while (rs.next()) {
                        String tableName = rs.getString("TABLE_NAME");
                        tables.add(tableName);
                    }
                }
            }
            
            result.put("success", true);
            result.put("message", "获取表列表成功");
            result.put("tables", tables);
            result.put("count", tables.size());
            
            log.info("获取到{}张表", tables.size());
            
        } catch (Exception e) {
            log.error("获取表列表失败", e);
            result.put("success", false);
            result.put("message", "获取表列表失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 获取表结构信息
     * @param request 请求参数
     * @return 表结构信息
     */
    @PostMapping("/table-info")
    public Map<String, Object> getTableInfo(@RequestBody GenerateCodeRequest request) {
        log.info("获取表结构信息，表名：{}", request.getTableName());
        
        Map<String, Object> result = new HashMap<>();
        
        try {
            // 参数校验
            if (request.getJdbcUrl() == null || request.getJdbcUrl().trim().isEmpty()) {
                return createErrorResponse("数据库连接URL不能为空");
            }
            
            if (request.getTableName() == null || request.getTableName().trim().isEmpty()) {
                return createErrorResponse("表名不能为空");
            }
            
            java.util.List<Map<String, Object>> columns = new java.util.ArrayList<>();
            
            try (java.sql.Connection conn = java.sql.DriverManager.getConnection(
                    request.getJdbcUrl(),
                    request.getUsername(),
                    request.getPassword())) {
                
                java.sql.DatabaseMetaData metaData = conn.getMetaData();
                
                // 获取主键信息
                java.util.Set<String> primaryKeys = new java.util.HashSet<>();
                try (java.sql.ResultSet rs = metaData.getPrimaryKeys(null, null, request.getTableName())) {
                    while (rs.next()) {
                        primaryKeys.add(rs.getString("COLUMN_NAME"));
                    }
                }
                
                // 获取列信息
                try (java.sql.ResultSet rs = metaData.getColumns(null, null, request.getTableName(), null)) {
                    while (rs.next()) {
                        Map<String, Object> column = new HashMap<>();
                        String columnName = rs.getString("COLUMN_NAME");
                        
                        column.put("columnName", columnName);
                        column.put("dataType", rs.getInt("DATA_TYPE"));
                        column.put("typeName", rs.getString("TYPE_NAME"));
                        column.put("columnSize", rs.getInt("COLUMN_SIZE"));
                        column.put("nullable", rs.getInt("NULLABLE") == java.sql.DatabaseMetaData.columnNullable);
                        column.put("primaryKey", primaryKeys.contains(columnName));
                        column.put("remarks", rs.getString("REMARKS"));
                        column.put("defaultValue", rs.getString("COLUMN_DEF"));
                        
                        columns.add(column);
                    }
                }
            }
            
            if (columns.isEmpty()) {
                return createErrorResponse("表不存在或无法获取表结构");
            }
            
            result.put("success", true);
            result.put("message", "获取表结构成功");
            result.put("tableName", request.getTableName());
            result.put("columns", columns);
            result.put("columnCount", columns.size());
            
            log.info("获取到表{}的{}个字段", request.getTableName(), columns.size());
            
        } catch (Exception e) {
            log.error("获取表结构失败", e);
            result.put("success", false);
            result.put("message", "获取表结构失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 处理SQL注释文件，生成带存在性检查的新文件
     * @param request 请求参数
     * @return 处理结果
     */
    @PostMapping("/process-sql-comments")
    public Map<String, Object> processSqlComments(@RequestBody ProcessSqlCommentsRequest request) {
        log.info("开始处理SQL注释文件");
        
        Map<String, Object> result = new HashMap<>();
        
        try {
            // 设置默认值
            String inputPath = request.getInputFilePath();
            if (inputPath == null || inputPath.trim().isEmpty()) {
                inputPath = "src/main/resources/sql注释.txt";
            }
            
            String outputPath = request.getOutputFilePath();
            if (outputPath == null || outputPath.trim().isEmpty()) {
                outputPath = "src/main/resources/sql注释_带存在性检查_完整版.txt";
            }
            
            String schemaName = request.getSchemaName();
            if (schemaName == null || schemaName.trim().isEmpty()) {
                schemaName = "public";
            }
            
            // 调用处理服务
            com.kingdee.fpy.util.SqlCommentProcessor.ProcessResult processResult = 
                sqlCommentProcessor.processCommentFile(inputPath, outputPath, schemaName);
            
            result.put("success", processResult.isSuccess());
            result.put("message", processResult.getMessage());
            result.put("inputFilePath", inputPath);
            result.put("outputFilePath", outputPath);
            result.put("schemaName", schemaName);
            result.put("tableCount", processResult.getTableCount());
            result.put("columnCount", processResult.getColumnCount());
            result.put("skippedCount", processResult.getSkippedCount());
            result.put("totalComments", processResult.getTableCount() + processResult.getColumnCount());
            
            log.info("SQL注释文件处理完成：表注释{}个，字段注释{}个，跳过{}行", 
                    processResult.getTableCount(), processResult.getColumnCount(), processResult.getSkippedCount());
            
        } catch (Exception e) {
            log.error("处理SQL注释文件失败", e);
            result.put("success", false);
            result.put("message", "处理失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 批量导出PostgreSQL表DDL并转换为MySQL格式
     * @param request 请求参数
     * @return 导出结果
     */
    @PostMapping("/export-postgresql-to-mysql")
    public Map<String, Object> exportPostgreSqlToMysql(@RequestBody BatchExportDdlRequest request) {
        log.info("开始批量导出PostgreSQL到MySQL DDL，表名列表：{}", request.getTableNames());
        
        try {
            // 参数校验
            if (request.getTableNames() == null || request.getTableNames().trim().isEmpty()) {
                return createErrorResponse("表名不能为空");
            }
            
            // 检查数据库配置
            if (PG_JDBC_URL.trim().isEmpty() || PG_USERNAME.trim().isEmpty()) {
                return createErrorResponse("数据库配置未设置，请联系管理员配置数据库连接信息");
            }
            
            // 解析表名列表
            String[] tableNameArray = request.getTableNames().split(",");
            List<String> tableNames = new java.util.ArrayList<>();
            for (String tableName : tableNameArray) {
                String trimmedName = tableName.trim();
                if (!trimmedName.isEmpty()) {
                    tableNames.add(trimmedName);
                }
            }
            
            if (tableNames.isEmpty()) {
                return createErrorResponse("未找到有效的表名");
            }
            
            log.info("解析到{}个表名：{}", tableNames.size(), tableNames);
            
            // 调用批量DDL导出并转换为MySQL服务
            Map<String, Object> result = codeGeneratorService.exportBatchPostgreSqlToMysql(
                PG_JDBC_URL,
                PG_USERNAME,
                PG_PASSWORD,
                tableNames,
                PG_SCHEMA_NAME
            );
            
            log.info("批量PostgreSQL到MySQL DDL导出完成，表数量：{}，结果：{}", tableNames.size(), result.get("success"));
            return result;
            
        } catch (Exception e) {
            log.error("批量PostgreSQL到MySQL DDL导出失败", e);
            return createErrorResponse("批量PostgreSQL到MySQL DDL导出失败：" + e.getMessage());
        }
    }
    
    /**
     * 批量数据同步：从PostgreSQL同步数据到MySQL
     * @param request 同步请求参数
     * @return 同步结果
     */
    @PostMapping("/sync-data")
    public Map<String, Object> syncData(@RequestBody BatchSyncRequest request) {
        log.info("开始批量数据同步，原始请求数：{}", request.getSyncRequests().size());
        
        try {
            // 参数校验
            if (request.getSyncRequests() == null || request.getSyncRequests().isEmpty()) {
                return createErrorResponse("同步请求列表不能为空");
            }
            
            // 检查数据库配置
            if (PG_JDBC_URL.trim().isEmpty() || PG_USERNAME.trim().isEmpty()) {
                return createErrorResponse("PostgreSQL数据库配置未设置，请联系管理员配置数据库连接信息");
            }
            
            if (MYSQL_JDBC_URL.trim().isEmpty() || MYSQL_USERNAME.trim().isEmpty()) {
                return createErrorResponse("MySQL数据库配置未设置，请联系管理员配置数据库连接信息");
            }
            
            // 验证每个同步请求
            for (SyncRequest syncRequest : request.getSyncRequests()) {
                if (syncRequest.getTable() == null || syncRequest.getTable().trim().isEmpty()) {
                    return createErrorResponse("表名不能为空");
                }
                
                if (syncRequest.getConditions() == null) {
                    syncRequest.setConditions(new java.util.ArrayList<>());
                }
            }
            
            // 转换请求参数格式，支持多表解析
            List<Map<String, Object>> syncRequests = new java.util.ArrayList<>();
            for (SyncRequest syncRequest : request.getSyncRequests()) {
                // 解析表名，支持逗号分隔的多个表
                String[] tableNames = syncRequest.getTable().split(",");
                for (String tableName : tableNames) {
                    String trimmedTableName = tableName.trim();
                    if (!trimmedTableName.isEmpty()) {
                        Map<String, Object> syncRequestMap = new HashMap<>();
                        syncRequestMap.put("table", trimmedTableName);
                        syncRequestMap.put("conditions", syncRequest.getConditions());
                        syncRequests.add(syncRequestMap);
                    }
                }
            }
            
            log.info("解析多表后的同步任务数：{}，详细请求：{}", syncRequests.size(), syncRequests);
            
            // 调用数据同步服务
            Map<String, Object> result = codeGeneratorService.syncDataFromPostgresToMysql(
                PG_JDBC_URL,
                PG_USERNAME,
                PG_PASSWORD,
                PG_SCHEMA_NAME,
                MYSQL_JDBC_URL,
                MYSQL_USERNAME,
                MYSQL_PASSWORD,
                MYSQL_SCHEMA_NAME,
                syncRequests
            );
            
            log.info("批量数据同步完成，结果：{}", result.get("success"));
            return result;
            
        } catch (Exception e) {
            log.error("批量数据同步失败", e);
            return createErrorResponse("批量数据同步失败：" + e.getMessage());
        }
    }
    
    /**
     * 创建错误响应
     */
    private Map<String, Object> createErrorResponse(String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("success", false);
        result.put("message", message);
        return result;
    }
    
    /**
     * 生成代码请求参数
     */
    public static class GenerateCodeRequest {
        private String jdbcUrl;
        private String username;
        private String password;
        private String tableName;
        private String packageName;
        
        // Getters and Setters
        public String getJdbcUrl() { return jdbcUrl; }
        public void setJdbcUrl(String jdbcUrl) { this.jdbcUrl = jdbcUrl; }
        
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        
        public String getTableName() { return tableName; }
        public void setTableName(String tableName) { this.tableName = tableName; }
        
        public String getPackageName() { return packageName; }
        public void setPackageName(String packageName) { this.packageName = packageName; }
    }
    
    /**
     * 测试连接请求参数
     */
    public static class TestConnectionRequest {
        private String jdbcUrl;
        private String username;
        private String password;
        
        // Getters and Setters
        public String getJdbcUrl() { return jdbcUrl; }
        public void setJdbcUrl(String jdbcUrl) { this.jdbcUrl = jdbcUrl; }
        
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
    
    /**
     * 批量导出DDL请求参数
     */
    public static class BatchExportDdlRequest {
        private String tableNames; // 多个表名用英文逗号分隔
        
        // Getters and Setters
        public String getTableNames() { return tableNames; }
        public void setTableNames(String tableNames) { this.tableNames = tableNames; }
    }
    
    /**
     * 处理SQL注释文件请求参数
     */
    public static class ProcessSqlCommentsRequest {
        private String inputFilePath;  // 输入文件路径，默认为 src/main/resources/sql注释.txt
        private String outputFilePath; // 输出文件路径，默认为 src/main/resources/sql注释_带存在性检查_完整版.txt
        private String schemaName;     // 模式名，默认为 public
        
        // Getters and Setters
        public String getInputFilePath() { return inputFilePath; }
        public void setInputFilePath(String inputFilePath) { this.inputFilePath = inputFilePath; }
        
        public String getOutputFilePath() { return outputFilePath; }
        public void setOutputFilePath(String outputFilePath) { this.outputFilePath = outputFilePath; }
        
        public String getSchemaName() { return schemaName; }
        public void setSchemaName(String schemaName) { this.schemaName = schemaName; }
    }
    
    /**
     * 数据同步请求参数
     */
    public static class SyncRequest {
        private String table;           // 表名，支持多个表用逗号分隔，例如："t_user,t_role" 或 "t_org_org"
        private List<String> conditions; // 查询条件列表，例如["id = 1", "status = 'active'"]
        
        // Getters and Setters
        public String getTable() { return table; }
        public void setTable(String table) { this.table = table; }
        
        public List<String> getConditions() { return conditions; }
        public void setConditions(List<String> conditions) { this.conditions = conditions; }
    }
    
    /**
     * 批量数据同步请求参数
     */
    public static class BatchSyncRequest {
        private List<SyncRequest> syncRequests; // 同步请求列表
        
        // Getters and Setters
        public List<SyncRequest> getSyncRequests() { return syncRequests; }
        public void setSyncRequests(List<SyncRequest> syncRequests) { this.syncRequests = syncRequests; }
    }
}