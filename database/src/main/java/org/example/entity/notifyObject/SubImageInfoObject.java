package org.example.entity.notifyObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 图像子对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubImageInfoObject {
        String Type; //,
        String StoragePath; //http://192.168.1.1:80/image/1.jpgString ,
        String DeviceID; //32090100005030000000 ,
        FeatureInfoObject FeatureInfoObject;
        String ImageID; //32090100005030000001022019021316104219072String ,
        String EventSortString ; //1,
        String ShotTime; //21090218145212String ,
        String HeightString ; //20,
        String Data; //图片base64编码String ,
        String FileFormat; //JpegString ,
        String WidthString ; //20
}
