package com.jpa.tp_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)

    private  long id ;
    @Column(name = "DESCRIPTION")
    private String desc ;
    @Column(length = 20, unique = true)
    private String roleName;


    @ManyToMany(fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<User> users=new ArrayList<>();

}
