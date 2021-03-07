package com.example.demo.ex7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class NameController {
    @GetMapping("/api/pairs/{name}")
    public NamePairs getNamePairs(@PathVariable("name") String name){
        return NamePairs.builder()
                .name(name)
                .pairs(new HashMap<>())
                .build();
    }
}
