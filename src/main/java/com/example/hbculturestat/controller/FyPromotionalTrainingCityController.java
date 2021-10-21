package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyPromotionalTraining;
import com.example.hbculturestat.service.IFyPromotionalTrainingCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产宣传展示培训表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-promotional-training-city")
public class FyPromotionalTrainingCityController {

    @Autowired
    private IFyPromotionalTrainingCityService iFyPromotionalTrainingCityService;

    @RequestMapping("getFyPromotionalTraining")
    public List<FyPromotionalTraining> getFyPromotionalTraining() {
        return iFyPromotionalTrainingCityService.getFyPromotionalTraining();
    }
}

