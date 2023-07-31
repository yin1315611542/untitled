package org.example.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.notifyObject.MotorVehicle.MotorVehicleObject;
import org.example.entity.notifyObject.MotorVehicle.MotorVehicleObjectList;
import org.example.entity.notifyObject.NotifyObjectDTO;
import org.example.entity.notifyObject.SubImageList;
import org.example.entity.notifyObject.SubscribeNotificationListObject;
import org.example.entity.notifyObject.SubscribeNotificationObject;
import org.example.repository.MotorVehicleRepository;
import org.example.service.MotorVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 09:53
 **/
@Service
@Slf4j
public class MotorVehicleServiceImpl implements MotorVehicleService {
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    MotorVehicleRepository motorVehicleRepository;
    @Override
    public List<MotorVehicleObject> pushMotorVehicleObject(String ip) throws InterruptedException, IOException {
        List<MotorVehicleObject> motorVehicleObjects = motorVehicleRepository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String urls = "http://" + ip + ":8889/VIID/SubscribeNotifications";
        for (MotorVehicleObject motorVehicleObject : motorVehicleObjects) {
            MotorVehicleObjectList motorVehicleObjectList = new MotorVehicleObjectList();
            if (ObjectUtils.isEmpty(motorVehicleObject.getSubImageLists())){continue;}
            SubImageList subImageList = objectMapper.readValue(motorVehicleObject.getSubImageLists(), new TypeReference<SubImageList>() {
            });
            motorVehicleObject.setSubImageList(subImageList);
            motorVehicleObjectList.setMotorVehicleObject(Collections.singletonList(motorVehicleObject));
            NotifyObjectDTO notifyObjectDTO = new NotifyObjectDTO();
            SubscribeNotificationObject subscribeNotificationObject = new SubscribeNotificationObject();
            subscribeNotificationObject.setMotorVehicleObjectList(motorVehicleObjectList);
            SubscribeNotificationListObject subscribeNotificationListObject = new SubscribeNotificationListObject();
            subscribeNotificationListObject.setSubscribeNotificationObject(Collections.singletonList(subscribeNotificationObject));
            notifyObjectDTO.setSubscribeNotificationListObject(subscribeNotificationListObject);
            String str = objectMapper.writeValueAsString(notifyObjectDTO);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<String>(str, headers);
            restTemplate.exchange(urls, HttpMethod.POST, entity, Map.class);
            log.info("推送编码为【{}】的车辆抓拍数据",motorVehicleObject.getDeviceID());
        }
        log.info("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                + "推送了一轮车辆抓拍数据,地址：{}\n"
                + "\n车辆摄像机编码           数量\n"
                +"13102500011210026008\t495\n" + "13100242011210000101\t77\n" + "13108237051210003557\t65\n" + "13108203051210003281\t79\n" + "13108237051210003661\t65\n" + "13108203051210003121\t71\n" + "13108237051210003641\t67\n" + "13108203051210003761\t65\n" + "13108237051210003624\t79\n" + "13100243011210001002\t79\n" + "13100349001191029072\t66\n" + "13108237051210003559\t68\n" + "13108262051210004741\t66\n" + "13108237051210002168\t66\n" + "13100346001191029112\t78\n" + "13108237051210003684\t72\n" + "13102646011191000389\t91\n"
                + "各数量仅供参考，可能有误差，再次请求接口可再次推送\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",urls);
        return null;
    }
}
