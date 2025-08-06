package com.kingdee.fpy.controller.jexl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.fpy.service.cel.JexlExecutionService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 金帆
 * @Date: 2025/7/31 10:15
 * @Description: JEXL控制器，演示数据库函数使用
 */
@RestController
@RequestMapping("/jexl")
@Slf4j
public class jexlController {

    @Autowired
    private  JexlExecutionService jexlService;

    @PostMapping("/api/execute")
    @ResponseBody
    public Map<String, Object> apiExecute(@RequestBody Map<String, Object> params) {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        try {
            Object expression = params.get("expression");
            JSONObject invoice = JSON.parseObject(JSON.toJSONString(params.get("invoice")));
            Object o = jexlService.executeExpression(expression.toString(), invoice);
            objectObjectHashMap.put("result", invoice);
            objectObjectHashMap.put("jexelResult", o);
        } catch (Exception e) {
            objectObjectHashMap.put("result", e.getMessage());
        }
        return objectObjectHashMap;
    }

}
