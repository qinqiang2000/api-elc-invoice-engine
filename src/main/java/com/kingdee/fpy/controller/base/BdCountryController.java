package com.kingdee.fpy.controller.base;

import com.kingdee.fpy.mapper.BdCountryMapper;
import com.kingdee.fpy.model.BdCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * BdCountry控制器
 * 提供国家基础数据查询接口
 */
@RestController
@RequestMapping("/api/base/country")
public class BdCountryController {

    @Autowired
    private BdCountryMapper bdCountryMapper;

    /**
     * 查询所有国家信息
     * @return 国家信息列表
     */
    @GetMapping("/all")
    public List<BdCountry> getAllCountries() {
        return bdCountryMapper.selectAll();
    }
}