/*
package com.kingdee.fpy.service.cel;


import dev.cel.common.CelValidationResult;
import dev.cel.common.types.SimpleType;
import dev.cel.compiler.CelCompiler;
import dev.cel.compiler.CelCompilerFactory;
import dev.cel.runtime.CelRuntime;
import dev.cel.runtime.CelRuntimeFactory;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

*/
/**
 * @Author: 金帆
 * @Date: 2025/7/29 15:48
 * @Description:
 *//*

@Service
@Slf4j
public class CelValidationService {

    private final CelCompiler celCompiler;
    private final CelRuntime celRuntime;

    public CelValidationService() {
        this.celCompiler =
                CelCompilerFactory.standardCelCompilerBuilder().addVar("invoice", SimpleType.ANY).addVarDeclarations().build();
        this.celRuntime = CelRuntimeFactory.standardCelRuntimeBuilder().build();
    }

    public boolean validate(String expression, Map<String, Object> variables) {
        try {
            // 编译表达式
            CelValidationResult compiled = celCompiler.compile(expression);

            // 检查是否有编译错误
            if (compiled.hasError()) {
                throw new IllegalArgumentException("编译CEL表达式失败: " + compiled.getErrorString());
            }

            // 创建执行环境
            CelRuntime.Program program = celRuntime.createProgram(compiled.getAst());

            // 检查程序创建是否有错误
            if (program == null) {
                throw new IllegalArgumentException("创建CEL执行程序失败");
            }

            // 执行并获取结果
            Object result = program.eval(variables);

            if (result instanceof Boolean) {
                return (Boolean) result;
            }
            throw new IllegalArgumentException("CEL表达式必须返回布尔值");
        } catch (Exception e) {
            log.error("CEL表达式执行失败", e);
            throw new RuntimeException(e.getMessage());
        }
    }

    public Object evaluate(String expression, Map<String, Object> variables) {
        try {
            // 编译表达式
            CelValidationResult compiled = celCompiler.compile(expression);

            // 检查是否有编译错误
            if (compiled.hasError()) {
                throw new IllegalArgumentException("编译CEL表达式失败: " + compiled.getErrorString());
            }

            // 创建执行环境
            CelRuntime.Program program = celRuntime.createProgram(compiled.getAst());

            // 检查程序创建是否有错误
            if (program == null) {
                throw new IllegalArgumentException("创建CEL执行程序失败");
            }

            // 执行并获取结果
            return  program.eval(variables);
        } catch (Exception e) {
            log.error("CEL表达式执行失败", e);
            throw new RuntimeException(e.getMessage());
        }
    }

}
*/
