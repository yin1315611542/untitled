package org.example.entity.notifyObject.Tollgate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tollgate_object")
public class TollgateObject {
    @Id
    Long id;
    @Column(name = "Status")
    String Status; //1
    @Column(name = "OrgCode")
    String OrgCode; //100000000000
    @Column(name = "TollgateID")
    String TollgateID; //32090100001210190213
    @Column(name = "ActiveTime")
    String ActiveTime; //20190113121212
    @Column(name = "LaneNum")
    int LaneNum;//: 3,
    @Column(name = "PlaceCode")
    String PlaceCode; //330001
    @Column(name = "TollgateCat")
    String TollgateCat; //10
    @Column(name = "Latitude")
    Double Latitude; //: 20.1,
    @Column(name = "Longitude")
    Double Longitude; //: 120.1,
    @Column(name = "TollgateUsage")
    int TollgateUsage; //: 80,
    @Column(name = "Place")
    String Place; //位置名
    @Column(name = "Name")
    String Name; //卡口名称String
}
