package com.example.hbculturestat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.Year;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产展示传习场所表
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyShowcaseCity implements Serializable {

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
     * 非物质文化遗产博物馆（个）
     */
      private Integer museum;

      /**
     * 民办非物质文化遗产博物馆（个）
     */
      private Integer privateMuseum;

      /**
     * 收集实物数（件/套）
     */
      private Integer collection;

      /**
     * 展示及演出面积（平方米）
     */
      private BigDecimal performanceArea;

      /**
     * 展示场所培训学徒（人）
     */
      private Integer apprenticeNum;

      /**
     * 传习场所（个）
     */
      private Integer studyPlace;

      /**
     * 民办传习所（个）
     */
      private Integer privateSchool;

      /**
     * 传习所面积（平方米）
     */
      private BigDecimal schoolArea;

      /**
     * 传习场所培训学徒（人）
     */
      private Integer trainingApprentice;


}
