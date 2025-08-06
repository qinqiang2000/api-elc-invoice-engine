package com.kingdee.fpy;

import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.service.cel.CelValidationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CelValidationService celValidationService;

    @Test
    public void test(){
        // 准备测试数据
        JSONObject request = new JSONObject();
        request.put("validationRule", "invoice.age >= 18");

        JSONObject invoice = new JSONObject();
        invoice.put("age", 25);
        request.put("invoice", invoice);
    }
    @Test
    public void testCreateUser_Success() throws Exception {
        // 准备测试数据
        JSONObject request = new JSONObject();
        request.put("validationRule", "invoice.age >= 18");

        JSONObject invoice = new JSONObject();
        invoice.put("age", 25);
        request.put("invoice", invoice);

        // 模拟服务方法返回
        Mockito.when(celValidationService.validate(anyString(), any(Map.class))).thenReturn(true);
        Mockito.when(celValidationService.evaluate(anyString(), any(Map.class))).thenReturn(true);

        // 执行测试
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request.toJSONString()))
                .andExpect(status().isOk())
                .andExpect(content().string("校验补全成功"));
    }

    @Test
    public void testCreateUser_ValidationFailed() throws Exception {
        // 准备测试数据
        JSONObject request = new JSONObject();
        request.put("validationRule", "invoice.age >= 18");

        JSONObject invoice = new JSONObject();
        invoice.put("age", 15); // 未成年
        request.put("invoice", invoice);

        // 模拟服务方法返回
        Mockito.when(celValidationService.validate(anyString(), any(Map.class))).thenReturn(false);

        // 执行测试
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request.toJSONString()))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("校验失败"));
    }

    @Test
    public void testCreateUser_EvaluateCalledOnSuccess() throws Exception {
        // 准备测试数据
        JSONObject request = new JSONObject();
        request.put("validationRule", "invoice.name.matches('[a-zA-Z]+')");

        JSONObject invoice = new JSONObject();
        invoice.put("name", "John");
        request.put("invoice", invoice);

        // 模拟服务方法返回
        Mockito.when(celValidationService.validate(anyString(), any(Map.class))).thenReturn(true);
        Mockito.when(celValidationService.evaluate(anyString(), any(Map.class))).thenReturn(true);

        // 执行测试
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request.toJSONString()))
                .andExpect(status().isOk())
                .andExpect(content().string("校验补全成功"));
    }
}
