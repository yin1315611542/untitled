package com.example.jvm.multdatasource;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author cheung
 * @since 2021-05-13
 */
@EqualsAndHashCode(callSuper = false)
@TableName("t_source_detail")
@ToString
public class SourceDetailDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 资产类型id
     */
    private Long assetTypeId;

    /**
     * 来源唯一标识
     */
    private String source;

    private String name;

    /**
     * 合并优先级 从1开始一次降低
     */
    private Integer priority;

    /**
     * 此来源数据 必填字段,不填则无法进入原始库
     */
    private String requireField;

    /**
     * 此来源数据原始库唯一标识 生成依据字段
     */
    private String uniqueIdentifyField;

    /**
     * 父id 用于展示多sip下级 不用于查询
     */
    @TableField(exist = false)
    private Integer pId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(Long assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRequireField() {
        return requireField;
    }

    public void setRequireField(String requireField) {
        this.requireField = requireField;
    }

    public String getUniqueIdentifyField() {
        return uniqueIdentifyField;
    }

    public void setUniqueIdentifyField(String uniqueIdentifyField) {
        this.uniqueIdentifyField = uniqueIdentifyField;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}
