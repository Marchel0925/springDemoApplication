package com.example.demo.rest;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class User {
    @Email
    public String name;
    public String email;
}
