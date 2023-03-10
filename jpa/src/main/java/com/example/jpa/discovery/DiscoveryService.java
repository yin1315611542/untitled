package com.example.jpa.discovery;

import com.example.jpa.canvas.CanvasService;
import com.example.jpa.mq.message.TopologyRepositorys;
import com.example.jpa.mq.message.TopologyServices;
import com.example.jpa.topology.Topology;
import com.example.jpa.topology.TopologyRepository;
import com.example.jpa.topology.TopologyService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 10:07
 **/
@Component
//@RequiredArgsConstructor
@Slf4j
public class DiscoveryService {
//    private final DiscoveryRepository discoveryRepository;
//    private final TopologyRepository topologyRepository;

    @Autowired
    TopologyService topologyService;
    @Autowired
    CanvasService canvasService;


    public DiscoveryService() {
    }

    public void aspect(){
        System.out.println("执行操作");
    }

//    @Transactional
//    public void createDiscovery(){
//        String type="全网发现";
//        Discovery discovery = new Discovery(type);
//        discoveryRepository.save(discovery);
//        log.info("创建discovery成功");
//    }
//
//   // @TransactionalEventListener
//    public void saveTopology(DiscoveryEvent discoveryEvent){
//        Topology topology = new Topology();
//        topologyRepository.save(topology);
//        int i = 1/0;
//        log.info("创建topology成功");
//    }
//
//    @Transactional
//    public void createDiscovery2(){
//        String s = UUID.randomUUID().toString();
//        Discovery discovery = new Discovery();
//        discovery.setUuid(s);
//        discovery.setType("全网发现");
//        discoveryRepository.save(discovery);
//        topologyService.createTopology(s);
////        canvasService.createCanvas(s);
////        int i = 1/0;
//        System.out.println("创建发现");
//    }
//
//    public void createTopology(String number){
//        Topology topology = new Topology();
//        topology.setType("全网发现");
//        topology.setLocalDateTime(LocalDateTime.now());
//        topology.setUuid(number);
//        topologyRepository.save(topology);
//        System.out.println("创建topology");
//    }
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
//    public void aVoid(String number){
//        Topology topology = new Topology();
//        topology.setType("全网发现");
//        topology.setLocalDateTime(LocalDateTime.now());
//        topology.setUuid(number);
//        topologyRepository.save(topology);
//        System.out.println("创建topology");
//    }
}
