package com.example.hbculturestat.service;

import com.example.hbculturestat.entity.FyIncomeCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产收入表 服务类
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
public interface IFyIncomeCityService extends IService<FyIncomeCity> {
    public List<FyIncomeCity> getFyIncome();
}
