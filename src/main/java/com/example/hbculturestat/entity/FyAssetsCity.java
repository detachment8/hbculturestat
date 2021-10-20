package com.example.hbculturestat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产资产表
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyAssetsCity implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 单位名称
     */
      private String unitName;

      /**
     * 地区编码
     */
      private String cityCode;

      /**
     * 年份
     */
      private LocalDateTime timePoint;

      /**
     * 资产合计（千元）
     */
      private BigDecimal totalAsset;

      /**
     * 固定资产原值（千元）
     */
      private BigDecimal fixedAsset;

      /**
     * 实际使用房屋建筑面积（平方米）
     */
      private String buildingArea;

      /**
     * 实际拥有产权面积（平方米）
     */
      private String propertyArea;


}
