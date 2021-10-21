package com.example.hbculturestat.mapper;

import com.example.hbculturestat.entity.FyCensusResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产普查成果表 Mapper 接口
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */@Repository
@Mapper
public interface FyCensusResultMapper extends BaseMapper<FyCensusResult> {


     @Select("SELECT * FROM fy_census_result_city WHERE MID(unit_code,5,2) = 00")
    public List<FyCensusResult> getFyCensusResult();
}
