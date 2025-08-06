package com.kingdee.fpy.config.interceptor;

import brave.Tracer;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingdee.fpy.commom.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 塞入traceId
 *
 * @author chenhuanwei
 * @date 2023/3/27
 */
@RestControllerAdvice
@Slf4j
public class ControllerResponseAop implements ResponseBodyAdvice {

    @Value("${responseReturnTraceId:true}")
    private Boolean enable;
    @Autowired
    private Tracer tracer;
    @Autowired
    private Environment env;

    public ControllerResponseAop() {
        log.info("塞入traceId AOP初始化");
    }

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        //开关
        log.info("supports enable:{} true",enable);
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        try {
            String traceId = tracer.currentSpan().context().traceIdString();
            log.info("traceId:{} body:{}", traceId,body);
            if (null == body) {
                return null;
            }
            if (body instanceof Result) {
                Result result = (Result) body;
                result.setTraceId(traceId);
                return result;
            }
            if (body instanceof JSONObject) {
                JSONObject baseResult = (JSONObject) body;
                baseResult.putIfAbsent("traceId", traceId);
                return baseResult;
            }

            if (body instanceof String) {
                String str = (String) body;
                if(JSON.isValid(str)){
                    JSONObject baseResult = JSONObject.parseObject(str);
                    baseResult.putIfAbsent("traceId", traceId);

                    ObjectMapper objectMapper = new ObjectMapper();
                    return objectMapper.writeValueAsString(baseResult);

              }
            }
            return body;
        } catch (Throwable e) {
            if ("false".equals(env.getProperty("ControllerResponseAopLogOff", "false"))) {
                log.error("添加traceId异常", e);
            }
            return body;
        }
    }
}
