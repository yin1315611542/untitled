package org.example.entity;


public class KeepaliveDTO {
    public KeepaliveDTO.KeepaliveObject getKeepaliveObject() {
        return KeepaliveObject;
    }

    public void setKeepaliveObject(KeepaliveDTO.KeepaliveObject keepaliveObject) {
        KeepaliveObject = keepaliveObject;
    }

    KeepaliveObject KeepaliveObject;

   public class KeepaliveObject{

      String  DeviceID;

       public String getDeviceID() {
           return DeviceID;
       }

       public void setDeviceID(String deviceID) {
           DeviceID = deviceID;
       }
   }
}
