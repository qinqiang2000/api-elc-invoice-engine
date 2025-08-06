package com.kingdee.fpy.commom;

import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageResult<L> extends Result {
    private List<L> items;
    private boolean hasNext;
    private Long nextCursor;
}