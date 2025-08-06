package com.kingdee.fpy.config.dbconfig;

import java.util.Map;
import lombok.Data;

/**
 * @author chenhuanwei
 * @date 2023/12/1
 */
@Data
public class SqlParseVo {


    private String tableName;
    private String newTableName;

    private Map<String,String> columnMap;


    public SqlParseVo(String tableName) {
        this.tableName = tableName;
    }
}
