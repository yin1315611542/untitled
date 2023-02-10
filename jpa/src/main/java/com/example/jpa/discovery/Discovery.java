package com.example.jpa.discovery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.id.UUIDGenerator;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 09:16
 **/
@Table(name = "discovery")
@Entity
@ToString
public class Discovery extends AbstractAggregateRoot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String uuid;

    String type;

    LocalDateTime createTime;

    public Discovery() {
    }

    public Discovery(String type) {
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.createTime = LocalDateTime.now();
        this.registerEvent(new DiscoveryEvent());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
