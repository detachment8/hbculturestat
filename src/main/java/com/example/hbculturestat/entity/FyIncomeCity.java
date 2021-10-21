package com.example.hbculturestat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.Year;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产收入表
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyIncomeCity implements Serializable {

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
     * 本年度收入合计（千元）
     */
      private BigDecimal totalIncome;

      /**
     * 财政补贴收入（千元）
     */
      private BigDecimal financialSubsidy;

      /**
     * 基建拨款（千元）
     */
      private BigDecimal infrastructureGrant;

      /**
     * 非物质文化遗产保护专项经费投入（千元）
     */
      private BigDecimal specialProtectionFund;

      /**
     * 中央财政投入（千元）
     */
      private BigDecimal centralFinancialInput;

      /**
     * 省级财政投入（千元）
     */
      private BigDecimal provincialFinancialInput;

      /**
     * 市级财政投入（千元）
     */
      private BigDecimal municipalFinancialInput;

      /**
     * 县级财政投入（千元）
     */
      private BigDecimal countyFinancialInput;

      /**
     * 其他投入（千元）
     */
      private BigDecimal otherInput;

      /**
     * 事业收入（千元）
     */
      private BigDecimal businessIncome;

      /**
     * 上级补助收入（千元）
     */
      private BigDecimal superiorSubsidy;

      /**
     * 附属单位上缴收入（千元）
     */
      private BigDecimal unitPayment;

      /**
     * 经营收入（千元）
     */
      private BigDecimal operatingIncome;

      /**
     * 其他收入（千元）
     */
      private BigDecimal otherIncome;


}
