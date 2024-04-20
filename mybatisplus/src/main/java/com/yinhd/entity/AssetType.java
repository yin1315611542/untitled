package com.yinhd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 资产类型
 * </p>
 *
 * @author yinhd
 * @since 2024-04-20 03:50:34
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_asset_type")
@ApiModel(value = "AssetType对象", description = "资产类型")
public class AssetType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("类型名称")
    @TableField("type_name")
    private String typeName;

    @ApiModelProperty("类型级别")
    @TableField("type_level")
    private Integer typeLevel;

    @ApiModelProperty("所属类型")
    @TableField("type_parent")
    private Long typeParent;

    @ApiModelProperty("图标")
    @TableField("type_icon")
    private String typeIcon;

    @ApiModelProperty("是否内置,1是0否")
    @TableField("is_internal")
    private Boolean isInternal;

    @ApiModelProperty("更新规则")
    @TableField("update_rule")
    private String updateRule;

    @ApiModelProperty("1是物理资产 0是非物理资产")
    @TableField("physics")
    private Boolean physics;

    @ApiModelProperty("该资产类型对应校验范围")
    @TableField("scope")
    private String scope;

    @ApiModelProperty("gdps是否可以自动识别，1可以自动识别，0不能自动识别")
    @TableField("is_autorecognize")
    private Boolean isAutorecognize;
}
