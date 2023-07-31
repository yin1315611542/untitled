package org.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.notifyObject.Face.FaceObject;
import org.example.entity.notifyObject.Face.FaceObjectList;
import org.example.entity.notifyObject.NotifyObjectDTO;
import org.example.entity.notifyObject.SubImageList;
import org.example.entity.notifyObject.SubscribeNotificationListObject;
import org.example.entity.notifyObject.SubscribeNotificationObject;
import org.example.repository.FaceObjectRepository;
import org.example.service.FaceObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 16:08
 **/
@Slf4j
@Service
public class FaceObjectServiceImpl implements FaceObjectService {
    @Autowired
    FaceObjectRepository faceObjectRepository;

    @Override
    public void pushFaceObject(String url) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        List<FaceObject> faceObjects = faceObjectRepository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String urls = "http://" + url + ":8889/VIID/SubscribeNotifications";
        for (FaceObject faceObject : faceObjects) {
            if (ObjectUtils.isEmpty(faceObject.getSubImageLists())) {
                continue;
            }
            FaceObjectList faceObjectList = new FaceObjectList();
            SubImageList subImageList = objectMapper.readValue(faceObject.getSubImageLists(), new TypeReference<SubImageList>() {
            });
            faceObject.setSubImageList(subImageList);
            faceObjectList.setFaceObject(Collections.singletonList(faceObject));
            NotifyObjectDTO notifyObjectDTO = new NotifyObjectDTO();
            SubscribeNotificationObject subscribeNotificationObject = new SubscribeNotificationObject();
            subscribeNotificationObject.setFaceObjectList(faceObjectList);
            SubscribeNotificationListObject subscribeNotificationListObject = new SubscribeNotificationListObject();
            subscribeNotificationListObject.setSubscribeNotificationObject(Collections.singletonList(subscribeNotificationObject));
            notifyObjectDTO.setSubscribeNotificationListObject(subscribeNotificationListObject);
            String str = objectMapper.writeValueAsString(notifyObjectDTO);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<>(str, headers);
            restTemplate.exchange(urls, HttpMethod.POST, entity, Map.class);
            log.info("推送编码为【{}】的人脸抓拍数据",faceObject.getDeviceID());
        }
        log.info("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                + "推送了一轮人脸抓拍数据,地址：{}\n"
                + "\n人脸摄像机编码           数量\n" + "13100320211190000162\t739\n" + "13100320211190000122\t864\n" + "13100320211190000010\t308\n" + "13100320211190000148\t864\n" + "13100320211190000152\t1470\n" + "13100320211190000027\t477\n" + "13100320211190000150\t317\n" + "13100320211190000159\t944\n" + "13100320211190000161\t792\n" + "13100320211190000057\t632\n" + "13100320211190000003\t1585\n" + "13100320211190000151\t379\n" + "13100320211190000157\t334\n" + "13100320211190000014\t319\n" + "13100320211190000002\t1942\n" + "13100320211190000108\t500\n" + "13100320211190000165\t1232\n" + "13100320211190000054\t307\n" + "13100320211190000156\t730\n" + "13100320211190000012\t484\n" + "13100320211190000114\t349\n"
                + "各数量仅供参考，可能有误差，再次请求接口可再次推送\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",urls);
    }
}
