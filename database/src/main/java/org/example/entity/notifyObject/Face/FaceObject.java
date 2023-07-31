package org.example.entity.notifyObject.Face;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "facebject")
@Entity
public class FaceObject extends VIIDObject {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "FaceID")
    String FaceID; //330108000011900000010520190218164609123450612345
    @Column(name = "GenderCode")
    String GenderCode; //0
    @Column(name = "EthicCode")
    String EthicCode; //01
    @Column(name = "ResidenceAdminDivision")
    String ResidenceAdminDivision; //330108
    @Column(name = "DeviceID")
    String DeviceID; //33010800001190000001
    @Column(name = "SourceID")
    String SourceID; //33010800001190000001052019021816460912345
    @Column(name = "NationalityCode")
    String NationalityCode; //CHN
    @Transient
    org.example.entity.notifyObject.SubImageList SubImageList; // ; // {

    public String getSubImageLists() {
        return SubImageLists;
    }

    public void setSubImageLists(String subImageLists) {
        SubImageLists = subImageLists;
    }

    @Column(name = "SubImageList")
    String SubImageLists;
    @Column(name = "IDType")
    String IDType; //111
    @Column(name = "Name")
    String Name; //张三
    @Column(name = "NativeCityCode")
    String NativeCityCode; //330108
    @Transient
    org.example.entity.notifyObject.FeatureList FeatureList; //
    @Column(name = "FeatureList")
    String FeatureLists;
    @Column(name = "ShotTime")
    String ShotTime; //20190218164609
    @Column(name = "Similaritydegree")
    Double Similaritydegree; //:0.97,
    @Column(name = "TabID")
    String TabID; //33010800001190000001052019021816460912345
    @Column(name = "IDNumber")
    String IDNumber; //33010800001190000001

}
