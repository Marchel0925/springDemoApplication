package com.example.demo.ex8;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomBooleanProvider {

    public boolean getValue() {
        return new Random().nextBoolean();
    }
}
