package com.kingdee.fpy.commom;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PostParamBase <T>{
    private T data;
    private String noise;
    private String sign;
}
