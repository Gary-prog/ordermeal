package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
