package com.example.hbculturestat.dto;

public class fyAllCityChinese {

    public String 单位名称;
    public String 地区编码;
    public String 年份;
    public String 资产合计;
    public String 实际使用房屋建筑面积;
    public String 项目资源总量;
    public String 征集实物;
    public String 本年度支出合计;
    public String 基本支出;
    public String 项目支出;
    public String 本年度收入合计;
    public String 财政补贴收入;
    public String 非物质文化遗产保护专项经费投入;
    public String 机构数量;
    public String 工作人员数;
    public String 举办展览场次;
    public String 举办展览参观人次;
    public String 开展培训班次;
    public String 开展培训班参与人次;
    public String 非物质文化遗产博物馆数;
    public String 展示场所培训学徒数;
    public String 传习场所数;

    public fyAllCityChinese(String unitName,String cityCode,String timePoint,String totalAsset,String buildingArea,String projectResources,String object,String totalExpenditure,String basicExpenditure,String projectExpenditure,String totalIncome,String financialSubsidy,String specialProtectionFund,String institutionNum,String staff,String exhibitionTime,String exhibitionAudi,String trainingCourse,String trainingClassNum,String museum,String apprenticeNum,String studyPlace){

        this.单位名称 = unitName;
        this.地区编码 = cityCode;
        this.年份 = timePoint;
        this.资产合计 = totalAsset;
        this.实际使用房屋建筑面积 = buildingArea;
        this.项目资源总量 = projectResources;
        this.征集实物 = object;
        this.本年度支出合计 = totalExpenditure;
        this.基本支出 = basicExpenditure;
        this.项目支出 = projectExpenditure;
        this.本年度收入合计 = totalIncome;
        this.财政补贴收入 = financialSubsidy;
        this.非物质文化遗产保护专项经费投入 = specialProtectionFund;
        this.机构数量 = institutionNum;
        this.工作人员数 = staff;
        this.举办展览场次 = exhibitionTime;
        this.举办展览参观人次 = exhibitionAudi;
        this.开展培训班次 = trainingCourse;
        this.开展培训班参与人次 = trainingClassNum;
        this.非物质文化遗产博物馆数 = museum;
        this.展示场所培训学徒数 = apprenticeNum;
        this.传习场所数 = studyPlace;

    }
}