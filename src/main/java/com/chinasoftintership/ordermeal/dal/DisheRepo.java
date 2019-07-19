package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisheRepo extends JpaRepository<Dishes, Integer> {

}
