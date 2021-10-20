package com.example.hbculturestat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class BwgExpenditureCity implements Serializable {

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
      private LocalDateTime timePoint;

      /**
     * 年度支出总额（千元）
     */
      private BigDecimal annualExpenditure;

      /**
     * 基本支出（千元）
     */
      private BigDecimal basicExpenditure;

      /**
     * 项目支出（千元）
     */
      private BigDecimal projectExpenditure;

      /**
     * 文物征集（千元）
     */
      private BigDecimal culturaRelicsCollection;

      /**
     * 馆藏品保护（千元）
     */
      private BigDecimal collectionProtection;

      /**
     * 陈列展览（千元）
     */
      private BigDecimal exhibitionFee;

      /**
     * 教育科研（千元）
     */
      private BigDecimal educationResearch;

      /**
     * 经营支出（千元）
     */
      private BigDecimal operatingExpense;

      /**
     * 工资福利支出（千元）
     */
      private String wageBenefitExpe;

      /**
     * 商品与服务支出（千元）
     */
      private String commodityServiceExpe;

      /**
     * 差旅费（千元）
     */
      private String travelExpense;

      /**
     * 劳务费（千元）
     */
      private String laborCost;

      /**
     * 福利费（千元）
     */
      private String welfareFee;

      /**
     * 对个人和家庭补助（千元）
     */
      private String perFamilyAllowance;

      /**
     * 其他资本性支出（千元）
     */
      private String otherExpenditure;


}
