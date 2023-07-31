package org.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 16:07
 **/
public interface FaceObjectService {
    void pushFaceObject(String url) throws JsonProcessingException;
}
