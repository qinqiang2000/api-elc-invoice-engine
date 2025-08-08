# AI 规则生成模块说明（JEXL）

本模块基于大语言模型（默认 gpt-5-mini）自动生成本系统可执行的 JEXL 规则，并在生成后进行本地语法校验（编译），可选地保存到数据库（默认不保存）。

适用角色：
- 新接手开发：了解架构、入口、扩展点，便于优化和功能增强
- 测试人员：快速运行本地/远端测试、构造请求、观察日志验证
- 代码检视：定位关键类、日志位置、故障排查流程

---

## 1. 总览
- 默认模型：`gpt-5-mini`（中国地区需‘魔法’访问，可通过 `llm.model` 覆盖）
- 默认不保存数据库：API 请求未传 `save` 或传 `false` 时，仅返回规则，不入库
- 语法校验：使用本地 `JexlEngine.createScript(...)` 对 `applyTo` 与 `ruleExpression` 进行编译校验，返回错误摘要
- 失败自动修复：当首次语法校验失败，会携带错误摘要回发给 LLM 进行重新生成（受 `maxRetries` 限制）
- DB 函数：运行期允许使用 `db` 命名空间（`DynamicQueryService`）进行安全的只读查询（已在 `JexlConfig`/`JexlExecutionService` 注册）。

---

## 2. 目录结构与关键类

下面是与“AI 生成 JEXL 规则”相关的目录树。标注 [新增] 的为本次新增，(轻微改动) 为小范围改动。

```text
src/
  main/
    java/
      com/kingdee/fpy/
        ai/                            [新增]
          controller/
            AiRuleGenerationController.java          # 规则生成 API 控制器 [新增]
          rules/
            RuleGenerationService.java               # 规则生成服务接口 [新增]
            LlmRuleGenerationService.java            # 规则生成实现（含失败修复闭环） [新增]
            RulePromptBuilder.java                   # 统一 system/user prompt [新增]
          validation/
            JexlValidationService.java               # JEXL 语法编译校验 [新增]
          llm/
            LlmClient.java                           # 供应商无关 LLM 接口 [新增]
            OpenAiLlmClient.java                     # OpenAI 实现，含详细日志 [新增]
          config/
            LlmProperties.java                       # LLM 配置（默认模型 gpt-5-mini） [新增]
        controller/
          jexl/
            JexlConfig.java                          # 注册 math/integer/double/db 命名空间（轻微改动）

  test/
    java/
      com/kingdee/fpy/
        ai/
          rules/
            RulePromptBuilderTest.java               # 提示词单测 [新增]
            LlmRuleGenerationServiceTest.java        # 生成->修复流程（stub） [新增]
          validation/
            JexlValidationServiceTest.java           # 语法校验单测 [新增]
          controller/
            AiRuleGenerationControllerIT.java        # 端到端（stub LLM） [新增]
            AiRuleGenerationControllerRealIT.java    # 端到端（真实 LLM，需 -Dllm.api-key）[新增]

    resources/
      schema-h2.sql                                  # local profile 用 H2 建表 [新增]
      data-h2.sql                                    # local profile 用样例数据 [新增]

  main/
    resources/
      application-local.properties                   # H2 本地运行 profile（自动建表与灌数） [新增]
      application.properties                         # 远程 MySQL（默认）

docs/
  ai-rule-generation-zh.md                           # 本说明文档 [新增]
```

- 其他复用（非新增）：
  - `InvoiceRules` 实体、`InvoiceRulesService`/`InvoiceRulesServiceImpl`、`InvoiceRulesController`（保存/管理规则）

### 2.1 db 命名空间函数（与运行环境保持一致）
- 定义位置：`com.kingdee.fpy.service.cel.JexlExecutionService.DatabaseFunctions`
- 可用函数（JEXL）：
  - `db.query(tableName:String, column:String, conditions:Map) -> String`
  - `db.queryOne(tableName:String) -> Map`
  - `db.queryOne(tableName:String, conditions:Map) -> Map`
  - `db.queryOne(tableName:String, columns:List, conditions:Map) -> Map`
  - `db.getAllTables() -> List`
- 示例：
  - 读取组织编码：
    ```text
    db.query('t_org_org','fnumber',{'fname': invoice.AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName})
    ```

---

## 3. 配置与启动

### 3.1 Key 配置（推荐）
- 环境变量：
  ```bash
  export OPENAI_API_KEY='你的真实Key'
  ```
- 或 JVM 参数：
  ```bash
  -Dllm.api-key=你的真实Key
  ```

### 3.2 Profile 切换
- 默认 profile：使用 `application.properties` 中的远程 MySQL
- 本地（无远端 DB）profile：`local`
  ```bash
  # 本地内存库（H2），自动建表与少量数据
  SPRING_PROFILES_ACTIVE=local mvn spring-boot:run
  ```
  - 配置文件：`src/main/resources/application-local.properties`
  - 初始化脚本：
    - `src/test/resources/schema-h2.sql`
    - `src/test/resources/data-h2.sql`

