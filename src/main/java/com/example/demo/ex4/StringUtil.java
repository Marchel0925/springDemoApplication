package com.example.demo.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public String formSentence(final List<String> words) {
        return words.stream().collect(Collectors.joining(" ", "", "."));
    }
}
