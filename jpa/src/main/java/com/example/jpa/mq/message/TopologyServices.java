package com.example.jpa.mq.message;

import com.example.jpa.discovery.DiscoveryEvent;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 10:27
 **/
@Component("topology2")
@RequiredArgsConstructor
@Slf4j
public class TopologyServices {
    private final TopologyRepositorys topologyRepositorys;
    @Autowired
    private RedisTemplate redisTemplate;


    public void save(){
        Topologys topologys = new Topologys();
        for (Long i = 10L; i <20L ; i++) {
            topologys.setType("全网发现"+i);
            topologys.setLocalDateTime(LocalDateTime.now());
            topologyRepositorys.save(topologys);
        }
        Iterable<Topologys> all = topologyRepositorys.findAll();
        all.forEach(e->{
            log.info("redis:{}",e);
        });
    }

//    @EventListener
//    public void send(DiscoveryEvent discoveryEvent){
//        Topologys topologys = new Topologys();
//        topologys.setId(LocalDateTime.now().getSecond());
//        topologys.setType("全网发现");
//        topologys.setLocalDateTime(LocalDateTime.now());
//        topologyRepositorys.save(topologys);
//        log.info("向redis发送服务1");
//    }

    @TransactionalEventListener
    public void send2(DiscoveryEvent discoveryEvent){
        redisTemplate.convertAndSend("discovery","2222");
        log.info("向redis发送服务2");
    }

}
