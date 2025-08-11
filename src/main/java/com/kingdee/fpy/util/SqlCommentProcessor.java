package com.kingdee.fpy.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SQL注释处理工具类
 * 将原始的SQL注释文件转换为带存在性检查的PostgreSQL脚本
 */
@Slf4j
@Component
public class SqlCommentProcessor {
    
    // 匹配表注释的正则表达式
    private static final Pattern TABLE_COMMENT_PATTERN = 
        Pattern.compile("comment\\s+on\\s+table\\s+(\\w+)\\s+is\\s+'([^']+)';", Pattern.CASE_INSENSITIVE);
    
    // 匹配字段注释的正则表达式
    private static final Pattern COLUMN_COMMENT_PATTERN = 
        Pattern.compile("comment\\s+on\\s+column\\s+(\\w+)\\.(\\w+)\\s+is\\s+'([^']+)';", Pattern.CASE_INSENSITIVE);
    
    /**
     * 处理SQL注释文件，生成带存在性检查的新文件
     * @param inputFilePath 输入文件路径
     * @param outputFilePath 输出文件路径
     * @param schemaName 模式名（默认为public）
     * @return 处理结果
     */
    public ProcessResult processCommentFile(String inputFilePath, String outputFilePath, String schemaName) {
        if (schemaName == null || schemaName.trim().isEmpty()) {
            schemaName = "public";
        }
        
        ProcessResult result = new ProcessResult();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            
            // 写入文件头
            writeFileHeader(writer);
            
            String line;
            String currentTable = null;
            int lineNumber = 0;
            
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                line = line.trim();
                
                // 跳过空行和注释行
                if (line.isEmpty() || line.startsWith("--")) {
                    continue;
                }
                
                // 处理表注释
                Matcher tableMatcher = TABLE_COMMENT_PATTERN.matcher(line);
                if (tableMatcher.find()) {
                    String tableName = tableMatcher.group(1).toLowerCase();
                    String comment = tableMatcher.group(2);
                    
                    // 如果是新表，添加表分隔符
                    if (!tableName.equals(currentTable)) {
                        currentTable = tableName;
                        writeTableSeparator(writer, tableName, comment);
                    }
                    
                    writeTableComment(writer, tableName, comment, schemaName);
                    result.incrementTableCount();
                    continue;
                }
                
                // 处理字段注释
                Matcher columnMatcher = COLUMN_COMMENT_PATTERN.matcher(line);
                if (columnMatcher.find()) {
                    String tableName = columnMatcher.group(1).toLowerCase();
                    String columnName = columnMatcher.group(2).toLowerCase();
                    String comment = columnMatcher.group(3);
                    
                    // 如果是新表，添加表分隔符
                    if (!tableName.equals(currentTable)) {
                        currentTable = tableName;
                        writeTableSeparator(writer, tableName, "");
                    }
                    
                    writeColumnComment(writer, tableName, columnName, comment, schemaName);
                    result.incrementColumnCount();
                    continue;
                }
                
                // 无法识别的行
                log.warn("第{}行无法识别的SQL语句: {}", lineNumber, line);
                result.incrementSkippedCount();
            }
            
            // 写入文件尾
            writeFileFooter(writer, result);
            
