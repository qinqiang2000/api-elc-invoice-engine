package com.kingdee.fpy.ai.llm;

import java.util.List;
import java.util.Map;

public interface LlmClient {
    /** Minimal message type for chat */
    class Message {
        public String role; // system|user|assistant
        public String content;
        public Message(String role, String content) { this.role = role; this.content = content; }
    }

    /** Options per request */
    class Options {
        public String model;
        public boolean jsonResponse;
        public Integer maxTokens;
        public Double temperature;
    }

    /** Result */
    class ChatResult {
        public String content; // assistant content
        public Map<String, Object> raw;
    }

    ChatResult chat(List<Message> messages, Options options);
} 