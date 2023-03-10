package com.example.jpa.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-15 13:45
 **/
//@PropertySource("classpath:/resources/application.yml")
//@Configuration
//public class MainConfigOfProfile {
//    public DataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//        comboPooledDataSource.setUser("root");
//        comboPooledDataSource.setPassword("123456");
//        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/listener");
//        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
//        return comboPooledDataSource;
//    }
//}
