package com.jpa.tp_jpa;

import com.jpa.tp_jpa.entities.Role;
import com.jpa.tp_jpa.entities.User;
import com.jpa.tp_jpa.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TpJpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(TpJpaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
           /* User u=new User();
            u.setUsername("user1");
            u.setPassword("123456");
            userService.addNewUser(u);


            Stream.of("STUDENT").forEach(r -> {
                Role role1 = new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);

            });*/
            userService.addRoleToUser("user1", "STUDENT");

           /* try{
                User user=userService.authenticate("user","123456");
                System.out.println(user.getUserid());
                System.out.println(user.getUsername());
                System.out.println("Role ==> ");
                user.getRoles().forEach(r->{
                    System.out.println("Role ==> " +r.toString());
                });
            }catch(Exception e){
                e.printStackTrace();

            }*/



        };
    }
    }


