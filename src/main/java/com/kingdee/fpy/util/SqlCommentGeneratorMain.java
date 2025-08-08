package com.kingdee.fpy.util;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SQL注释生成器主类
 * 用于将原始SQL注释文件转换为带存在性检查的完整版本
 */
public class SqlCommentGeneratorMain {
    
    // 匹配表注释的正则表达式
    private static final Pattern TABLE_COMMENT_PATTERN = 
        Pattern.compile("comment\\s+on\\s+table\\s+(\\w+)\\s+is\\s+'([^']+)';", Pattern.CASE_INSENSITIVE);
    
    // 匹配字段注释的正则表达式
    private static final Pattern COLUMN_COMMENT_PATTERN = 
        Pattern.compile("comment\\s+on\\s+column\\s+(\\w+)\\.(\\w+)\\s+is\\s+'([^']+)';", Pattern.CASE_INSENSITIVE);
    
    public static void main(String[] args) {
        String inputPath = "src/main/resources/sql注释.txt";
        String outputPath = "src/main/resources/sql注释_带存在性检查_完整版.txt";
        String schemaName = "public";
        
        try {
            processCommentFile(inputPath, outputPath, schemaName);
            System.out.println("SQL注释文件处理完成！");
            System.out.println("输入文件: " + inputPath);
            System.out.println("输出文件: " + outputPath);
        } catch (Exception e) {
            System.err.println("处理失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void processCommentFile(String inputPath, String outputPath, String schemaName) throws IOException {
        int tableCount = 0;
        int columnCount = 0;
        int skippedCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            
            // 写入文件头
            writer.write("-- PostgreSQL SQL注释文件（带存在性检查）\n");
            writer.write("-- 自动生成于: " + new java.util.Date() + "\n");
            writer.write("-- 执行前会检查表和字段是否存在，只对存在的对象添加注释\n");
            writer.write("-- 原始文件: " + inputPath + "\n");
            writer.write("-- 目标模式: " + schemaName + "\n\n");
            
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
                        writer.write("-- " + repeatString("=", 80) + "\n");
                        writer.write("-- 表：" + tableName + " (" + comment + ")\n");
                        writer.write("-- " + repeatString("=", 80) + "\n\n");
                    }
                    
                    writeTableComment(writer, tableName, comment, schemaName);
                    tableCount++;
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
                        writer.write("-- " + repeatString("=", 80) + "\n");
                        writer.write("-- 表：" + tableName + "\n");
                        writer.write("-- " + repeatString("=", 80) + "\n\n");
                    }
                    
                    writeColumnComment(writer, tableName, columnName, comment, schemaName);
                    columnCount++;
                    continue;
                }
                
                // 无法识别的行
                System.out.println("第" + lineNumber + "行无法识别: " + line);
                skippedCount++;
            }
            
            // 写入文件尾
            writer.write("-- " + repeatString("=", 80) + "\n");
            writer.write("-- 处理完成统计\n");
            writer.write("-- 表注释: " + tableCount + " 个\n");
            writer.write("-- 字段注释: " + columnCount + " 个\n");
            writer.write("-- 跳过行数: " + skippedCount + " 行\n");
            writer.write("-- 总计: " + (tableCount + columnCount) + " 个注释\n");
            writer.write("-- " + repeatString("=", 80) + "\n");
            
            System.out.println("处理统计：");
            System.out.println("- 表注释: " + tableCount + " 个");
            System.out.println("- 字段注释: " + columnCount + " 个");
            System.out.println("- 跳过行数: " + skippedCount + " 行");
            System.out.println("- 总计: " + (tableCount + columnCount) + " 个注释");
        }
    }
    
    private static void writeTableComment(BufferedWriter writer, String tableName, String comment, String schemaName) throws IOException {
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
    
    private static void writeColumnComment(BufferedWriter writer, String tableName, String columnName, 
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
    
    private static String escapeSqlString(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("'", "''");
    }
    
    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}