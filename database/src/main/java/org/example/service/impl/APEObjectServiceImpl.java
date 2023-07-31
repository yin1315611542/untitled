package org.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.notifyObject.Device.APEObject;
import org.example.entity.notifyObject.Device.DeviceList;
import org.example.entity.notifyObject.NotifyObjectDTO;
import org.example.entity.notifyObject.SubscribeNotificationListObject;
import org.example.entity.notifyObject.SubscribeNotificationObject;
import org.example.repository.APEObjectRepository;
import org.example.service.APEObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 17:20
 **/
@Service
@Slf4j
public class APEObjectServiceImpl implements APEObjectService {
    @Autowired
    APEObjectRepository apeObjectRepository;
    @Override
    public void pushAPEObject(String ip) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        List<APEObject> apeObjects = apeObjectRepository.findAll();
        for (APEObject a : apeObjects) {
            DeviceList deviceList = new DeviceList();
            deviceList.setAPEObject(Collections.singletonList(a));
            NotifyObjectDTO notifyObjectDTO = new NotifyObjectDTO();
            SubscribeNotificationObject subscribeNotificationObject = new SubscribeNotificationObject();
            subscribeNotificationObject.setDeviceList(deviceList);
            SubscribeNotificationListObject subscribeNotificationListObject = new SubscribeNotificationListObject();
            subscribeNotificationListObject.setSubscribeNotificationObject(Collections.singletonList(subscribeNotificationObject));
            notifyObjectDTO.setSubscribeNotificationListObject(subscribeNotificationListObject);
            String string = objectMapper.writeValueAsString(notifyObjectDTO);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<String>(string, headers);
            restTemplate.exchange("http://"+ip+":8889/VIID/SubscribeNotifications", HttpMethod.POST, entity, Map.class);
            log.info("推送编码为【{}】的人脸设备",a.getApeID());
        }
        log.info("此轮人脸设备推送完毕！！");
    }
}
