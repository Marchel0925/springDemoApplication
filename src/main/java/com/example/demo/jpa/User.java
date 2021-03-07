package com.example.demo.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "users")
public class User {
    @Id
    private Long id;
    private String name;
}
