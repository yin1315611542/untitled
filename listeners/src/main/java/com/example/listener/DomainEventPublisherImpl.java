package com.example.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 15:58
 **/
@Component
@Slf4j
public class DomainEventPublisherImpl implements DomainEventPublisher{
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void publishEvent(BaseDomainEvent baseDomainEvent) {
        log.info("发布");
        applicationEventPublisher.publishEvent(baseDomainEvent);
    }
}
