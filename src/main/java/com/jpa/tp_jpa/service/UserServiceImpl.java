package com.jpa.tp_jpa.service;

import com.jpa.tp_jpa.entities.Role;
import com.jpa.tp_jpa.entities.User;
import com.jpa.tp_jpa.repositories.RoleRepository;
import com.jpa.tp_jpa.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private RoleRepository rolerepository ;

    private UserRepository userRepository;

    @Override

    public User addNewUser(User user) {
        user.setUserid(UUID.randomUUID().toString());

        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {

        return rolerepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {

        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findRoleByRoleName(String roleName) {

        return rolerepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user=findUserByUserName(username);
           Role role=findRoleByRoleName(roleName);

           user.getRoles().add(role);
           role.getUsers().add(user);
    }

    @Override
    public User authenticate(String userName, String password) {
        User user=userRepository.findByUsername(userName);

        if(user==null)  throw new RuntimeException("Bad credentials");

        if(user.getPassword().equals(password))
            return user;

        throw new RuntimeException("Bad credentials");
    }
}
