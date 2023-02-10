package com.example.jpa.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 13:37
 **/
@Component
@Slf4j
public class Subscriber implements MessageListener {
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public void onMessage(Message message, byte[] pattern) {
        //todo 消息处理
        String channel = (String) redisTemplate.getKeySerializer().deserialize(message.getChannel());
        Object object = redisTemplate.getValueSerializer().deserialize(message.getBody());
        log.info("deserialize收到发现结果【{}，{}】",channel,object);
    }
}
