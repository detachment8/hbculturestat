package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyInstitutionInfoCity;
import com.example.hbculturestat.mapper.FyInstitutionInfoCityMapper;
import com.example.hbculturestat.service.IFyInstitutionInfoCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产机构表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-20
 */
@Service
public class FyInstitutionInfoCityServiceImpl extends ServiceImpl<FyInstitutionInfoCityMapper, FyInstitutionInfoCity> implements IFyInstitutionInfoCityService {


    @Autowired
    private FyInstitutionInfoCityMapper fyInstitutionInfoCityMapper;
    @Override
    public List<FyInstitutionInfoCity> getFyInstitutionInfo() {
        return fyInstitutionInfoCityMapper.getFyInstitutionInfo();
    }
}
