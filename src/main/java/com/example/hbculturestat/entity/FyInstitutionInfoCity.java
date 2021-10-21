package com.example.hbculturestat.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.Year;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产机构表
 * </p>
 *
 * @author sqs
 * @since 2021-10-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyInstitutionInfoCity implements Serializable {

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
     * 机构数量（个）
     */
      private Integer institutionNum;

      /**
     * 工作人员数（人）
     */
      private Integer staff;

      /**
     * 专职人员（人）
     */
      private Integer fullTimeStaff;

      /**
     * 在编人员（人）
     */
      private Integer permanentStaff;

      /**
     * 专业技术人员（人）
     */
      private Integer skillWorker;

      /**
     * 在技术人才中正高级职称（人）
     */
      private Integer positiveNum;

      /**
     * 在技术人才中副高级职称（人）
     */
      private Integer deputySeniorNum;

      /**
     * 在技术人才中中级职称（人）
     */
      private Integer intermediateNum;


}
