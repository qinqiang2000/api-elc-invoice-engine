package com.kingdee.fpy.utils;


import com.kingdee.fpy.commom.ResultType;

public class JexlException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    public JexlException(ResultType resultType) {
        super(resultType.getMessage(), (Throwable)null, false, false);
        this.code = resultType.getCode();
    }

    /** @deprecated */
    public JexlException(String code, String description) {
        super(description, (Throwable)null, false, false);
        this.code = code;
    }

    public JexlException(ResultType resultType, String description) {
        super(description, (Throwable)null, false, false);
        this.code = resultType.getCode();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}