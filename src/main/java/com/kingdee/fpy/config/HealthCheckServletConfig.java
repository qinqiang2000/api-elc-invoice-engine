package com.kingdee.fpy.config;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 健康检查配置
 * 通过自定义TomcatServletWebServerFactory在根路径添加健康检查Servlet
 * 真正绕过Spring Boot的context-path
 */
@Configuration
public class HealthCheckServletConfig {

    @Bean
    public TomcatServletWebServerFactory servletWebServerFactory() {
        return new TomcatServletWebServerFactory() {
            @Override
            protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
                // 在根路径("/")创建一个独立的Context用于健康检查
                Context rootContext = tomcat.addContext("", null);
                
                // 创建健康检查Servlet
                HttpServlet healthServlet = new HttpServlet() {
                    @Override
                    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                        resp.setContentType("application/json;charset=UTF-8");
                        resp.setStatus(HttpServletResponse.SC_OK);
                        try (PrintWriter writer = resp.getWriter()) {
                            writer.write("200");
                            writer.flush();
                        }
                    }

                };
                
                // 将健康检查Servlet添加到根路径Context
                Tomcat.addServlet(rootContext, "healthCheckServlet", healthServlet);
                rootContext.addServletMappingDecoded("/server/status", "healthCheckServlet");
                
                return super.getTomcatWebServer(tomcat);
            }
        };
    }
}