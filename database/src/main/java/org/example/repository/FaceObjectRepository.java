package org.example.repository;

import org.example.entity.notifyObject.Face.FaceObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 16:09
 **/
@Repository
public interface FaceObjectRepository extends JpaRepository<FaceObject,Long>, QuerydslPredicateExecutor<FaceObject> {
}
