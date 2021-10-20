package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.Districtcode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 地区编码 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */@Repository
@Mapper
public interface DistrictcodeMapper extends BaseMapper<Districtcode> {

}
