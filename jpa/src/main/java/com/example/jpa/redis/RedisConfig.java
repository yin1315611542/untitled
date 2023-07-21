package com.example.jpa.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.Topic;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.ArrayList;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 10:39
 **/
@Configuration
@EnableRedisRepositories
public class RedisConfig {
//    @Value("${spring.redis.host}")
//    private String host;
//
//    @Value("${spring.redis.port}")
//    private int port;
//
//    @Value("${spring.redis.password}")
//    private String password;
//
//    @Value("${spring.redis.database}")
//    private int database;
//    //指定连接工厂,RedisConnectionFactory实现类有两个：JedisConnectionFactory 和 LettuceConnectionFactory
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
//        connectionFactory.setHostName(host);
//        connectionFactory.setPort(port);
//        connectionFactory.setPassword(password);
//        connectionFactory.setDatabase(database);
//        return connectionFactory;
//    }
    //模板类 封装了关于Redis的操作方法 执行redis增删改查操作  依赖RedisConnectionFactory
    @Bean("redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        return template;
    }

    @Bean
    public MessageListenerAdapter listenerAdapter(MessageListener listener) {
        return new MessageListenerAdapter(listener);
    }

    // 消息监听者容器 负责 管理监听线程池，消息分发，分发给对应管道的监听者
    @Bean
    RedisMessageListenerContainer container(MessageListener listenerAdapter,RedisConnectionFactory redisConnectionFactory) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(redisConnectionFactory);
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new PatternTopic("discovery"));
        container.addMessageListener(listenerAdapter, topics);
        return container;
    }


}
