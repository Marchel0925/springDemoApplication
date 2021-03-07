package com.example.demo.ex11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PCGameForm {
    private String title;
    private String producer;
    private String genre;
    private Integer minimumAge;
    private Boolean isAAA;
}
