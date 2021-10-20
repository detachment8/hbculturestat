package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyInstitutionInfoCity;
import com.example.hbculturestat.service.IFyInstitutionInfoCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产机构表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-20
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-institution-info-city")
public class FyInstitutionInfoCityController {

    @Autowired
    private IFyInstitutionInfoCityService iFyInstitutionInfoCityService;


    @RequestMapping("getFyInstitutionInfo")
    public List<FyInstitutionInfoCity> getFyInstitutionInfo(){
        return iFyInstitutionInfoCityService.getFyInstitutionInfo();
    }
}

