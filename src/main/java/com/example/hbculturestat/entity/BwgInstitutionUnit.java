package com.example.hbculturestat.entity;

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
    public class BwgInstitutionUnit implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 单位名称
     */
      private String unitName;

      /**
     * 单位代码
     */
      private String unitCode;

      /**
     * 年份
     */
      private LocalDateTime timePoint;

      /**
     * 机构数量
     */
      private Integer institutionNum;

      /**
     * 从业人员
     */
      private Integer practitioner;

      /**
     * 专业技术人员
     */
      private Integer technicalStaff;

      /**
     * 安保人员
     */
      private Integer securityPersonnel;


}
