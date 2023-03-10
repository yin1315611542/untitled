package com.example.jpa.canvas;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-11 16:25
 **/
@Table(name = "canvas")
@Entity
@ToString
public class Canvas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
