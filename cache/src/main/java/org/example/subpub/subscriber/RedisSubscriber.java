package org.example.subpub.subscriber;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RedisSubscriber implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        String channel = new String(message.getChannel());
        String body = new String(message.getBody());
        System.out.println("【接收到Redis消息】==>From channel【" + channel + "】" + " and message is: " + body);
        // 可以根据需要添加更多频道的处理逻辑

    }
}
