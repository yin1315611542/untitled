package com.example.listener;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 15:57
 **/
public interface DomainEventPublisher {
    void publishEvent(BaseDomainEvent baseDomainEvent);
}
