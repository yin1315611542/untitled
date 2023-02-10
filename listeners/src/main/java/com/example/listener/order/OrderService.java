package com.example.listener.order;

import com.example.listener.DomainEventPublisher;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 17:26
 **/
@Service
@RequiredArgsConstructor
public class OrderService {

    @Autowired
    DomainEventPublisher domainEventPublisher;

    private final OrderRepository orderRepository;

    @Transactional(rollbackFor = Exception.class)
    public void createOrder(){
        Order order = new Order();
        order.setBh("10000000000");
        order.setCreateTime(LocalDateTime.now());
        OrderCreateEvent orderCreateEvent = new OrderCreateEvent();
        orderRepository.save(order);
        domainEventPublisher.publishEvent(orderCreateEvent);
    }
}
