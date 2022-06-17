package com.example.hbculturestat.controller;

import com.example.hbculturestat.dto.FyAllCity;
import com.example.hbculturestat.mapper.FyAllCityMapper;
import com.example.hbculturestat.service.IBwgAssetCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class additionalController {

    @Autowired
    private FyAllCityMapper fyAllCityMapper;

    @GetMapping("GetFyAllCity")
    public List<FyAllCity> GetFyAllCity(String adminCode, String year){
        return fyAllCityMapper.getFyAllCity(adminCode,year);
    }
}