package com.kingdee.fpy.config.application;

import javax.servlet.MultipartConfigElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author xufeng_liu
 */
@Configuration
public class SystemConfigurerInterceptor implements WebMvcConfigurer {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(businessTokenInterceptor).addPathPatterns("/v1/**");
//        registry.addInterceptor(baseTokenInterceptor).addPathPatterns("/base/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub

        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /**
    * @Author xufeng_liu
    * @Description //TODO  设置最大xml文件的上传值
    * @Date 2024/12/6 10:46
    * @Param []
    * @return javax.servlet.MultipartConfigElement
    **/
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.parse("10MB"));
        factory.setMaxRequestSize(DataSize.parse("10MB"));
        return factory.createMultipartConfig();
    }


}
