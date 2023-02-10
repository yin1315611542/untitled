package com.example.listener.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-07 17:48
 **/

public interface UserRepository extends JpaRepository<User,Long> {
}
