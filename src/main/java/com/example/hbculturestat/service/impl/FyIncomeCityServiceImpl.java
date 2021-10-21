package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyIncomeCity;
import com.example.hbculturestat.mapper.FyAssetsCityMapper;
import com.example.hbculturestat.mapper.FyIncomeCityMapper;
import com.example.hbculturestat.service.IFyIncomeCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产收入表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Service
public class FyIncomeCityServiceImpl extends ServiceImpl<FyIncomeCityMapper, FyIncomeCity> implements IFyIncomeCityService {

    @Autowired
    private FyIncomeCityMapper fyIncomeCityMapper;
    @Override
    public List<FyIncomeCity> getFyIncome() {
        return fyIncomeCityMapper.getFyIncome();
    }
}
