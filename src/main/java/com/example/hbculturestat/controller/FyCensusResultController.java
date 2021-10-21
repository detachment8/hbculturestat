package com.example.hbculturestat.controller;


import com.example.hbculturestat.entity.FyCensusResult;
import com.example.hbculturestat.service.IFyCensusResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产普查成果表 前端控制器
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@CrossOrigin
@RestController
@RequestMapping("/fy-census-result")
public class FyCensusResultController {


    @Autowired
    private IFyCensusResultService iFyCensusResultService;

    @RequestMapping("/getFyCensusResult")
    public List<FyCensusResult> getFyCensusResult() {
        return iFyCensusResultService.getFyCensusResult();
    }
}

