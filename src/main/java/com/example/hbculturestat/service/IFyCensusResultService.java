package com.example.hbculturestat.service;

import com.example.hbculturestat.entity.FyCensusResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产普查成果表 服务类
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
public interface IFyCensusResultService extends IService<FyCensusResult> {
    public List<FyCensusResult> getFyCensusResult();
}
