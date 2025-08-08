# 代码生成器优化说明

## 优化内容

### 1. 去除文件名前缀 "T"

**优化前：**
- 表名：`TBastaxTaxcodeDetails`
- 生成的类名：`TBastaxTaxcodeDetails`
- 文件名：`TBastaxTaxcodeDetailsMapper.java`

**优化后：**
- 表名：`TBastaxTaxcodeDetails`
- 生成的类名：`BastaxTaxcodeDetails`
- 文件名：`BastaxTaxcodeDetailsMapper.java`

### 2. 去除Model属性前缀 "f"

**优化前：**
- 字段名：`fTaxCode`
- 属性名：`fTaxCode`

**优化后：**
- 字段名：`fTaxCode`
- 属性名：`taxCode`

**支持的前缀格式：**
- `fTaxCode` → `taxCode`
- `f_tax_code` → `taxCode`

## 实现细节

### 1. 类名生成优化

```java
// 去除表名前缀T，生成类名
String cleanTableName = tableName.startsWith("T") ? tableName.substring(1) : tableName;
String className = toCamelCase(cleanTableName, true);
```

### 2. 属性名生成优化

新增 `toPropertyName` 方法：

```java
/**
 * 生成属性名（去除f前缀并转驼峰）
 */
private String toPropertyName(String columnName) {
    if (columnName == null || columnName.isEmpty()) {
        return columnName;
    }
    
    // 去除f前缀（如果存在）
    String cleanColumnName = columnName;
    if (columnName.toLowerCase().startsWith("f") && columnName.length() > 1 && Character.isUpperCase(columnName.charAt(1))) {
        cleanColumnName = columnName.substring(1);
    } else if (columnName.toLowerCase().startsWith("f_")) {
        cleanColumnName = columnName.substring(2);
    }
    
    return toCamelCase(cleanColumnName, false);
}
```

### 3. 全面替换

所有生成代码的地方都使用新的方法：
- Model类的属性名
- Mapper接口的参数名
- XML映射文件的property属性
- 所有相关的变量名

## 使用示例

### 调用接口

```bash
curl -X POST http://localhost:8080/api/code-generator/generate \
  -H "Content-Type: application/json" \
  -d '{"tableNames": "TUser,TOrder,TProduct"}'
```

### 生成结果

**表：TUser**
- 生成的Model类：`User.java`
- 生成的Mapper接口：`UserMapper.java`
- 生成的XML文件：`UserMapper.xml`

**字段映射示例：**
```java
// 原字段：fUserId, fUserName, fCreateTime
// 生成的属性：
private Long userId;
private String userName;
private Date createTime;
```

**XML映射示例：**
```xml
<resultMap id="BaseResultMap" type="com.kingdee.fpy.model.User">
    <id column="fUserId" jdbcType="BIGINT" property="userId" />
    <result column="fUserName" jdbcType="VARCHAR" property="userName" />
    <result column="fCreateTime" jdbcType="TIMESTAMP" property="createTime" />
</resultMap>
```

## 优化效果

1. **更简洁的类名**：去除冗余的表名前缀"T"
2. **更标准的属性名**：符合Java命名规范，去除字段前缀"f"
3. **更好的可读性**：生成的代码更加清晰易读
4. **保持映射关系**：XML映射文件正确处理数据库字段和Java属性的对应关系

## 兼容性

- 支持有前缀和无前缀的表名
- 支持有前缀和无前缀的字段名
- 保持原有的所有功能不变
- 向后兼容现有的代码生成逻辑