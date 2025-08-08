//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kingdee.fpy.utils;

import lombok.Getter;

@Getter
public enum ResultType {
    SUCCESS("200", "Success"),
    CLIENT_FAIL("400","Client Failed"),
    PARAM_FAIL("400001","KDUBL XML Verification Failed"),
    PROTOCOL("400002","Protocol is null"),
    UNAUTHORIZED("401","Unauthorized"),
    FORBIDDEN("403","Forbidden"),
    FORBIDDEN_OUTPUT("403001","OUTPUT FORBIDDEN"),
    QUERY_FAIL("500","Jexl db query fail"),
    VALID_FAIL("0001","params valid fail"),
    COMPLETE_FAIL("0002","params valid fail"),
    EXIST_FAIL("0003","invoice is exist"),

    ;

    public String code;
    public String message;

    private ResultType(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
