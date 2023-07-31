package org.example.entity.notifyObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通知对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeNotificationObject {
    @JsonProperty( "NotificationID")
    String NotificationID;
    @JsonProperty( "personObjectList")
    PersonObjectList personObjectList;
    @JsonProperty( "FaceObjectList")
    org.example.entity.notifyObject.Face.FaceObjectList FaceObjectList; //人脸对象list
    @JsonProperty( "DeviceList")
    org.example.entity.notifyObject.Device.DeviceList DeviceList; //设备信息list
    @JsonProperty( "MotorVehicleObjectList")
    org.example.entity.notifyObject.MotorVehicle.MotorVehicleObjectList MotorVehicleObjectList;  //机动车对象list
    @JsonProperty( "TollgateObjectList")
    org.example.entity.notifyObject.Tollgate.TollgateObjectList TollgateObjectList;//卡口对象list
    @JsonProperty( "InfoIDs")
    String InfoIDs; //FaceObjectList",
    @JsonProperty( "Title")
    String Title;
    @JsonProperty( "SubscribeID")
    String SubscribeID;
    @JsonProperty( "TriggerTime")
    String TriggerTime;
    @JsonProperty( "ExecuteOperation")
    int ExecuteOperation;


}
