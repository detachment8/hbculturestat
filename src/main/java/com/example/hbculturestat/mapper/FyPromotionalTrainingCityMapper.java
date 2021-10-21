package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyPromotionalTraining;
import com.example.hbculturestat.entity.FyPromotionalTrainingCity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产宣传展示培训表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Mapper
public interface FyPromotionalTrainingCityMapper extends BaseMapper<FyPromotionalTrainingCity> {

    @Select("SELECT * FROM fy_promotional_training_city WHERE MID(unit_code,5,2) = 00")
    public List<FyPromotionalTraining> getFyPromotionalTraining();
}
