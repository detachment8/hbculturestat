package com.example.hbculturestat.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.Year;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产宣传展示培训表
 * </p>
 *
 * @author sqs
 * @since 2021-10-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyPromotionalTrainingCity implements Serializable {

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
     * 举办展览（场次）
     */
      private Integer exhibitionTime;

      /**
     * 举办展览参观（人次）
     */
      private Integer exhibitionAudi;

      /**
     * 举办演出（次）
     */
      private Integer performanceTime;

      /**
     * 举办演出进社区（人次）
     */
      private Integer communityPerformance;

      /**
     * 举办演出进校园（次）
     */
      private Integer performanceCampus;

      /**
     * 举办演出观众（人次）
     */
      private Integer campusAudi;

      /**
     * 举办民俗活动（次）
     */
      private Integer folkActivity;

      /**
     * 举办民俗活动参与（人次）
     */
      private Integer folkActivityAudi;

      /**
     * 开展培训班（次）
     */
      private Integer trainingCourse;

      /**
     * 开展培训班参与（人次）
     */
      private Integer trainingClassNum;

      /**
     * 开展非遗工作人员培训班（次）
     */
      private Integer nonLegacyTraining;

      /**
     * 开展非遗工作人员培训班参与（人次）
     */
      private Integer trainingNum;

      /**
     * 开展传承人群培训班（次）
     */
      private String inheritanceGroupTraining;

      /**
     * 开展传承人群培训班培训人次（人次）
     */
      private Integer participantNum;

      /**
     * 组织非遗研讨会（次）
     */
      private Integer nonLegacySeminar;

      /**
     * 组织非遗讲座数量（次）
     */
      private Integer lectureNum;


}
