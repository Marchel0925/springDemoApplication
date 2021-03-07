package com.example.demo.ex9;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "files_data")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String file_name;
    private String extension;
    private Long size_in_kb;
    private String content;
}
