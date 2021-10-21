package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyExpenditureCity;
import com.example.hbculturestat.service.IFyExpenditureCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产支出表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-expenditure-city")
public class FyExpenditureCityController {
    @Autowired
    private IFyExpenditureCityService iFyExpenditureCityService;

    @RequestMapping("/getFyExpenditure")
    public List<FyExpenditureCity> getFyExpenditure() {
        return iFyExpenditureCityService.getFyExpenditure();
    }

}

