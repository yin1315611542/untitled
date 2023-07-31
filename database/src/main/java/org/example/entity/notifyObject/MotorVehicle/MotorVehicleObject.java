package org.example.entity.notifyObject.MotorVehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.notifyObject.VIIDObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "motorvehicleobject")
public class MotorVehicleObject extends VIIDObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "VehicleRoof")
    String VehicleRoof; //这是车顶的描述
    @Column(name = "RearviewMirror")
    String RearviewMirror; //这是后视镜
    @Column(name ="SideOfVehicle")
    String SideOfVehicle; //这是车侧的描述
    @Column(name ="StorageUrl2")
    String StorageUrl2; //http; ////192.168.1.1; //80/2.jpg
    @Column(name ="DisappearTime")
    String DisappearTime; //20180125171139
    @Column(name ="FilmColor")
    String FilmColor; //1
    @Column(name ="StorageUrl3")
    String StorageUrl3; //http; ////192.168.1.1; //80/3.jpg
    @Column(name ="StorageUrl1")
    String StorageUrl1; //http; ////192.168.1.1; //80/1.jpg
    @Transient
    org.example.entity.notifyObject.SubImageList SubImageList; // ; // {
    @Column(name ="SubImageList")
    String SubImageLists;
    @Column(name ="VehicleClass")
    String VehicleClass; //0
    @Column(name ="VehicleShielding")
    String VehicleShielding; //这是遮挡的描述
    @Column(name ="PlateClass")
    String PlateClass; //01
    @Column(name ="SafetyBelt")
    Integer SafetyBelt; // 1,
    @Column(name ="RightBtmY")
    Integer RightBtmY; // 40,
    @Column(name ="RightBtmX")
    Integer RightBtmX; // 30,
    @Column(name ="IsDecked")
    Integer IsDecked; //1
    @Column(name ="WheelPrintedPattern")
    String WheelPrintedPattern; //花纹
    @Column(name ="PlateNo")
    String PlateNo; //京A66666
    @Column(name ="VehicleRearItem")
    String VehicleRearItem; //1
    @Column(name ="TabID")
    String TabID; //32090100005030000001022019021316104219072
    @Column(name ="VehicleDoor")
    String VehicleDoor; //这是车门的描述
    @Column(name ="BrandReliability")
    String BrandReliability; //88
    @Column(name ="VehicleStyles")
    String VehicleStyles; //这是车辆年款
    @Column(name ="VehicleFrontItem")
    String VehicleFrontItem; //1
    @Column(name ="LeftTopY")
    Integer LeftTopY; // 20,
    @Column(name ="LeftTopX")
    Integer LeftTopX; // 10,
    @Column(name ="NumOfPassenger")
    Integer NumOfPassenger; // 2,
    @Column(name ="VehicleModel")
    String VehicleModel; //这是车辆型号描述
    @Column(name ="VehicleHood")
    String VehicleHood; //这是车前盖的描述
    @Column(name ="StorageUrl4")
    String StorageUrl4; //http; ////192.168.1.1; //80/4.jpg
    @Column(name ="StorageUrl5")
    String StorageUrl5; //http; ////192.168.1.1; //80/5.jpg
    @Column(name ="PlateColor")
    String PlateColor; //1
    @Column(name ="PlateNoAttach")
    String PlateNoAttach; //京A88888
    @Column(name ="VehicleTrunk")
    String VehicleTrunk; //这是车后盖的描述
    @Column(name ="PlateDescribe")
    String PlateDescribe; //这是一个车牌号的描述
    @Column(name ="PlateCharReliability")
    String PlateCharReliability; //苏-80,B-90,1-90,2-88,3-90,4-67,5-87
    @Column(name ="AppearTime")
    String AppearTime; //20180125171139
    @Column(name ="VehicleWindow")
    String VehicleWindow; //这是车窗的描述
    @Column(name ="VehicleWidth")
    Integer VehicleWidth; // 1234,
    @Column(name ="NationalityCode")
    Integer NationalityCode; //000
    @Column(name ="Calling")
    Integer Calling; // 1,
    @Column(name ="PassTime")
    String PassTime; //20190301093412
    @Column(name ="Direction")
    String Direction; //1
    @Column(name ="CarOfVehicle")
    String CarOfVehicle; //这是车厢的描述
    @Column(name ="MarkTime")
    String MarkTime; //20180125171139
    @Column(name ="HasPlate")
    String HasPlate; //1
    @Column(name ="HitMarkInfo")
    String HitMarkInfo; //1
    @Column(name ="LaneNo")
    Integer LaneNo; // 1,
    @Column(name ="VehicleHeight")
    Integer VehicleHeight; // 1234,
    @Column(name ="Speed")
    Integer Speed; // 80.23,
    @Column(name ="MotorVehicleID")
    String MotorVehicleID; //650100000013200000010120170330120000000010200001
    @Column(name ="DeviceID")
    String DeviceID; //65010000001190000001
    @Column(name ="SourceID")
    String SourceID; //65010000001320000001012017033012000000001
    @Column(name ="IsCovered")
    String IsCovered; //1
    @Column(name ="IsModified")
    String IsModified; //1
    @Column(name ="DescOfFrontItem")
    String DescOfFrontItem; //这是车前部物品描述
    @Column(name ="VehicleBrand")
    String VehicleBrand; //0
    @Column(name ="PlateReliability")
    String PlateReliability; //80
    @Column(name ="DrivingStatusCode")
    String DrivingStatusCode; //01
    @Column(name ="VehicleColorDepth")
    String VehicleColorDepth; //1
    @Column(name ="VehicleLength")
    Integer VehicleLength; // 12345,
    @Column(name ="InfoKind")
    Integer InfoKind; // 1,
    @Column(name ="DescOfRearItem")
    String DescOfRearItem; //这是车后部物品描述
    @Column(name ="TollgateID")
    String TollgateID; //65010000001210000001
    @Column(name ="UsingPropertiesCode")
    String UsingPropertiesCode; // 1,
    @Column(name ="VehicleChassis")
    String VehicleChassis; //这是底盘
    @Column(name ="VehicleColor")
    String VehicleColor; //1
    @Column(name ="IsAltered")
    String IsAltered; //1
    @Column(name ="VehicleWheel")
    String VehicleWheel; //这是车轮的描述
    @Column(name ="VehicleBodyDesc")
    String VehicleBodyDesc; //描述车身上的文字信息，或者车上载物信息
    @Column(name ="Sunvisor")
    Integer Sunvisor; // 1,
    @Transient
    org.example.entity.notifyObject.FeatureList FeatureList; //
    @Column(name = "FeatureList")
    String FeatureLists;
}
