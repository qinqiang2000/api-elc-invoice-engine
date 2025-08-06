package com.kingdee.fpy.config.interceptor;

/**
 * @ClassName JacksonConfig
 * @Description TODO
 * @Author xufeng_liu
 * @Date 2025/6/9 11:07
 */
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Author xufeng_liu
* @Description // 该方法主要是去除返回json 内容里为空的key
* @Date 2025/6/9 11:42
* @return
**/
@Configuration
public class JacksonConfig {
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customizer() {
        return builder -> builder
                .serializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL) // 忽略null
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); // 日期格式优化
    }
}
