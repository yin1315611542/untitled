package com.example.jpa.topology;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-10 09:56
 **/
public interface TopologyRepository extends JpaRepository<Topology,Long> {
}
