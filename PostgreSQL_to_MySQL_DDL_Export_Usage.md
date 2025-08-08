# PostgreSQL到MySQL DDL转换功能使用说明

## 功能概述

本功能提供了将PostgreSQL数据库表结构转换为MySQL格式的DDL语句，支持批量转换多个表。

## API接口

### 接口地址
```
POST /api/code-generator/export-postgresql-to-mysql
```

### 请求参数
```json
{
    "tableNames": "table1,table2,table3"
}
```

### 使用示例

```bash
curl -X POST http://localhost:8080/api/code-generator/export-postgresql-to-mysql \
  -H "Content-Type: application/json" \
  -d '{"tableNames": "users,orders,products"}'
```

## 输出文件

生成的MySQL DDL文件保存在 `ddl_exports/` 目录下，文件名格式为：
```
mysql_batch_ddl_{表数量}_tables_{时间戳}.sql
```

## 支持的功能

- 表名和字段注释
- 索引信息
- 主键约束
- 字段非空约束
- 默认值
- 外键约束
- 数据类型转换 