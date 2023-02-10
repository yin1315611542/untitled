package com.example.jpa.topology;

import com.example.jpa.discovery.DiscoveryEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

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

    @TransactionalEventListener
    public void saveTopology(DiscoveryEvent discoveryEvent){
        Topology topology = new Topology();
        topologyRepository.save(topology);
        int i= 1/0;
        log.info("创建topology成功");
    }
}
