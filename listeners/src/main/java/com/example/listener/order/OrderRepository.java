package com.example.listener.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 17:32
 **/

public interface OrderRepository extends JpaRepository<Order,Long> {

}
