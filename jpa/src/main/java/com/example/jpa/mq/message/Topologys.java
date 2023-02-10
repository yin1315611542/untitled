package com.example.jpa.mq.message;

import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 16:42
 **/
@RedisHash("topology")
@ToString
public class Topologys {
    @Id
    private Integer id;

    private String type;

    private LocalDateTime localDateTime;

    public Topologys() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
