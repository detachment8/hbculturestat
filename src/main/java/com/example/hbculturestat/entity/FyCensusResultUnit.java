package com.example.hbculturestat.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 14年各地区非物质文化遗产普查成果表
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class FyCensusResultUnit implements Serializable {

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
     * 项目资源总量（件）
     */
      private Integer projectResources;

      /**
     * 征集实物（件）
     */
      private Integer object;

      /**
     * 征集文本资料（册）
     */
      private Integer textData;

      /**
     * 录制资料（小时）
     */
      private Integer recordingData;

      /**
     * 录像资料（小时）
     */
      private Integer videoData;

      /**
     * 调查报告（篇）
     */
      private Integer investigationReport;

      /**
     * 出版成果（册）
     */
      private Integer publication;

      /**
     * 非遗图书（册）
     */
      private Integer nonLegacyBook;

      /**
     * 非遗专利（册）
     */
      private Integer nonLegacyPatent;

      /**
     * 非遗乡土教材（册）
     */
      private Integer nativeTextbook;

      /**
     * 资源清单（册）
     */
      private Integer resourceList;


}
