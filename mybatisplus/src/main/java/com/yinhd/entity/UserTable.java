package com.yinhd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinhd
 * @since 2024-03-06 06:01:58
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_table")
@ApiModel(value = "UserTable对象", description = "")
public class UserTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("gmt_create")
    private Date gmtCreate;

    @TableField("gmt_update")
    private Date gmtUpdate;

    @TableField("user_name")
    private String userName;

    @TableField("valid")
    private Boolean valid;


}
