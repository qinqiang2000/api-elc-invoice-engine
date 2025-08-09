# ExecuteRule 功能测试方案

## 测试目标

专注测试 `InvoiceApplyService` 中的 `executeRule` 方法逻辑：

1. **补全阶段**：执行补全规则（RuleType=2），自动填充缺失数据
2. **校验阶段**：执行校验规则（RuleType=1），验证数据完整性
3. **执行顺序**：先补全，后校验

*注：老版本类英文有误：InvoiceAppleyService*

## 测试策略

使用 **集成测试** 策略，通过反射调用私有的 `executeRule` 方法：

### 核心特点：
- **专注性**：仅测试 executeRule 核心逻辑，不测试其他业务方法
- **真实性**：使用真实的 JEXL 规则和数据库（H2内存库）
- **完整性**：覆盖补全→校验的完整流程
- **精确性**：通过反射精确控制测试范围

## 规则数据来源与依赖

### 数据来源说明

测试中的规则数据来源于 **`src/test/resources/data-h2.sql`** 文件，该文件在测试启动时自动加载到H2内存数据库中。

### 核心数据表

#### 1. 规则表 (`t_invoice_rules`)
存储所有补全和校验规则：

**补全规则 (RuleType=2):**
- `CN-COMP-001`: 购买方税号补全 - 根据公司名称从`t_company_info`查询税号
- `CN-COMP-002`: 供应商税号补全 - 根据公司名称从`t_company_info`查询税号  
- `CN-COMP-003`: 商品税率补全 - 根据商品名称从`t_product_tax`查询税率和税类别

**校验规则 (RuleType=1):**
- `CN-VALID-001`: 购买方名称必填校验
- `CN-VALID-002`: 供应商名称必填校验
- `CN-VALID-003`: 商品名称必填校验

#### 2. 辅助数据表

**公司信息表 (`t_company_info`):**
```sql
('Buyer Company Name', 'TAX123456789', 'CN', 1)
('Supplier Company Name', 'TAX987654321', 'CN', 1)  
('Test Company', 'TAX000000000', 'CN', 1)
```

**产品税率表 (`t_product_tax`):**
```sql
('Product A', 'PROD001', 'S', '13.0', 'CN', 1)
('Product B', 'PROD002', 'AA', '6.0', 'CN', 1)
('Product C', 'PROD003', 'Z', '0.0', 'CN', 1)
```

**规则订阅表 (`t_rule_subscription`):**
- 定义哪些规则对空租户ID和空公司ID生效

### 规则加载逻辑

```java
// 查询SQL (InvoiceRulesMapper.xml:72-89)
List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");

// 查询条件：
// - fcountry = "CN" (国家代码)  
// - factive = 1 (激活状态)
// - fstart_time <= now() <= fend_time (时间窗口内)
// - 通过 t_rule_subscription 关联规则订阅
// - 按 fpriority 升序排序
```

### 测试数据依赖关系

#### 成功场景预期结果
- **购买方税号补全**: `Buyer Company Name` → `TAX123456789`
- **供应商税号补全**: `Supplier Company Name` → `TAX987654321`  
- **商品税率补全**: `Product A` → `S类别，13%税率`

#### 失败场景设计
- **校验失败**: 删除供应商名称 → 触发`CN-VALID-002`校验规则失败
- **补全失败**: 使用未知公司名`Unknown Company` → 无法找到对应税号，补全失败

### 边界测试情况
- **空规则列表**: 测试executeRule对空规则集合的处理
- **异常上下文**: 测试缺少关键字段的异常发票数据处理

## 测试数据结构

基本发票JSON数据包含最小必要字段：

```json
{
  "ID": "INV-2025-001",
  "InvoiceTypeCode": "380",
  "DocumentCurrencyCode": "CNY",
  "SellBilled": "Sell",
  "invoiceNo": "INV-2025-001",
  "billNo": "BILL-2025-001",
  "AccountingCustomerParty": {
    "Party": {
      "PartyLegalEntity": {
        "RegistrationName": "Buyer Company Name"
      }
    }
  },
  "AccountingSupplierParty": {
    "Party": {
      "PartyLegalEntity": {
        "RegistrationName": "Supplier Company Name"
      }
    }
  },
  "InvoiceLine": [
    {
      "ID": "1",
      "InvoicedQuantity": {
        "value": 2,
        "unitCode": "EA"
      },
      "LineExtensionAmount": {
        "value": 1000.00,
        "currencyID": "CNY"
      },
      "Item": {
        "Name": "Product A"
      },
      "Price": {
        "PriceAmount": {
          "value": 500.00,
          "currencyID": "CNY"
        }
      }
    }
  ],
  "LegalMonetaryTotal": {
    "LineExtensionAmount": {
      "value": 1000.00,
      "currencyID": "CNY"
    },
    "PayableAmount": {
      "value": 1180.00,
      "currencyID": "CNY"
    }
  }
}
```

## 测试场景

### 1. ExecuteRule 成功场景

**测试方法**: `testExecuteRule_SuccessfulCompletionThenValidation()`

- **输入**: 基本发票数据（如上JSON结构）
- **执行流程**:
  1. 先执行补全规则（RuleType=2）
  2. 再执行校验规则（RuleType=1）
- **预期结果**:
  - 无错误信息：`result.getErrorMsgArray().isEmpty() == true`
  - 数据补全成功：购买方和供应商税号被补全
  - 商品税率和税类别被补全

### 2. ExecuteRule 校验失败场景

