package com.example.listener.record;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-08 09:59
 **/
public interface RecordRepository extends JpaRepository<UserRecord,Long> {
}
