package com.example.hbculturestat.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 地区编码
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Districtcode implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 行政区划编码
     */
        @TableId("DistrictCode")
      private String districtcode;

      /**
     * 行政区名字
     */
      @TableField("District")
    private String district;

      /**
     * 行政区全名
     */
      @TableField("FULLNAME")
    private String fullname;


}
