package org.example.repository;

import org.example.entity.notifyObject.MotorVehicle.MotorVehicleObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-29 11:27
 **/
@Repository
public interface MotorVehicleRepository extends JpaRepository<MotorVehicleObject,Long>, QuerydslPredicateExecutor<MotorVehicleObject> {
}
