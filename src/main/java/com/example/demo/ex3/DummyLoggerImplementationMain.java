package com.example.demo.ex3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DummyLoggerImplementationMain implements DummyLoggerInterface {
    @Override
    public void sayHallo() {
        System.out.println(DummyLoggerImplementationMain.class.getName());
    }
}