### 3.3 切换到 DeepSeek（OpenAI 兼容）
- 仅需在配置文件中覆盖以下项，无需改动代码：
  - `llm.base-url`
  - `llm.model`
  - `llm.api-key`
- 示例（放在 `application.properties` 或 `application-local.properties` 中）：
  ```properties
  llm.base-url=https://api.deepseek.com
  llm.model=deepseek-chat
  llm.api-key=sk-ec925fcc3d5242c6b05bd69e05fb8e76
  ```
- 说明：
  - DeepSeek 提供 OpenAI 接口兼容的 `/chat/completions`，因此只需更换 Base URL 与模型名即可。
  - `llm.provider` 保持默认即可（当前实现为 OpenAI 兼容客户端）。
- 可选：也可以通过环境变量或 JVM 方式提供 Key：
  - 环境变量（推荐）：
    ```bash
    export OPENAI_API_KEY='sk-ec925fcc3d5242c6b05bd69e05fb8e76'
    ```
  - JVM 参数：
    ```bash
    -Dllm.api-key=sk-ec925fcc3d5242c6b05bd69e05fb8e76
    ```

---

## 4. API 使用

### 4.0 接口规范
- 路径：`/api/ai/rules/jexl/generate`
- 方法：`POST`
- Header：`Content-Type: application/json`
- 请求体（字段与默认）：
  - `ruleType` (number, 必填)：1=校验，2=补全
  - `fieldPath` (string, 可选)：可省略，LLM 会依据业务意图与 `invoice` 结构自动推断并在输出中填写（目标字段）
  - `businessIntent` (string, 必填)：自然语言业务意图
  - `country` (string, 可选)：国家二字码，用于上下文提示
  - `tags` (string|array, 可选)：行业标签
  - `priority` (number, 可选，默认 0)
  - `invoiceSample` (object, 可选)：样例发票，用于帮助模型理解（不做执行级校验）
  - `save` (boolean, 可选，默认 false)：是否落库到 `InvoiceRules`
  - `maxRetries` (number, 可选，默认 2)：语法失败时的修复尝试次数

- 响应体：
  - `generatedRule` (object)：`InvoiceRules` 结构（与实体字段一致，包含 LLM 推断的 `fieldPath` 若请求未提供）
  - `saved` (boolean)：是否已落库
  - `ruleId` (number|null)：保存成功返回主键 ID
  - `attempts` (array)：每次生成/修复尝试

- 关键约定：
  - `applyTo`：仅作为“触发条件”（Boolean），例如“当电子邮箱为空且可从 DB 查到供应商邮箱时”。
  - `fieldPath`：被校验/被补全的目标字段路径（例如 `invoice.AccountingSupplierParty.Party.Contact.ElectronicMail`）。
  - `ruleExpression`：最终执行逻辑（必须返回 Boolean）。补全型规则应尽量只包含最小必要的写回动作，避免把复杂条件重复写入。

- 示例（补全型 Best Practice：根据供应商名称补全邮箱）：
  - `businessIntent`: “根据供应商名字补全供应商邮件地址”
  - 期望生成：
    - `fieldPath`: `invoice.AccountingSupplierParty.Party.Contact.ElectronicMail`
    - `applyTo`（示意）：
      ```text
      invoice != null &&
      invoice.AccountingSupplierParty?.Party?.PartyName?.Name instanceof java.lang.String &&
      invoice.AccountingSupplierParty.Party.PartyName.Name.trim().length() > 0 &&
      (invoice.AccountingSupplierParty?.Party?.Contact?.ElectronicMail == null ||
       !(invoice.AccountingSupplierParty.Party.Contact.ElectronicMail instanceof java.lang.String))
      ```
    - `ruleExpression`（示意，最小写回）：
      ```text
      (
        supplier = db.queryOne('suppliers', ['email'], {'name': invoice.AccountingSupplierParty.Party.PartyName.Name})
      ) != null && supplier.email instanceof java.lang.String && supplier.email.matches('^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$') &&
      (
        invoice.AccountingSupplierParty.Party.Contact == null ?
          invoice.AccountingSupplierParty.Party.put('Contact', {'ElectronicMail': supplier.email}) :
          invoice.AccountingSupplierParty.Party.Contact.put('ElectronicMail', supplier.email)
      ) != null
      ```

---

## 5. 日志与排错

- LLM 请求与响应日志（INFO）：
  - 类：`com.kingdee.fpy.ai.llm.OpenAiLlmClient`
  - 内容：
    - 请求：`provider`、`model`、`url`、是否 `jsonResponse`、`messages`（system+user，截断至 1000 字符）
    - 响应：`model`、`contentPreview`（截断至 1000 字符）
  - 不会打印 API Key

