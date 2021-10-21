package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyAssetsCity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产资产表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */@Repository
@Mapper
public interface FyAssetsCityMapper extends BaseMapper<FyAssetsCity> {

     @Select("SELECT * FROM fy_assets_city WHERE MID(city_code,5,2) = 00 and MID(city_code,3,2) != 00")
     public List<FyAssetsCity> getFyAssets();
}
