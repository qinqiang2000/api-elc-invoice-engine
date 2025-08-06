package com.kingdee.fpy.commom;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PiaoZoneResult<T> {
    protected String errcode;
    protected String description;
    private T data;
    private String traceId;
    private String access_token;
}
