package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hallo");
    }

    public void sayHallo(){
        System.out.println("localhost:8081");
    }
}
