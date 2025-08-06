package com.kingdee.fpy.service.imp;

import com.kingdee.fpy.mapper.RuleLogMapper;
import com.kingdee.fpy.model.RuleLog;
import com.kingdee.fpy.service.RuleLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RuleLog服务实现类
 */
@Service
public class RuleLogServiceImpl implements RuleLogService {

    @Autowired
    private RuleLogMapper ruleLogMapper;

    @Override
    public int insert(RuleLog ruleLog) {
        return ruleLogMapper.insert(ruleLog);
    }

    @Override
    public int updateById(RuleLog ruleLog) {
        return ruleLogMapper.updateById(ruleLog);
    }

    @Override
    public int deleteById(Long id) {
        return ruleLogMapper.deleteById(id);
    }

    @Override
    public RuleLog selectById(Long id) {
        return ruleLogMapper.selectById(id);
    }

    @Override
    public List<RuleLog> selectAll() {
        return ruleLogMapper.selectAll();
    }

    @Override
    public void insertBatch(List<RuleLog> ruleLogs) {
        ruleLogMapper.insertBatch(ruleLogs);
    }
}