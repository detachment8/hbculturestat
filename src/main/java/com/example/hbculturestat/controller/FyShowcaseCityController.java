package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyShowcaseCity;
import com.example.hbculturestat.service.IFyShowcaseCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产展示传习场所表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-showcase-city")
public class FyShowcaseCityController {

    @Autowired
    private IFyShowcaseCityService iFyShowcaseCityService;


    @RequestMapping("/getFyShowcase")
    public List<FyShowcaseCity> getFyShowcase() {
        return iFyShowcaseCityService.getFyShowcase();
    }
}

