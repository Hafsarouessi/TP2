package com.jpa.tp_jpa.repositories;

import com.jpa.tp_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);

}
