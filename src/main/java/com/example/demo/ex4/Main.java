package com.example.demo.ex4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class Main implements CommandLineRunner {

    private final DummyLogger dummyLogger;
    private final StringUtil stringUtil;

    public Main(DummyLogger dummyLogger, StringUtil stringUtil) {
        this.dummyLogger = dummyLogger;
        this.stringUtil = stringUtil;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHi();
        log.info(stringUtil.formSentence(List.of("Hello", "Join", "Us")));
    }
}