**测试方法**: `testExecuteRule_ValidationFailure()`

- **输入**: 缺少供应商名称的发票数据
- **执行流程**:
  1. 先执行补全规则（应成功）
  2. 再执行校验规则（应失败）
- **预期结果**:
  - 有错误信息：`result.getErrorMsgArray().isEmpty() == false`
  - 错误信息包含校验失败描述

### 3. ExecuteRule 补全失败场景

**测试方法**: `testExecuteRule_CompletionFailure()`

- **输入**: 购买方为"Unknown Company"的发票数据
- **执行流程**:
  1. 执行补全规则（应失败）
  2. 通常不再执行校验规则
- **预期结果**:
  - 有错误信息：`result.getErrorMsgArray().isEmpty() == false`
  - 错误信息包含补全失败描述

## 核心实现

### 反射调用方式

```java
/**
 * 使用反射调用私有的 executeRule 方法
 */
private void invokeExecuteRule(List<InvoiceRules> rules, JexlContext context, 
                               Result<?> result, boolean isCompletion) throws Exception {
    Method m = InvoiceAppleyService.class.getDeclaredMethod(
            "executeRule", List.class, JexlContext.class, String.class, Result.class, String.class);
    m.setAccessible(true);
    
    String logTpl = isCompletion ? 
            "rule:{},contition:{},complete fail:{}" : 
            "rule:{},contition:{},valid fail:{}";
    String errTpl = isCompletion ? 
            "rule:%s,complete fail:%s" : 
            "rule:%s,valid fail:%s";
            
    m.invoke(invoiceAppleyService, rules, context, logTpl, result, errTpl);
}
```

### 规则加载与分组

```java
// 从数据库加载所有规则
List<InvoiceRules> all = invoiceRulesService.selectByTenantIdOrCompanyId("", "", "CN");

// 按类型分组
List<InvoiceRules> completion = all.stream().filter(r -> r.getRuleType() == 2)
        .collect(Collectors.toList());  // 补全规则
List<InvoiceRules> validation = all.stream().filter(r -> r.getRuleType() == 1)
        .collect(Collectors.toList());  // 校验规则
```

### ExecuteRule 执行流程

```java
// 步骤1: 执行补全规则
invokeExecuteRule(completion, ctx, result, true);

// 步骤2: 执行校验规则  
invokeExecuteRule(validation, ctx, result, false);

// 验证执行结果
assertTrue(result.getErrorMsgArray().isEmpty(), "应无错误");
```

## 测试执行

### 执行命令

```bash
# 执行 executeRule 专项测试
mvn test -Dtest=InvoiceApplyServiceTest -Dspring.profiles.active=local

# 执行特定测试方法
mvn test -Dtest=InvoiceApplyServiceTest#testExecuteRule_SuccessfulCompletionThenValidation -Dspring.profiles.active=local

# 执行所有测试
mvn test -Dspring.profiles.active=local
```

### 验证要点

1. **规则数据验证**: 测试前自动验证规则是否正确加载
2. **执行顺序验证**: 确保补全规则先于校验规则执行
3. **结果状态验证**: 检查 `Result.getErrorMsgArray()` 的状态
4. **数据补全验证**: 验证补全规则是否正确填充了缺失数据
5. **错误消息验证**: 验证失败场景的错误消息是否符合预期
6. **调试信息输出**: 测试失败时自动输出规则加载情况和详细错误信息

### 当前测试覆盖范围

#### 核心测试方法
1. **`testExecuteRule_SuccessfulCompletionThenValidation()`**: 完整成功流程测试
2. **`testExecuteRule_ValidationFailure()`**: 校验失败场景测试  
3. **`testExecuteRule_CompletionFailure()`**: 补全失败场景测试
4. **`testExecuteRule_EmptyRules()`**: 空规则列表边界测试
5. **`testExecuteRule_InvalidContext()`**: 异常数据边界测试

#### 测试特色
- **自动规则验证**: 每个测试自动检查规则数据加载情况
- **详细调试输出**: 测试失败时输出完整的规则信息和错误详情  
- **硬编码期望值**: 使用预定义的期望结果作为基准测试
- **完整错误追踪**: 从规则加载到执行结果的全程追踪

## 扩展测试建议

### 规则类型测试
- 测试不同类型的补全规则（税号补全、税率补全等）  
- 测试不同类型的校验规则（必填字段校验、格式校验等）

### 边界情况测试
- 测试规则列表为空的情况
- 测试JEXL上下文数据异常的情况
- 测试规则执行超时的情况

## 重要说明

### 关于反射使用
- 使用反射调用私有 `executeRule` 方法是为了精确测试该核心逻辑
- 避免了测试其他业务逻辑的干扰
- 确保测试专注于补全→校验的执行流程

### 关于数据库依赖
- 使用 H2 内存数据库（local profile）避免外部依赖
- 测试数据在 `src/test/resources/data-h2.sql` 中定义
- 规则数据在测试启动时自动加载

### 关于测试隔离
- 使用 `@Transactional` 确保测试数据不互相影响
- 每个测试方法创建独立的发票数据和JEXL上下文

## 总结

该测试方案专注于 `executeRule` 方法的核心逻辑验证，通过反射精确控制测试范围，确保：

1. **补全规则优先执行** - 验证执行顺序正确
2. **校验规则随后执行** - 验证校验逻辑正确  
3. **错误处理机制** - 验证失败场景处理
4. **数据完整性** - 验证补全和校验的数据结果 