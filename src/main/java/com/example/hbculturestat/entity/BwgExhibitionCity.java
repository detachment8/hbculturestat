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
    public class BwgExhibitionCity implements Serializable {

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
     * 临时展览（个）
     */
      private Integer exhibitionNum;

      /**
     * 参观人次（人次）
     */
      private Integer exhibitionAudience;

      /**
     * 未成年人参观人次（人次）
     */
      private Integer minorAudience;

      /**
     * 门票销售额（千元）
     */
      private BigDecimal ticketSale;

      /**
     * 年度收入（千元）
     */
      private BigDecimal annualIncome;

      /**
     * 财政补助收入（千元）
     */
      private BigDecimal financialSubsidy;

      /**
     * 上级补助收入（千元）
     */
      private BigDecimal superiorSubsidy;


}
