package com.yinhd.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;


public class Asset {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("自设置编码")
    @TableField("gd_uid")
    private String gdUid;

    @ApiModelProperty("设备编码")
    @TableField("SBBM")
    private String sbbm;

    @ApiModelProperty("设备名称")
    @TableField("SBMC")
    private String sbmc;

    @ApiModelProperty("设备厂商")
    @TableField("SBCS")
    private String sbcs;

    @ApiModelProperty("行政区域")
    @TableField("XZQY")
    private String xzqy;

    @ApiModelProperty("监控点位类型")
    @TableField("JKDWLX")
    private String jkdwlx;

    @ApiModelProperty("设备型号")
    @TableField("SBXH")
    private String sbxh;

    @ApiModelProperty("点位俗称")
    @TableField("DWSC")
    private String dwsc;

    @ApiModelProperty("IPV4地址")
    @TableField("IPV4")
    private String ipv4;

    @ApiModelProperty("IPV6地址")
    @TableField("IPV6")
    private String ipv6;

    @ApiModelProperty("mac地址")
    @TableField("MACDZ")
    private String macdz;

    @ApiModelProperty("摄像机类型")
    @TableField("SXJLX")
    private String sxjlx;

    @ApiModelProperty("摄像机功能类型")
    @TableField("SXJGNLX")
    private String sxjgnlx;

    @ApiModelProperty("补光属性")
    @TableField("BGSX")
    private String bgsx;

    @ApiModelProperty("摄像机编码格式")
    @TableField("SXJBMGS")
    private String sxjbmgs;

    @ApiModelProperty("安装地址")
    @TableField("AZDZ")
    private String azdz;

    @ApiModelProperty("经度")
    @TableField("JD")
    private String jd;

    @ApiModelProperty("纬度")
    @TableField("WD")
    private String wd;

    @ApiModelProperty("摄像机位置类型")
    @TableField("SXJWZLX")
    private String sxjwzlx;

    @ApiModelProperty("监视方位")
    @TableField("JSFW")
    private String jsfw;

    @ApiModelProperty("联网属性")
    @TableField("LWSX")
    private String lwsx;

    @ApiModelProperty("所属辖区公安机关")
    @TableField("SSXQGAJG")
    private String ssxqgajg;

    @ApiModelProperty("安装时间")
    @TableField("AZSJ")
    private Timestamp azsj;

    @ApiModelProperty("管理单位")
    @TableField("GLDW")
    private String gldw;

    @ApiModelProperty("管理单位联系方式")
    @TableField("GLDWLXFS")
    private String gldwlxfs;

    @ApiModelProperty("录像保留天数")
    @TableField("LXBCTS")
    private Integer lxbcts;

    @ApiModelProperty("设备状态")
    @TableField("SBZT")
    private String sbzt;

    @ApiModelProperty("所属部门/行业")
    @TableField("SSBMHY")
    private String ssbmhy;

    @ApiModelProperty("维保到期时间")
    @TableField("WBDQ")
    private String wbdq;

    @ApiModelProperty("维保单位")
    @TableField("WBDW")
    private String wbdw;

    @ApiModelProperty("维保单位电话")
    @TableField("WBDWDH")
    private String wbdwdh;

    @ApiModelProperty("端口")
    @TableField("port")
    private Integer port;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("资产类型")
    @TableField("asset_type")
    private Long assetType;

    @ApiModelProperty("是否末位是0,不合格就是1,合格就是0,在此之后均为非字典项(预留字段除外)")
    @TableField("check_zero")
    private Integer checkZero;

    @ApiModelProperty("判断是否在经纬度内,不在就是1,在就是0")
    @TableField("check_coordinate")
    private Integer checkCoordinate;

    @ApiModelProperty("操作员")
    @TableField("operator")
    private String operator;

    @ApiModelProperty("审核员")
    @TableField("assessor")
    private String assessor;

    @ApiModelProperty("此数据更新时间")
    @TableField("update_time")
    private Timestamp updateTime;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Timestamp createTime;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private Timestamp auditTime;

