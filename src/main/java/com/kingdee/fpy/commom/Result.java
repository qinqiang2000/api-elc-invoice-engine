//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kingdee.fpy.commom;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Result<T> {
    protected String errcode;
//    protected String description;
    protected T data;
    protected String traceId;
    protected String message;
    protected List<String> errorMsgArray = new ArrayList<>();
    protected String noise;
    protected String sign;

    public Result() {
        this.errcode = ResultType.SUCCESS.getCode();
        this.message = ResultType.SUCCESS.getMessage();
    }
    public Result(T data) {
        this.errcode = ResultType.SUCCESS.getCode();
        this.message = ResultType.SUCCESS.getMessage();
        this.data = data;
    }

    public Result(ResultType resultType) {
        this.errcode = resultType.getCode();
        this.message = resultType.getMessage();
    }
    public Result(ResultType resultType, String message) {
        this.errcode = resultType.getCode();
        this.message = message;
    }

    public Result(String errcode, String message) {
        this.errcode = errcode;
        this.message = message;
    }


    public void setResultType(com.kingdee.fpy.utils.ResultType resultType) {
        this.errcode = resultType.getCode();
        this.message = resultType.getMessage();
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> success() {
        return new Result<>();
    }

    public static <T> Result<T> error(String message) {
        return new Result<>("500", message);
    }

    public static <T> Result<T> error(String errcode, String message) {
        return new Result<>(errcode, message);
    }




    /**
     * 创建成功结果（带数据和消息）
     * @param data 数据
     * @param message 消息
     * @return Result对象
     */
    public static <T> Result<T> success(T data, String message) {
        Result<T> result = new Result<>(data);
        result.setMessage(message);
        return result;
    }

    /**
     * 创建成功结果（仅消息）
     * @param message 消息
     * @return Result对象
     */
    public static <T> Result<T> success(String message) {
        Result<T> result = new Result<>();
        result.setMessage(message);
        return result;
    }


    /**
     * 创建失败结果（使用ResultType）
     * @param resultType 结果类型
     * @return Result对象
     */
    public static <T> Result<T> error(ResultType resultType) {
        return new Result<>(resultType);
    }

    /**
     * 创建失败结果（使用ResultType和自定义消息）
     * @param resultType 结果类型
     * @param message 自定义错误消息
     * @return Result对象
     */
    public static <T> Result<T> error(ResultType resultType, String message) {
        return new Result<>(resultType, message);
    }

    /**
     * 判断是否成功
     * @return 是否成功
     */
    public boolean isSuccess() {
        return ResultType.SUCCESS.getCode().equals(this.errcode);
    }

    /**
     * 判断是否失败
     * @return 是否失败
     */
    public boolean isError() {
        return !isSuccess();
    }
}
