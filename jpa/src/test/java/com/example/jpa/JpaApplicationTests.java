package com.example.jpa;

import com.example.jpa.discovery.DiscoveryController;
import com.example.jpa.discovery.DiscoveryService;
import com.example.jpa.log.AopConfig;
import com.example.jpa.mq.message.TopologyServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootTest
class JpaApplicationTests {

    @Autowired
    DiscoveryService discoveryService;
//    @Autowired
//    RedisTemplate redisTemplate;
    @Autowired
    @Qualifier("topology2")
    TopologyServices topologyService;
    @Autowired
    JdbcTemplate jdbcTemplate;



//    @Test
//    void contextLoads() {
//        discoveryService.createDiscovery();
//    }

//    @Test
//    void redisTest(){
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        valueOperations.set("name","jon");
//        valueOperations.get("name");
//        System.out.println(valueOperations.get("name"));
//    }

//    @Test
//    void redisTest2(){
//        redisTemplate.convertAndSend("discovery",",,,");
//    }
//
//    @Test
//    void redisTest3(){
//        redisTemplate.convertAndSend("discovery",",,,");
//    }

    @Test
    void redisTest4(){
        topologyService.save();
    }

    @Test
    void createDiscovery(){
//        discoveryService.createDiscovery2();
    }

    @Test
    void test(){
        jdbcTemplate.update("insert into topology ( type, uuid) values ('123', '456')");
    }

   @Test
    void spring() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       DiscoveryController discoveryController = new DiscoveryController();
       Class<? extends DiscoveryController> aClass = discoveryController.getClass();
       DiscoveryService discoveryService = new DiscoveryService();
       Field topologyService = aClass.getDeclaredField("discoveryService");
       topologyService.setAccessible(true);
       String name = topologyService.getName();
       name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
       String set = "set"+name;
       Method method = aClass.getMethod(set, DiscoveryService.class);
       method.invoke(discoveryController,discoveryService);
       System.out.println(discoveryController.getDiscoveryService());
   }

   @Test
    public void aop(){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

       discoveryService.aspect();

   }
}
