package com.example.jvm.multdatasource;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-29 17:31
 **/
@Data
@TableName("user")
@ToString
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String password;
    private String name;
}
