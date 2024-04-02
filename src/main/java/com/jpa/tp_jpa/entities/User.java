package com.jpa.tp_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name ="USERS")
@Data @AllArgsConstructor @NoArgsConstructor

public class User {
    @Id
    private String userid ;
    @Column(name = "USER_NAME",unique = true,length = 20)
    private  String username;
    private String password;
@ManyToMany(mappedBy = "users",fetch  =FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();
}
