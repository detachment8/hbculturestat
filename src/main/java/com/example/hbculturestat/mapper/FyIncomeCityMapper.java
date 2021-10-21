package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyIncomeCity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产收入表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Mapper
public interface FyIncomeCityMapper extends BaseMapper<FyIncomeCity> {

    @Select("SELECT * FROM fy_income_city WHERE MID(unit_code,5,2) = 00")
    public List<FyIncomeCity> getFyIncome();
}
