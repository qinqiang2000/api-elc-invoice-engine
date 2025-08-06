//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kingdee.fpy.commom;

import lombok.Getter;

@Getter
public enum ResultType {
    SUCCESS("0000", "Success"),
    CLIENT_FAIL("400","Client Failed"),
    PARAM_FAIL("400001","KDUBL XML Verification Failed"),
    PROTOCOL("400002","Protocol is null"),
    UNAUTHORIZED("401","Unauthorized"),
    FORBIDDEN("403","Forbidden"),
    FORBIDDEN_OUTPUT("403001","OUTPUT FORBIDDEN"),
    SERVER_FAIL("500","server fail");

    public String code;
    public String message;

    private ResultType(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
