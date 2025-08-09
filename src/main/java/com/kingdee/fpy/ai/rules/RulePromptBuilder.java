package com.kingdee.fpy.ai.rules;

import com.alibaba.fastjson.JSON;
import com.kingdee.fpy.ai.llm.LlmClient.Message;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RulePromptBuilder {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BuildParams {
        public int ruleType; // 1 validate, 2 completion
        public String fieldPath;
        public String businessIntent;
        public String country;
        public String tags;
        public Integer priority;
        public Map<String, Object> invoiceSample;
    }

    private volatile String staticInvoiceSampleJson; // cached raw JSON for prompt

    public List<Message> buildInitial(BuildParams p) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("system", systemPrompt()));
        messages.add(new Message("user", userPrompt(p)));
        return messages;
    }

    public List<Message> buildRepair(BuildParams p, String previousJson, String errorSummary) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("system", systemPrompt()));
        StringBuilder sb = new StringBuilder();
        sb.append("上一版候选 JSON 有语法问题，请严格按照 JSON Schema 修正，仅输出修正后的 JSON。\n");
        sb.append("错误摘要：").append(errorSummary).append("\n");
        sb.append("先前候选：\n").append(previousJson).append("\n\n");
        sb.append("上下文（只读）：\n").append(userPrompt(p));
        messages.add(new Message("user", sb.toString()));
        return messages;
    }

    private String userPrompt(BuildParams p) {
        StringBuilder sb = new StringBuilder();
        sb.append("业务意图：").append(p.businessIntent).append("\n");
        sb.append("上下文：\n");
        sb.append("- ruleType: ").append(p.ruleType).append("\n");
        if (p.fieldPath != null && !p.fieldPath.trim().isEmpty()) {
            sb.append("- fieldPath: ").append(p.fieldPath).append("\n");
        } else {
            sb.append("- 说明：未提供 fieldPath，请你基于业务意图与 invoice 结构推断最合适的 fieldPath，并在输出 JSON 中填写。\n");
        }
        if (p.country != null) sb.append("- country: ").append(p.country).append("\n");
        if (p.tags != null) sb.append("- tags: ").append(p.tags).append("\n");
        if (p.priority != null) sb.append("- priority: ").append(p.priority).append("\n");

        // Always include static invoice sample as reference for the invoice structure
        String sampleJson = getStaticInvoiceSampleJson();
        if (sampleJson != null) {
            sb.append("- 说明：invoice 字段命名遵循 UBL 2.1 标准，请以 UBL 2.1 规范理解字段语义。\n");
            sb.append("- invoice 示例（仅供理解结构，变量名为 invoice，不可修改）：\n");
            sb.append(sampleJson).append("\n");
            log.info("Prompt includes invoice sample: length={} chars", sampleJson.length());
        } else if (p.invoiceSample != null) {
            // fallback to provided sample
            sb.append("- 说明：invoice 字段命名遵循 UBL 2.1 标准，请以 UBL 2.1 规范理解字段语义。\n");
            sb.append("- invoice 示例（仅供理解结构）：\n");
            String json = JSON.toJSONString(p.invoiceSample);
            sb.append(json).append("\n");
            log.info("Prompt includes provided invoice sample: length={} chars", json.length());
        } else {
            log.warn("Prompt WITHOUT invoice sample (neither classpath/file nor provided)");
        }

        sb.append("请仅返回严格 JSON（与 InvoiceRules 字段一致），不得包含 Markdown 或解释文字。\n");
        return sb.toString();
    }

    private String systemPrompt() {
        return String.join("\n",
            "你是一名发票规则工程师，负责为本系统生成 Apache Commons JEXL 3 基于的规则。",
            "强制约束：",
            "1) 变量上下文：只有一个变量 invoice（Map/JSON），优先使用点号访问，如 invoice.totalAmount。invoice 恒不为 null，禁止写 invoice != null 判空。",
            "2) 允许命名空间：math, integer, double, db。另外，以下Java类型已暴露到JEXL上下文：Double, Integer, Long, Float, Math, String。",
            "   - db.query(tableName:String, column:String, conditions:Map) -> String",
            "   - db.getAllTables() -> List",
            "   - Double.parseDouble(str) -> double（推荐用于字符串转数值）",
            "   - Integer.parseInt(str) -> int",
            "3) 规则类型与三要素：",
            "   - fieldPath：被校验/被补全的目标字段路径，必须以 'invoice.' 开头（如 invoice.AccountingSupplierParty.Party.Contact.ElectronicMail）。",
            "   - applyTo：触发条件（Boolean）。仅描述何时应用本规则，例如：字段缺失/为空、名称存在等。不要在 applyTo 中重复执行昂贵的 DB 查询。",
            "   - ruleExpression：最终执行逻辑（必须返回 Boolean）。",
            "     • ruleType=1（校验）：仅进行校验判断，不得修改 invoice。",
            "     • ruleType=2（补全）：在满足 applyTo 时，仅进行最小必要的补全步骤（可执行一次 DB 查询并写回目标 fieldPath）。",
            "   - 严格禁止：在 ruleExpression 中重复任何已在 applyTo 中出现的条件/判空；严禁ruleExpression做条件判断，可以直接假设 applyTo 已为 true。",
            "4) 当用户未提供 fieldPath 时：你需要基于业务意图与 invoice 结构自行推断最合适的 fieldPath，并在输出 JSON 中填写。",
            "5) 表达式风格（可读且健壮，避免运行时异常）：",
            "   - 仅对字段判空：如 invoice.totalAmount != null，不要写 invoice != null。",
            "   - 数值处理需同时兼容 Number 与 String：",
            "     (x instanceof java.lang.Number && x.doubleValue() > 0) ||",
            "     (x instanceof java.lang.String && x.matches('\\\\d+(\\\\.\\\\d+)?') && Double.parseDouble(x) > 0)",
            "   - 字符串转数值：使用 Double.parseDouble(str) 而非 double.parseDouble(str)",
            "   - 禁止直接对未知字符串执行数值转换（应先验证格式，防止 NumberFormatException）",
            "   - 合理分组与括号明确优先级，减少重复取值与过深嵌套，提升可读性",
            "   - 若需 DB：在 ruleExpression 顶部以局部变量承接一次 DB 结果（例如 taxId = db.query(...)），严禁重复查询。",
            "6) 输出：仅返回严格 JSON，字段使用 InvoiceRules 实体字段：",
            "   {country, tradeArea, province, city, tags, ruleCode, ruleName, ruleType, active, applyTo, errorMessage, fieldPath, priority, ruleExpression, startTime, endTime}",
            "   其中 ruleType、fieldPath、applyTo、ruleExpression 必填；active 默认 true；priority 默认 0；",
            "   ruleCode 可生成如 'AI-sys-<timestamp>'；ruleName 可从业务意图归纳。",
            "7) 字段语义：invoice 的字段命名遵循 UBL 2.1 标准，请以 UBL 2.1 规范理解这些字段的业务含义。",
            "禁止输出多余文本、注释或 Markdown。"
        );
    }

    private String getStaticInvoiceSampleJson() {
        if (staticInvoiceSampleJson != null) return staticInvoiceSampleJson;
        synchronized (this) {
            if (staticInvoiceSampleJson != null) return staticInvoiceSampleJson;
            // Preferred: classpath kdubl.json
            try {
                ClassPathResource resource = new ClassPathResource("kdubl.json");
                if (resource.exists()) {
                    try (InputStream is = resource.getInputStream();
                         BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        staticInvoiceSampleJson = sb.toString().trim();
                        log.info("Loaded invoice sample from classpath: kdubl.json ({} chars)", staticInvoiceSampleJson.length());
                        return staticInvoiceSampleJson;
                    }
                }
            } catch (Exception e) {
                log.warn("Failed loading kdubl.json from classpath: {}", e.getMessage());
            }
            // Fallback: project root kdubl.json
            try {
                File f = new File("kdubl.json");
                if (f.exists() && f.isFile()) {
                    try (InputStream is = new FileInputStream(f);
                         BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        staticInvoiceSampleJson = sb.toString().trim();
                        log.info("Loaded invoice sample from file: {} ({} chars)", f.getAbsolutePath(), staticInvoiceSampleJson.length());
                        return staticInvoiceSampleJson;
                    }
                }
            } catch (Exception e) {
                log.warn("Failed loading kdubl.json from file: {}", e.getMessage());
            }
            // Backward compat: classpath tw_NL_DE.json
            try {
                ClassPathResource resource = new ClassPathResource("tw_NL_DE.json");
                if (resource.exists()) {
                    try (InputStream is = resource.getInputStream();
                         BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        staticInvoiceSampleJson = sb.toString().trim();
                        log.info("Loaded invoice sample from classpath: tw_NL_DE.json ({} chars)", staticInvoiceSampleJson.length());
                        return staticInvoiceSampleJson;
                    }
                }
            } catch (Exception e) {
                log.warn("Failed loading tw_NL_DE.json from classpath: {}", e.getMessage());
            }
            // Backward compat: project root tw_NL_DE.json
            try {
                File f = new File("tw_NL_DE.json");
                if (f.exists() && f.isFile()) {
                    try (InputStream is = new FileInputStream(f);
                         BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        staticInvoiceSampleJson = sb.toString().trim();
                        log.info("Loaded invoice sample from file: {} ({} chars)", f.getAbsolutePath(), staticInvoiceSampleJson.length());
                        return staticInvoiceSampleJson;
                    }
                }
            } catch (Exception e) {
                log.warn("Failed loading tw_NL_DE.json from file: {}", e.getMessage());
            }
            log.warn("Invoice sample not found; prompt will not include invoice example.");
            return null;
        }
    }
} 