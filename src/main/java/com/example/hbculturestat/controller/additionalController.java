package com.example.hbculturestat.controller;

import com.example.hbculturestat.dto.FyAllCity;
import com.example.hbculturestat.dto.fyAllCityChinese;
import com.example.hbculturestat.mapper.FyAllCityMapper;
import com.example.hbculturestat.service.IBwgAssetCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class additionalController {

    @Autowired
    private FyAllCityMapper fyAllCityMapper;

    @GetMapping("/servlet/GetFyAllCity")
    public List<fyAllCityChinese> GetFyAllCity(String ADMINCODE, String year){
        List<FyAllCity> FyAllCityList= fyAllCityMapper.getFyAllCity(ADMINCODE,year);
        List<fyAllCityChinese> list = new ArrayList<fyAllCityChinese>();
        for (FyAllCity temp:FyAllCityList){
            fyAllCityChinese tempChinese = new fyAllCityChinese(temp.unitName,
           temp.cityCode,
           temp.timePoint,
           temp.totalAsset,
           temp.buildingArea,
           temp.projectResources,
           temp.object,
           temp.totalExpenditure,
           temp.basicExpenditure,
           temp.projectExpenditure,
           temp.totalIncome,
           temp.financialSubsidy,
           temp.specialProtectionFund,
           temp.institutionNum,
           temp.staff,
           temp.exhibitionTime,
           temp.exhibitionAudi,
           temp.trainingCourse,
           temp.trainingClassNum,
           temp.museum,
           temp.apprenticeNum,
           temp.studyPlace);
            list.add(tempChinese);
        }
        return list;
    }
}