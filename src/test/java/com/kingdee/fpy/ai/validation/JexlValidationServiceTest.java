package com.kingdee.fpy.ai.validation;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.junit.Before;
import org.junit.Test;

public class JexlValidationServiceTest {

    private JexlValidationService service;

    @Before
    public void setup() {
        service = new JexlValidationService();
        // Inject a plain engine via reflection (no Spring here)
        try {
            java.lang.reflect.Field f = JexlValidationService.class.getDeclaredField("jexlEngine");
            f.setAccessible(true);
            JexlEngine engine = new JexlBuilder().create();
            f.set(service, engine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidateOk() {
        List<JexlValidationService.ValidationError> errors = service.validate("invoice != null", "1 + 1 == 2");
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testValidateSyntaxError() {
        List<JexlValidationService.ValidationError> errors = service.validate(null, "1 + ");
        assertFalse(errors.isEmpty());
    }
} 