# PostgreSQL DDL 批量导出功能使用说明

## 功能概述

本功能可以连接到PostgreSQL数据库，并批量导出指定表的完整DDL（数据定义语言）语句，支持：

- **批量导出**：支持一次导出多个表的DDL
- **统一文件**：将所有表的DDL统一生成到一个文件中
- **完整结构**：包括表结构、主键、外键、索引、注释等
- **错误处理**：详细的成功/失败表统计

## 数据库配置

数据库连接配置已设置为Controller中的常量，需要管理员在代码中配置：

```java
// PostgreSQL数据库配置常量（在CodeGeneratorController中）
private static final String PG_JDBC_URL = "";      // 需要配置
private static final String PG_USERNAME = "";      // 需要配置  
private static final String PG_PASSWORD = "";      // 需要配置
private static final String PG_SCHEMA_NAME = "public";
```

## API接口

### 批量导出PostgreSQL表DDL

**接口地址：** `POST /api/code-generator/export-postgresql-ddl`

**请求参数：**

```json
{
    "tableNames": "users,orders,products"
}
```

**参数说明：**

| 参数名 | 类型 | 必填 | 说明 |
|--------|------|------|------|
| tableNames | String | 是 | 要导出DDL的表名，多个表名用英文逗号分隔 |

**响应示例：**

```json
{
    "success": true,
    "message": "批量DDL导出完成，成功：3个，失败：0个",
    "ddl": "-- Batch DDL Export for PostgreSQL\n-- Generated at: Thu Jan 01 12:00:00 CST 2024\n-- Schema: public\n-- Tables: users, orders, products\n-- Total tables: 3\n\n-- ================================================================================\n\n-- ================================================================================\n-- Table: public.users\n-- ================================================================================\n\nCREATE TABLE public.users (\n    id bigint NOT NULL,\n    username varchar(50) NOT NULL,\n    email varchar(100),\n    created_at timestamp DEFAULT CURRENT_TIMESTAMP,\n    CONSTRAINT users_pkey PRIMARY KEY (id)\n);\n\n...",
    "fileName": "batch_ddl_3_tables_1704067200000.sql",
    "filePath": "ddl_exports/batch_ddl_3_tables_1704067200000.sql",
    "totalTables": 3,
    "successTables": ["users", "orders", "products"],
    "successCount": 3,
    "failedTables": [],
    "failedCount": 0,
    "schemaName": "public"
}
```

## 使用示例

### 1. 使用curl命令

```bash
# 批量导出多个表
curl -X POST http://localhost:8081/api/code-generator/export-postgresql-ddl \
  -H "Content-Type: application/json" \
  -d '{
    "tableNames": "users,orders,products,categories"
  }'

# 导出单个表
curl -X POST http://localhost:8081/api/code-generator/export-postgresql-ddl \
  -H "Content-Type: application/json" \
  -d '{
    "tableNames": "users"
  }'
```

### 2. 使用Postman

1. 创建新的POST请求
2. URL: `http://localhost:8081/api/code-generator/export-postgresql-ddl`
3. Headers: `Content-Type: application/json`
4. Body (raw JSON):
```json
{
    "tableNames": "users,orders,products"
}
```

### 3. 使用JavaScript

```javascript
const exportBatchDdl = async () => {
    const response = await fetch('/api/code-generator/export-postgresql-ddl', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            tableNames: 'users,orders,products,categories'
        })
    });
    
    const result = await response.json();
    if (result.success) {
        console.log(`批量DDL导出成功: ${result.successCount}个表成功, ${result.failedCount}个表失败`);
        console.log('成功的表:', result.successTables);
        if (result.failedCount > 0) {
            console.log('失败的表:', result.failedTables);
        }
        console.log('文件路径:', result.filePath);
    } else {
        console.error('导出失败:', result.message);
    }
};
```

## 生成的DDL文件格式

批量导出的DDL文件将包含以下格式：

