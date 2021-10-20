package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyInstitutionInfoCity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产机构表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-20
 */
@Mapper
public interface FyInstitutionInfoCityMapper extends BaseMapper<FyInstitutionInfoCity> {

    @Select("SELECT * FROM fy_institution_info_city WHERE MID(unit_code,5,2) = 00")
    public List<FyInstitutionInfoCity> getFyInstitutionInfo();
}
