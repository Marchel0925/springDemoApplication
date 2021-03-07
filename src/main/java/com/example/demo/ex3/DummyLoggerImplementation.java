package com.example.demo.ex3;

import org.springframework.stereotype.Component;

@Component
public class DummyLoggerImplementation implements DummyLoggerInterface {
    @Override
    public void sayHallo() {
        System.out.println(DummyLoggerImplementation.class.getName());
    }
}