            result.setSuccess(true);
            result.setMessage("SQL注释文件处理完成");
            
        } catch (IOException e) {
            log.error("处理SQL注释文件失败", e);
            result.setSuccess(false);
            result.setMessage("处理失败：" + e.getMessage());
        }
        
        return result;
    }
    
    /**
     * 写入文件头
     */
    private void writeFileHeader(BufferedWriter writer) throws IOException {
        writer.write("-- PostgreSQL SQL注释文件（带存在性检查）\n");
        writer.write("-- 自动生成于: " + new java.util.Date() + "\n");
        writer.write("-- 执行前会检查表和字段是否存在，只对存在的对象添加注释\n\n");
    }
    
    /**
     * 写入表分隔符
     */
    private void writeTableSeparator(BufferedWriter writer, String tableName, String comment) throws IOException {
        writer.write("-- " + repeatString("=", 80) + "\n");
        writer.write("-- 表：" + tableName);
        if (!comment.isEmpty()) {
            writer.write(" (" + comment + ")");
        }
        writer.write("\n");
        writer.write("-- " + "="+ repeatString(comment, 80) + "\n\n");
    }
    
    /**
     * 写入表注释检查逻辑
     */
    private void writeTableComment(BufferedWriter writer, String tableName, String comment, String schemaName) throws IOException {
        writer.write("-- 检查表是否存在，存在才添加表注释\n");
        writer.write("DO $$\n");
        writer.write("BEGIN\n");
        writer.write("    IF EXISTS (SELECT 1 FROM information_schema.tables \n");
        writer.write("               WHERE table_schema = '" + schemaName + "' AND table_name = '" + tableName + "') THEN\n");
        writer.write("        COMMENT ON TABLE " + tableName + " IS '" + escapeSqlString(comment) + "';\n");
        writer.write("        RAISE NOTICE '已添加表注释: " + tableName + "';\n");
        writer.write("    ELSE\n");
        writer.write("        RAISE NOTICE '表不存在，跳过: " + tableName + "';\n");
        writer.write("    END IF;\n");
        writer.write("END $$;\n\n");
    }
    
    /**
     * 写入字段注释检查逻辑
     */
    private void writeColumnComment(BufferedWriter writer, String tableName, String columnName, 
                                   String comment, String schemaName) throws IOException {
        writer.write("DO $$\n");
        writer.write("BEGIN\n");
        writer.write("    IF EXISTS (SELECT 1 FROM information_schema.columns \n");
        writer.write("               WHERE table_schema = '" + schemaName + "' \n");
        writer.write("               AND table_name = '" + tableName + "' \n");
        writer.write("               AND column_name = '" + columnName + "') THEN\n");
        writer.write("        COMMENT ON COLUMN " + tableName + "." + columnName + " IS '" + escapeSqlString(comment) + "';\n");
        writer.write("        RAISE NOTICE '已添加字段注释: " + tableName + "." + columnName + "';\n");
        writer.write("    ELSE\n");
        writer.write("        RAISE NOTICE '字段不存在，跳过: " + tableName + "." + columnName + "';\n");
        writer.write("    END IF;\n");
        writer.write("END $$;\n\n");
    }
    
    /**
     * 写入文件尾
     */
    private void writeFileFooter(BufferedWriter writer, ProcessResult result) throws IOException {
        writer.write("-- " + repeatString("=", 80) + "\n");
        writer.write("-- 处理完成统计\n");
        writer.write("-- 表注释: " + result.getTableCount() + " 个\n");
        writer.write("-- 字段注释: " + result.getColumnCount() + " 个\n");
        writer.write("-- 跳过行数: " + result.getSkippedCount() + " 行\n");
        writer.write("-- 总计: " + (result.getTableCount() + result.getColumnCount()) + " 个注释\n");
        writer.write("-- " + repeatString("=", 80) + "\n");
    }
    
    /**
     * 转义SQL字符串中的单引号
     */
    private String escapeSqlString(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("'", "''");
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
     * 处理结果类
     */
    public static class ProcessResult {
        private boolean success;
        private String message;
        private int tableCount;
        private int columnCount;
        private int skippedCount;
        
        public boolean isSuccess() { return success; }
        public void setSuccess(boolean success) { this.success = success; }
        
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        
        public int getTableCount() { return tableCount; }
        public void incrementTableCount() { this.tableCount++; }
        
        public int getColumnCount() { return columnCount; }
        public void incrementColumnCount() { this.columnCount++; }
        
        public int getSkippedCount() { return skippedCount; }
        public void incrementSkippedCount() { this.skippedCount++; }
        
        @Override
        public String toString() {
            return String.format("ProcessResult{success=%s, message='%s', tableCount=%d, columnCount=%d, skippedCount=%d}",
                    success, message, tableCount, columnCount, skippedCount);
        }
    }
}