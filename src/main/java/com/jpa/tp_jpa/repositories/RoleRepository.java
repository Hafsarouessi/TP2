package com.jpa.tp_jpa.repositories;

import com.jpa.tp_jpa.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role,Long> {
Role findByRoleName(String roleName);
}
