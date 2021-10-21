package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyShowcaseCity;
import com.example.hbculturestat.mapper.FyShowcaseCityMapper;
import com.example.hbculturestat.service.IFyShowcaseCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产展示传习场所表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Service
public class FyShowcaseCityServiceImpl extends ServiceImpl<FyShowcaseCityMapper, FyShowcaseCity> implements IFyShowcaseCityService {

    @Autowired
    private FyShowcaseCityMapper fyShowcaseCityMapper;
    @Override
    public List<FyShowcaseCity> getFyShowcase() {
        return fyShowcaseCityMapper.getFyShowcase();
    }
}
