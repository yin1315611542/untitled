package com.example.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-11 17:27
 **/
@Configuration
public class TransactionManagerConfig {

//    @Autowired
//    DataSource dataSource;

//    @Bean(name = "jdbcTransactionManager")
//    public DataSourceTransactionManager dataSourceTransactionManager(){
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//       dataSourceTransactionManager.setDataSource(dataSource);
//        return dataSourceTransactionManager;
//    }
}
