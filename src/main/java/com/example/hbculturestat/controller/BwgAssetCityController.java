package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.BwgAssetCity;
import com.example.hbculturestat.service.IBwgAssetCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@RestController
@RequestMapping("/bwg-asset-city")
public class BwgAssetCityController {
        @Autowired
        private IBwgAssetCityService iBwgAssetCityService;

        @RequestMapping("getAllBwgAssetCity")
        public List<BwgAssetCity> getAllBwgAssetCity(){
            return iBwgAssetCityService.list();
        }

}

