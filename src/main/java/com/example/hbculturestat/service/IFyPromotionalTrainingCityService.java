package com.example.hbculturestat.service;

import com.example.hbculturestat.entity.FyPromotionalTraining;
import com.example.hbculturestat.entity.FyPromotionalTrainingCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产宣传展示培训表 服务类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
public interface IFyPromotionalTrainingCityService extends IService<FyPromotionalTrainingCity> {

    public List<FyPromotionalTraining> getFyPromotionalTraining();
}
