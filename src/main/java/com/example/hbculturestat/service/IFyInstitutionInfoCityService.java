package com.example.hbculturestat.service;

import com.example.hbculturestat.entity.FyInstitutionInfoCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产机构表 服务类
 * </p>
 *
 * @author sqs
 * @since 2021-10-20
 */
public interface IFyInstitutionInfoCityService extends IService<FyInstitutionInfoCity> {

    public List<FyInstitutionInfoCity> getFyInstitutionInfo();
}
