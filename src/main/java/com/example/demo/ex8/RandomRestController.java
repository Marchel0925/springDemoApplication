package com.example.demo.ex8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomRestController {

    private final RandomBooleanProvider randomBooleanProvider;

    public RandomRestController(RandomBooleanProvider randomBooleanProvider) {
        this.randomBooleanProvider = randomBooleanProvider;
    }

    @GetMapping("/api/random-boolean")
    public boolean getRandomBoolean(){
        return randomBooleanProvider.getValue();
    }
}
