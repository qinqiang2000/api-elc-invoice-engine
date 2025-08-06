package com.kingdee.fpy.service.cel;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Service;

/**
 * @Author: 金帆
 * @Date: 2025/7/29 15:48
 * @Description:
 */
@Service
public class SpelValidationService {
    @Autowired
    private ExpressionParser expressionParser;

    public void process(Map<String, Object> invoice,String validationString,String execoutString) {
        StandardEvaluationContext context = new StandardEvaluationContext(invoice);
        context.addPropertyAccessor(new MapAccessor() {
            @Override
            public boolean canRead(EvaluationContext ctx, Object target, String name) {
                return (target instanceof Map);
            }
        });
        // 动态校验
        // validationString ="firstName != null && lastName != null && firstName.length() > 0 && lastName.length"()> 0";
        Expression validationExpr = expressionParser.parseExpression(validationString);
        boolean isValid = validationExpr.getValue(context, Boolean.class);
        if (!isValid) {
            throw new IllegalArgumentException("Invalid user data");
        }

        // 动态补全
        //execoutString = "fullName = firstName + ' ' + lastName";
        Expression fullNameExpr = expressionParser.parseExpression(execoutString);
        Object value = fullNameExpr.getValue(context);
        System.out.println(value);
        System.out.println(invoice);
    }
}
