package com.jpa.tp_jpa.service;

import com.jpa.tp_jpa.entities.Role;
import com.jpa.tp_jpa.entities.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface UserService  {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName (String userName);
    Role findRoleByRoleName (String roleName);
    void addRoleToUser (String username, String roleName);
    User authenticate(String userName,String password);

}
