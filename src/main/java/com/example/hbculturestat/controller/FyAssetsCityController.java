package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyAssetsCity;
import com.example.hbculturestat.service.IFyAssetsCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产资产表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-assets-city")
public class FyAssetsCityController {

    @Autowired
    private IFyAssetsCityService iFyAssetsCityService;

        @RequestMapping("/getFyAssets")
    public List<FyAssetsCity> getFyAssets() {
        return iFyAssetsCityService.getFyAssets();
    }
}