- 常见问题：
  - `unsupported_value: temperature`：某些模型仅支持默认温度，已在代码中移除设置
  - 语法错误：`attempts[n].errorSummary` 会返回编译错误信息（包含字段名与错误摘要）
  - LLM 返回非 JSON：生成器会报告 `Invalid JSON: ...`，并走修复循环

---

## 6. 测试与验证

- 单元测试（核心）
  - `RulePromptBuilderTest`：提示词包含 DB 命名空间等约束
  - `JexlValidationServiceTest`：编译检测
  - `LlmRuleGenerationServiceTest`：生成→修复流程（使用 stub LLM）

- 集成测试（端到端，local profile）
  - 使用 stub：`AiRuleGenerationControllerIT`（确保接口返回结构正确）
  - 真实 LLM：`AiRuleGenerationControllerRealIT`
    - 仅当提供 `-Dllm.api-key=...` 时启用：
      ```bash
      mvn -q -Dspring.profiles.active=local \
          -Dllm.api-key='你的Key' \
          -Dtest=com.kingdee.fpy.ai.controller.AiRuleGenerationControllerRealIT test
      ```

---

## 7. 扩展点

- Prompt 策略：`RulePromptBuilder`
  - 可添加 few-shot 示例、特定国家/行业约束、输出字段模版

- LLM 客户端：
  - 新增实现：例如 `AzureOpenAiLlmClient`、`OllamaLlmClient`，并通过 `LlmProperties.provider` 条件装配

- 校验增强：
  - 目前强制 JEXL 语法编译通过；可选增加“执行级校验”（带样例 `invoice`），确保逻辑可运行

- DB 命名空间（`db`）
  - 已注册在 JEXL 的 `namespaces` 中，默认只读安全查询（参数化、表/列名校验），可视需要扩展方法

---

## 8. 安全与合规
- 不打印 API Key，不在日志中输出敏感数据
- LLM 输出被限定为严格 JSON（对齐 `InvoiceRules`），避免注入和不可解析内容
- JEXL 语法编译严格校验；`db` 查询受限于安全校验器

---

## 9. 快速文件导航
- 控制器：`com.kingdee.fpy.ai.controller.AiRuleGenerationController`
- 生成服务：`com.kingdee.fpy.ai.rules.LlmRuleGenerationService`
- 提示词：`com.kingdee.fpy.ai.rules.RulePromptBuilder`
- 语法校验：`com.kingdee.fpy.ai.validation.JexlValidationService`
- LLM 接入：`com.kingdee.fpy.ai.llm.OpenAiLlmClient`
- 配置：`com.kingdee.fpy.ai.config.LlmProperties`
- JEXL 命名空间：`com.kingdee.fpy.controller.jexl.JexlConfig`
- 集成测试（真实）：`com.kingdee.fpy.ai.controller.AiRuleGenerationControllerRealIT`

---

## 10. 变更历史（要点）
- 默认模型设为 `gpt-5-mini`
- 生成接口默认不保存数据库（`save=false`）
- LLM 请求/响应日志增强，便于验真与排错
- `local` profile 支持 H2 内存库，自动建表与最小数据

---

## 11. 规则书写建议（可读与健壮）

- 优先使用点号访问：
  - 建议：`invoice.totalAmount`
  - 仅在必要时使用 Map 取值：`invoice.get('totalAmount')`

- 先判空再取值：
  - 建议：`invoice != null && invoice.totalAmount != null && ...`

- 数值解析要兼容 Number 与 String，避免运行时异常：
  - 不要直接：`double.parseDouble(invoice.totalAmount)`（当为非数值字符串会抛 `NumberFormatException`）
  - 建议：
    ```text
    (
      (x instanceof java.lang.Number && x.doubleValue() > 0) ||
      (x instanceof java.lang.String && x.matches('\\d+(\\.\\d+)?') && double.parseDouble(x) > 0)
    )
    ```

- 合理分组与括号：
  - 用括号明确优先级，减少重复取值与深层嵌套，提升可读性与维护性。

- 命名空间可用：`math`, `integer`, `double`, `db`
  - 示例：`double.parseDouble('123.45')`、`math:abs(-1)`

- 错误信息（`errorMessage`）建议：
  - 简洁明确，包含字段名与期望，例如：`"总金额必须大于0"`、`"买方税号须为15-20位大写字母数字"`

- 示例（推荐写法：校验发票总金额 > 0）：
  ```text
  invoice != null && invoice.totalAmount != null && (
    (invoice.totalAmount instanceof java.lang.Number && invoice.totalAmount.doubleValue() > 0) ||
    (invoice.totalAmount instanceof java.lang.String && invoice.totalAmount.matches('\\d+(\\.\\d+)?') && double.parseDouble(invoice.totalAmount) > 0)
  )
  ``` 