package com.example.demo.ex2;

import com.example.demo.DummyLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger; //need annotation for DummyLogger class
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHallo();
    }
}
