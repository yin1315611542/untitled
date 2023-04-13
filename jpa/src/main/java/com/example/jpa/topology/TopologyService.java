package com.example.jpa.topology;

import com.example.jpa.discovery.DiscoveryEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import java.time.LocalDateTime;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 09:55
 **/
@Component
@RequiredArgsConstructor
@Slf4j
public class TopologyService {

    private final TopologyRepository topologyRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createTopology(String number){
        Topology topology = new Topology();
        topology.setType("全网发现");
        topology.setLocalDateTime(LocalDateTime.now());
        topology.setUuid(number);
//        jdbcTemplate.update("insert into topology ( type, uuid) values ('123', '456')");
        topologyRepository.save(topology);
//        int i = 1/0;
        System.out.println("创建topology");
    }

    /*Propagation.REQUIRES_NEW
    两个事务  b使用REQUIRES_NEW 新开一个事务 a是否执行成功不影响b b是否执行成功会影响a
    a调用b,c b使用REQUIRES_NEW a、c为一个事务 b为单独的一个事务
    */



    @EventListener
    @Order(1)
    public void saveTopology(DiscoveryEvent discoveryEvent){
        Topology topology = new Topology();
        topologyRepository.save(topology);
        log.info("创建topology成功");
    }

    @EventListener
    @Async
    @Order(0)
    public void saveLog(DiscoveryEvent discoveryEvent){
        Topology topology = new Topology();
        topology.setType("发现日志");
        topologyRepository.save(topology);
        int i= 1/0;
        log.info("创建topology成功");
    }

}
