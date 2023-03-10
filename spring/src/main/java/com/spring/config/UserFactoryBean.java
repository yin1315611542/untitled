package com.spring.config;

import com.spring.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-14 16:05
 **/
public class UserFactoryBean implements FactoryBean<User> {

    //返回对象到容器中
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
