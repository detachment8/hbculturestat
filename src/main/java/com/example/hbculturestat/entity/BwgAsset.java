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
    public class BwgAsset implements Serializable {

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
     * 资产总计（千元）
     */
      private BigDecimal totalAsset;

      /**
     * 固定资产（千元）
     */
      private BigDecimal fixedAsset;

      /**
     * 实际使用房屋面积（平方米）
     */
      private BigDecimal useHouseArea;

      /**
     * 展览用房（平方米）
     */
      private BigDecimal exhibitionRoom;

      /**
     * 文物库房（平方米）
     */
      private BigDecimal culturaRelic;

      /**
     * 实际拥有产权面积（平方米）
     */
      private BigDecimal propertyArea;


}
