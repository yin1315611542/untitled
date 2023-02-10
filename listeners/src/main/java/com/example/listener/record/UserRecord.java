package com.example.listener.record;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-08 09:56
 **/
@Entity
@Table(name = "user_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String operatingContent;

    LocalDateTime createDate;
}
