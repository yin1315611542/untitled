package com.example.jpa.discovery;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 10:07
 **/
@Component
@RequiredArgsConstructor
@Slf4j
public class DiscoveryService {
    private final DiscoveryRepository discoveryRepository;

    @Transactional
    public void createDiscovery(){
        String type="全网发现";
        Discovery discovery = new Discovery(type);
        discoveryRepository.save(discovery);
        log.info("创建discovery成功");
    }
}
