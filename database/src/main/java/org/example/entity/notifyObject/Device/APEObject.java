package org.example.entity.notifyObject.Device;

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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ape_object")
public class APEObject  extends VIIDObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "IPAddr")
    String IPAddr; //1.1.1.1
    @Column(name = "Port")
    int Port; //: 8080,
    @Column(name = "FunctionType")
    String FunctionType; //1
    @Column(name = "PlaceCode")
    String PlaceCode; //110100
    @Column(name = "Latitude")
    Double Latitude; //: 12.12345
    @Column(name = "Longitude")// 6,
    Double Longitude; //: 12.1234
    @Column(name = "OwnerApsID")// 56,
    String OwnerApsID; //33030000001200000001
    @Column(name = "Name")
    String Name; //设备名称
    @Column(name = "IsOnline")
    String IsOnline; //1
    @Column(name = "PositionType")
    String PositionType; //1
    @Column(name = "OrgCode")
    String OrgCode; //330000000000
    @Column(name = "MonitorAreaDesc")
    String MonitorAreaDesc; //监视区域说明
    @Column(name = "CapDirection")
    int CapDirection; //: 0,
    @Column(name = "UserId")
    String UserId; //用户账号
    @Column(name = "Model")
    String Model; //设备型号
    @Column(name = "ApeID")
    String ApeID; //33010800001190000001
    @Column(name = "IPV6Addr")
    String IPV6Addr; //2031:0000:1F1F:0000:0000:0100:11A0:ADDF
    @Column(name = "MonitorDirection")
    String MonitorDirection; //1
    @Column(name = "Place")
    String Place; //海康威视三期北门左侧
    @Column(name = "Password")
    String Password; //123456String
}
