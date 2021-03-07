package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Command2 implements CommandLineRunner {

    private DummyLoggerInterface dummyLoggerInterface;

    public Command2(@Qualifier("dummyLoggerImplementation") DummyLoggerInterface dummyLoggerInterface) {
        this.dummyLoggerInterface = dummyLoggerInterface;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerInterface.sayHallo();
    }
}
