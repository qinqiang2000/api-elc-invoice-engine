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
}
