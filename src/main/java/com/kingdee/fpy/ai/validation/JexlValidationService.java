package com.kingdee.fpy.ai.validation;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlScript;
import org.apache.commons.jexl3.JexlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JexlValidationService {

    @Autowired
    private JexlEngine jexlEngine;

    @Data
    public static class ValidationError {
        private String field; // applyTo or ruleExpression
        private String message;
    }

    public List<ValidationError> validate(String applyTo, String ruleExpression) {
        List<ValidationError> errors = new ArrayList<>();
        if (applyTo != null && !applyTo.trim().isEmpty()) {
            try { JexlScript s = jexlEngine.createScript(applyTo); } catch (JexlException ex) { errors.add(newError("applyTo", summarize(ex))); }
        }
        if (ruleExpression == null || ruleExpression.trim().isEmpty()) {
            ValidationError e = new ValidationError(); e.setField("ruleExpression"); e.setMessage("ruleExpression is required"); errors.add(e);
        } else {
            try { JexlScript s = jexlEngine.createScript(ruleExpression); } catch (JexlException ex) { errors.add(newError("ruleExpression", summarize(ex))); }
        }
        return errors;
    }

    private ValidationError newError(String field, String msg) {
        ValidationError e = new ValidationError();
        e.setField(field);
        e.setMessage(msg);
        return e;
    }

    private String summarize(Exception ex) {
        String msg = ex.getMessage();
        if (msg == null) return ex.toString();
        return msg.replaceAll("\n", " ");
    }
} 