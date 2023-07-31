package org.example.service;

import org.example.entity.notifyObject.MotorVehicle.MotorVehicleObject;

import java.io.IOException;
import java.util.List;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 10:00
 **/
public interface MotorVehicleService {
    List<MotorVehicleObject> pushMotorVehicleObject(String ip) throws InterruptedException, IOException;
}
