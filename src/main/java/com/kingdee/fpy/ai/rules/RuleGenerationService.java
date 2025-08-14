package com.kingdee.fpy.ai.rules;

import com.kingdee.fpy.model.InvoiceRules;
import java.util.List;
import java.util.Map;

public interface RuleGenerationService {

    class Request {
        public int ruleType;              // 1=校验，2=补全
        public String fieldPath;          // 可选：缺省时由 LLM 基于业务意图与 invoice 结构推断
        public String businessIntent;     // 必填：自然语言业务意图
        public String country;            // 可选
        public String tags;               // 可选
        public Integer priority;          // 可选，默认 0
        public Map<String, Object> invoiceSample; // 可选
        public boolean save;              // 可选，默认 false
        public Integer maxRetries;        // 可选，默认配置
        public GenerationType generationType = GenerationType.FULL; // 生成类型，默认完整生成
    }

    class AttemptInfo {
        public int index;
        public boolean syntaxOk;
        public String errorSummary;
        public String candidateJson;
    }

    class Response {
        public InvoiceRules generatedRule;
        public boolean saved;
        public Long ruleId;
        public List<AttemptInfo> attempts;
    }

    Response generate(Request req);
} 