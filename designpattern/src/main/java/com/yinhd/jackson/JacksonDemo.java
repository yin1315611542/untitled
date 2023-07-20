package com.yinhd.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.UserVo;



/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-30 09:34
 **/
public class JacksonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        UserVo userVo = new UserVo();
        userVo.setAge(12);
        userVo.setName("aaa");
        userVo.setaPool("ss");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(userVo);

        System.out.println(userVo);

    }
}
