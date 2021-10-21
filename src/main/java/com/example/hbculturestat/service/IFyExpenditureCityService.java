package com.example.hbculturestat.service;

import com.example.hbculturestat.entity.FyExpenditureCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产支出表 服务类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */

public interface IFyExpenditureCityService extends IService<FyExpenditureCity> {
    public List<FyExpenditureCity> getFyExpenditure();
}
