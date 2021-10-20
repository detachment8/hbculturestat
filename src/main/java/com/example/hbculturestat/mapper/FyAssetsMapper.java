package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyAssets;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 14年各地区非物质文化遗产资产表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */@Repository
@Mapper
public interface FyAssetsMapper extends BaseMapper<FyAssets> {

}
