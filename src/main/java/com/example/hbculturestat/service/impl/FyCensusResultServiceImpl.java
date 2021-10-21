package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyCensusResult;
import com.example.hbculturestat.mapper.FyCensusResultMapper;
import com.example.hbculturestat.service.IFyCensusResultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产普查成果表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Service
public class FyCensusResultServiceImpl extends ServiceImpl<FyCensusResultMapper, FyCensusResult> implements IFyCensusResultService {

    @Autowired
    private FyCensusResultMapper fyCensusResultMapper;
    @Override
    public List<FyCensusResult> getFyCensusResult() {
        return fyCensusResultMapper.getFyCensusResult();
    }
}
