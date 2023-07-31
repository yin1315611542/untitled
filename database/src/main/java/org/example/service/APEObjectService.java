package org.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 17:20
 **/
public interface APEObjectService {
    void pushAPEObject(String ip) throws JsonProcessingException;
}