    @ApiModelProperty("同步时间")
    @TableField("synchronization_time")
    private Timestamp synchronizationTime;

    @ApiModelProperty("同步状态 1.待同步, 2.同步完成")
    @TableField("synchronization_status")
    private Byte synchronizationStatus;

    @ApiModelProperty("1. 草稿 2.待审核 3. 退回 4.已审核 5.新识别")
    @TableField("device_info_status")
    private Integer deviceInfoStatus;

    @ApiModelProperty("1 手动录入, 2 导入，3 自动采集")
    @TableField("input_type")
    private Integer inputType;

    @ApiModelProperty("0不在线,1在线 (弃用)")
    @TableField("online_status")
    private Integer onlineStatus;

    @ApiModelProperty("设备等级1")
    @TableField("type_level1")
    private Integer typeLevel1;

    @ApiModelProperty("设备等级2")
    @TableField("type_level2")
    private Integer typeLevel2;

    @TableField("input_quality")
    private Integer inputQuality;

    @TableField("pass_status")
    private Integer passStatus;

    @TableField("ip_list")
    private String ipList;

    @TableField("mac_list")
    private String macList;

    @ApiModelProperty("是否经过编辑,1是0否")
    @TableField("edited")
    private Byte edited;

    @ApiModelProperty("主显设备(多网卡情况)")
    @TableField("main_show")
    private Integer mainShow;

    @ApiModelProperty("多个网卡情况判断是否同一交换机")
    @TableField("unique_id")
    private String uniqueId;

    @TableField("filed1")
    private String filed1;

    @TableField("filed2")
    private String filed2;

    @TableField("filed3")
    private String filed3;

    @TableField("filed4")
    private String filed4;

    @TableField("filed5")
    private String filed5;

    @ApiModelProperty("sip来源,记录来源的下级编码id")
    @TableField("filed6")
    private String filed6;

    @TableField("filed7")
    private String filed7;

    @TableField("filed8")
    private String filed8;

    @TableField("filed9")
    private String filed9;

    @TableField("filed10")
    private String filed10;

    @ApiModelProperty("进行融合的时间，也作为资产融合的标志，用于首页查询")
    @TableField("filed11")
    private String filed11;

    @ApiModelProperty("重点设备字段 空为非重点 1上级下发重点 2采集区域重点 3自定义重点")
    @TableField("filed12")
    private String filed12;

    @TableField("filed13")
    private String filed13;

    @ApiModelProperty("用于标识该条记录的行政区域为通过映射文件获取，内容为设备编码前6位")
    @TableField("filed14")
    private String filed14;

    @TableField("filed15")
    private Integer filed15;

    @TableField("filed16")
    private Integer filed16;

    @TableField("filed17")
    private Integer filed17;

    @TableField("filed18")
    private Integer filed18;

    @ApiModelProperty("资产过程库id")
    @TableField("filed19")
    private Integer filed19;

    @ApiModelProperty("configId")
    @TableField("filed20")
    private Integer filed20;

    @TableField("SXJFBL")
    private String sxjfbl;

    @TableField("SXJJJ")
    private String sxjjj;

    @TableField("ParentID")
    private String parentID;

    @TableField("BusinessGroupID")
    private String businessGroupID;

    @TableField("WHDW")
    private String whdw;

    @TableField("VideoCodeRate")
    private String videoCodeRate;

    @TableField("VideoCodeType")
    private String videoCodeType;

    @TableField("FrameRate")
    private String frameRate;

    @TableField("RecordAddress")
    private String recordAddress;

    @ApiModelProperty("设备状态更新时间")
    @TableField("olut")
    private Timestamp olut;

    @ApiModelProperty("是否上报0是上报1是未上报")
    @TableField("report")
    private String report;

    @ApiModelProperty("摄像机采集区域")
    @TableField("SXJCJQY")
    private String sxjcjqy;

    @ApiModelProperty("来源标识")
    @TableField("source")
    private String source;
}
