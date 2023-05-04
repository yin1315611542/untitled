package com.example.listener;

import com.example.listener.order.OrderService;
import com.example.listener.record.UserRecordService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ListenerApplication.class)
public class ListenerApplicationTests {
    @Resource
    OrderService orderService;
    @Autowired
    UserRecordService userRecordService;

    @Test
    public void contextLoads() {
        orderService.createOrder();
    }

    @Test
    public void testAop(){
        userRecordService.aspect();
    }

}
