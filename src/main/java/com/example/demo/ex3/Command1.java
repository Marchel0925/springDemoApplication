package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Command1 implements CommandLineRunner {

    @Autowired
    private DummyLoggerInterface dummyLoggerInterface;

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerInterface.sayHallo();
    }
}
