package com.kingdee.fpy;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Arrays;

@Slf4j
@EnableTransactionManagement(order = 10) // 开启事务，并设置order值，默认是Integer的最大值
@ComponentScan(basePackages = { "com.kingdee" })
//@EnableDiscoveryClient
@SpringBootApplication
@EnableAsync
@EnableScheduling
@MapperScan("com.kingdee.fpy.mapper")
public class ApiInvoiceXmlApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ApiInvoiceXmlApplication.class, args);
        Environment env = ctx.getEnvironment();
        log.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
        log.info("LLM config: baseUrl={}, model={}, provider={}",
            env.getProperty("llm.base-url"), env.getProperty("llm.model"), env.getProperty("llm.provider"));
    }
    @Bean
    public ExpressionParser expressionParser() {
        return new SpelExpressionParser();
    }
}
