package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.example.service.APEObjectService;
import org.example.service.FaceObjectService;
import org.example.service.MotorVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 09:49
 **/
@RestController
@RequestMapping("/VIID")
@Slf4j
public class PushController {
    @Autowired
    MotorVehicleService  motorVehicleService;
    @Autowired
    FaceObjectService faceObjectService;
    @Autowired
    APEObjectService apeObjectService;
    @GetMapping("/pushVehicle")
    public ResponseEntity<?> pushVehicle(String ip) throws InterruptedException, IOException {
        try {
            motorVehicleService.pushMotorVehicleObject(ip);
            return ResponseEntity.ok("车辆抓拍数据已推送完毕，访问接口可再次推送！");
        }catch (Exception e){
            log.info("{}",e);
            return ResponseEntity.ok("推送失败，请检查目的服务器、端口是否正确或view-hub是否正常启动等其他原因！");
        }
    }

    @GetMapping("/push")
    public ResponseEntity<?> push(String ip) throws InterruptedException, JsonProcessingException {
        try {
            faceObjectService.pushFaceObject(ip);
            return ResponseEntity.ok("人脸抓拍数据已推送完毕，访问接口可再次推送！");
        }catch (Exception e){
            log.info("{}",e);
            return ResponseEntity.ok("推送失败，请检查目的服务器、端口是否正确或view-hub是否正常启动等其他原因！");
        }
    }

    /**
     *推送人脸设备
     * @param ip
     * @return
     * @throws JsonProcessingException
     */
    @GetMapping("/pushDevice")
    public ResponseEntity<?> pushDevice(String ip) throws JsonProcessingException {
      try {
          apeObjectService.pushAPEObject(ip);
          return ResponseEntity.ok("推送人脸设备成功");
      }catch (Exception e){
          log.info("{}",e);
          return ResponseEntity.ok("推送失败，请检查目的服务器、端口是否正确或view-hub是否正常启动等其他原因！");
      }
    }

    /**
     * 同人脸，具体格式参照1400协议
     */
    @GetMapping("/pushVDevice")
    public ResponseEntity<?> pushVDevice(String ip) throws JsonProcessingException {
        try {
            //TODO 参照1400协议进行发送格式拼装
            return ResponseEntity.ok("推送车辆设备成功");
        }catch (Exception e){
            log.info("{}",e);
            return ResponseEntity.ok("推送失败，请检查目的服务器、端口是否正确或view-hub是否正常启动等其他原因！");
        }
    }

}
