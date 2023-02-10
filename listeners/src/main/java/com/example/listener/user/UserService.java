package com.example.listener.user;

import com.example.listener.DomainEventPublisher;
import com.example.listener.order.OrderCreateEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 17:49
 **/
@Component
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    DomainEventPublisher domainEventPublisher;


    @EventListener
    public void addRecords(OrderCreateEvent orderCreateEvent){

        User user = new User();
        user.setAge(10);
        user.setDescribes("啦啦啦");
        double i = 1/0;
        userRepository.save(user);
        domainEventPublisher.publishEvent(new UserEvent());
    }
}
