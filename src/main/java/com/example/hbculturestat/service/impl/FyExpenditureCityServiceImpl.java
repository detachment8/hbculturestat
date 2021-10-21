package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyExpenditureCity;
import com.example.hbculturestat.mapper.FyExpenditureCityMapper;
import com.example.hbculturestat.service.IFyExpenditureCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产支出表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Service
public class FyExpenditureCityServiceImpl extends ServiceImpl<FyExpenditureCityMapper, FyExpenditureCity> implements IFyExpenditureCityService {

    @Autowired
    private FyExpenditureCityMapper fyExpenditureCityMapper;
    @Override
    public List<FyExpenditureCity> getFyExpenditure() {
        return fyExpenditureCityMapper.getFyExpenditure();
    }
}
