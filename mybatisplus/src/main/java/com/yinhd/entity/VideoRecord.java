package com.yinhd.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinhd
 * @since 2024-04-19 04:04:55
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_video_record")
@ApiModel(value = "VideoRecord对象", description = "")
public class VideoRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("设备编码")
    @TableField("sbbm")
    private String sbbm;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private String startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private String endTime;

    @ApiModelProperty("上次请求时间")
    @TableField("request_time")
    private String requestTime;

    @ApiModelProperty("有录像的时间段")
    @TableField("time_slice")
    private String timeSlice;

    @ApiModelProperty("录像时长")
    @TableField("duration")
    private Integer duration;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private String updateTime;


}
