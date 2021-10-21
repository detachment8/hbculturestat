package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyIncomeCity;
import com.example.hbculturestat.service.IFyIncomeCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产收入表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-income-city")
public class FyIncomeCityController {


    @Autowired
    private IFyIncomeCityService iFyIncomeCityService;

    @RequestMapping("/getFyIncome")
    public List<FyIncomeCity> getFyIncome() {
        return iFyIncomeCityService.getFyIncome();
    }
}

