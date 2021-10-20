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
    public class BwgDivision implements Serializable {

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


}
