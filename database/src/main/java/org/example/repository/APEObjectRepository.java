package org.example.repository;

import org.example.entity.notifyObject.Device.APEObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 17:24
 **/
@Repository
public interface APEObjectRepository extends JpaRepository<APEObject,Long>, QuerydslPredicateExecutor<APEObject> {
}