### 1. 文件头部信息
```sql
-- Batch DDL Export for PostgreSQL
-- Generated at: Thu Jan 01 12:00:00 CST 2024
-- Schema: public
-- Tables: users, orders, products
-- Total tables: 3

-- ================================================================================
```

### 2. 每个表的完整DDL
```sql
-- ================================================================================
-- Table: public.users
-- ================================================================================

CREATE TABLE public.users (
    id bigint NOT NULL,
    username varchar(50) NOT NULL,
    email varchar(100),
    created_at timestamp DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp,
    CONSTRAINT users_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.users IS '用户表';
COMMENT ON COLUMN public.users.id IS '用户ID';
COMMENT ON COLUMN public.users.username IS '用户名';
COMMENT ON COLUMN public.users.email IS '邮箱地址';

-- Indexes
CREATE UNIQUE INDEX idx_users_username ON public.users (username);
CREATE INDEX idx_users_email ON public.users (email);

-- Foreign Keys
ALTER TABLE public.user_profiles ADD CONSTRAINT fk_user_profiles_user_id 
FOREIGN KEY (user_id) REFERENCES public.users (id) ON DELETE CASCADE;
```

### 3. 文件命名规则
- 单个表：`ddl_{tableName}_{timestamp}.sql`
- 批量导出：`batch_ddl_{successCount}_tables_{timestamp}.sql`

## 注意事项

1. **数据库配置**：需要管理员在Controller中配置PostgreSQL连接信息：
   ```java
   private static final String PG_JDBC_URL = "jdbc:postgresql://host:port/database";
   private static final String PG_USERNAME = "username";
   private static final String PG_PASSWORD = "password";
   ```

2. **批量处理**：支持同时导出多个表，用英文逗号分隔表名

3. **错误容错**：即使部分表导出失败，成功的表仍会正常导出到文件中

4. **权限要求**：确保数据库用户具有以下权限：
   - 对目标表的SELECT权限
   - 对系统表的查询权限（information_schema, pg_catalog）

5. **文件存储**：生成的DDL文件会保存在项目的`ddl_exports/`目录下

6. **安全性**：数据库配置存储在代码中，请确保：
   - 不将敏感配置提交到版本控制系统
   - 在生产环境中使用专门的只读数据库用户

## 错误处理

常见错误及解决方案：

| 错误信息 | 原因 | 解决方案 |
|----------|------|----------|
| "数据库配置未设置" | Controller中的数据库常量为空 | 联系管理员配置数据库连接信息 |
| "表名不能为空" | 请求参数tableNames为空 | 检查请求参数 |
| "未找到有效的表名" | 表名格式错误或全为空白 | 检查表名格式，用英文逗号分隔 |
| "所有表都导出失败" | 所有指定的表都不存在或无权限 | 检查表名和数据库权限 |
| "批量DDL导出失败" | 系统异常 | 查看详细错误日志 |

## 响应字段说明

| 字段名 | 类型 | 说明 |
|--------|------|------|
| success | Boolean | 导出是否成功 |
| message | String | 结果消息 |
| ddl | String | 完整的DDL内容 |
| fileName | String | 生成的文件名 |
| filePath | String | 文件保存路径 |
| totalTables | Integer | 总表数量 |
| successTables | Array | 成功导出的表名列表 |
| successCount | Integer | 成功导出的表数量 |
| failedTables | Array | 失败的表名及原因列表 |
| failedCount | Integer | 失败的表数量 |
| schemaName | String | 模式名 |

## 技术实现

- 使用JDBC连接PostgreSQL数据库
- 通过information_schema和pg_catalog系统表获取元数据
- 支持获取表结构、约束、索引、注释等完整信息
- 生成标准的PostgreSQL DDL语句

## 版本要求

- Java 8+
- Spring Boot 2.3+
- PostgreSQL 9.5+
- PostgreSQL JDBC Driver