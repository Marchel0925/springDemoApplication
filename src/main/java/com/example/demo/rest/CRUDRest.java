package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDRest {

    List<User> users = new ArrayList<>();

    @GetMapping("/name/{id}")
    public String getName(@PathVariable("id") String id){
        return "Marcis Andersons" + id;
    }

    @GetMapping("/user/all")
    public List<User> getAllUsers(){
        return users;
    }

    @PostMapping("/user/new")
    public String createUser(@RequestBody @Valid User user){ // need postman to send a body json
        users.add(user);
        return "OK " + user.getName();
    }

    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user){
        for(User u: users){
            if(u.getName().equals(user.getName())){
                u.setEmail(user.getEmail());
            }
        }
        return "OK " + user.getName();
    }

    @DeleteMapping("/user/{name}")
    public String deleteUser(@PathVariable("name") String name){
        users.removeIf(u -> u.getName().equals(name));
        return "User removed";
    }
}
