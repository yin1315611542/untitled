package org.example.entity.subscribe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeObject {
    @JsonProperty( "SubscribeCancelPerson")
    String SubscribeCancelPerson; //取消订阅人姓名,
    @JsonProperty( "ResourceURI")
    String ResourceURI; //65010000001320000001,
    @JsonProperty( "CancelTime")
    String CancelTime; //20180116142101,
    @JsonProperty( "EndTime")
    String EndTime; //20180116142701,
    @JsonProperty( "ApplicantName")
    String ApplicantName; //申请人姓名,
    @JsonProperty( "Title")
    String Title; //订阅标题,
    @JsonProperty( "BeginTime")
    String BeginTime; //20180116142101,
    @JsonProperty( "Reason")
    String Reason; //订阅理由,
    @JsonProperty( "ResultFeatureDeclare")
    int ResultFeatureDeclare;// -1,
    @JsonProperty( "SubscribeCancelOrg")
    String SubscribeCancelOrg; //订阅取消单位,
    @JsonProperty( "SubscribeID")
    String SubscribeID; //650101000001032017110309200000001,
    @JsonProperty( "CancelReason")
    String CancelReason; //取消订阅原因,
    @JsonProperty( "ResultImageDeclare")
    String ResultImageDeclare; //-1,
    @JsonProperty( "SubscribeStatus")
    int SubscribeStatus; // 0,
    @JsonProperty( "ApplicantOrg")
    String ApplicantOrg; //申请人单位,
    @JsonProperty( "ReceiveAddr")
    String ReceiveAddr; //http://192.168.20.158:8080/VIID/SubscribeNotifications,
    @JsonProperty( "ReportInterval")
    int ReportInterval; //60,
    @JsonProperty( "TabID")
    String TabID; //11010001234567890123456789012345678901234,
    @JsonProperty( "ResourceClass")
    int ResourceClass; // 0,
    @JsonProperty( "OperateType")
    int OperateType; // 1,
    @JsonProperty( "SubscribeDetail")
    String SubscribeDetail; //3

}
