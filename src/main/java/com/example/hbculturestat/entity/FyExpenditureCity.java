package com.example.hbculturestat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.Year;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产支出表
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyExpenditureCity implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 单位名称
     */
      private String unitName;

      /**
     * 单位编码
     */
      private String unitCode;

      /**
     * 年份
     */
      private Year timePoint;

      /**
     * 本年度支出合计（千元）
     */
      private BigDecimal totalExpenditure;

      /**
     * 基本支出（千元）
     */
      private BigDecimal basicExpenditure;

      /**
     * 项目支出（千元）
     */
      private BigDecimal projectExpenditure;

      /**
     * 经营支出（千元）
     */
      private BigDecimal operatingExpense;

      /**
     * 工资福利支出（千元）
     */
      private BigDecimal wageWelfareExpe;

      /**
     * 商品和服务支出（千元）
     */
      private BigDecimal goodsServiceExpe;

      /**
     * 差旅费（千元）
     */
      private BigDecimal travelExpense;

      /**
     * 劳务费（千元）
     */
      private BigDecimal laborCost;

      /**
     * 福利费（千元）
     */
      private BigDecimal welfareFee;

      /**
     * 税金支出（千元）
     */
      private BigDecimal taxExpenditure;

      /**
     * 对个人和家庭补助支出（千元）
     */
      private BigDecimal perFamilyAllowances;

      /**
     * 抚恤金和生活补助（千元）
     */
      private BigDecimal pension;

      /**
     * 其他资本性支出（千元）
     */
      private BigDecimal otherExpenditures;

      /**
     * 各种设备、交通工具、图书购置费（千元）
     */
      private BigDecimal purchaseFee;


}
