package com.kingdee.fpy.client.rpa.exception;

/**
 * RPA客户端异常
 *
 * @author Claude Code
 * @date 2025-08-11
 */
public class RpaClientException extends RuntimeException {

    private final String errorCode;
    private final int httpStatus;

    public RpaClientException(String message) {
        super(message);
        this.errorCode = null;
        this.httpStatus = 0;
    }

    public RpaClientException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
        this.httpStatus = 0;
    }

    public RpaClientException(String message, String errorCode, int httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public RpaClientException(String message, String errorCode, int httpStatus, Throwable cause) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}