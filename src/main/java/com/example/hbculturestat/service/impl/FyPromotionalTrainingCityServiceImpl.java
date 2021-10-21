package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyPromotionalTraining;
import com.example.hbculturestat.entity.FyPromotionalTrainingCity;
import com.example.hbculturestat.mapper.FyPromotionalTrainingCityMapper;
import com.example.hbculturestat.service.IFyPromotionalTrainingCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产宣传展示培训表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Service
public class FyPromotionalTrainingCityServiceImpl extends ServiceImpl<FyPromotionalTrainingCityMapper, FyPromotionalTrainingCity> implements IFyPromotionalTrainingCityService {

    @Autowired
    private FyPromotionalTrainingCityMapper fyPromotionalTrainingCityMapper;
    @Override
    public List<FyPromotionalTraining> getFyPromotionalTraining() {
        return fyPromotionalTrainingCityMapper.getFyPromotionalTraining();
    }
}
