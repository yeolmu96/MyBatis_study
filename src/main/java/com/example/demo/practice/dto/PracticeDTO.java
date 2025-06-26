package com.example.demo.practice.dto;

import lombok.Data;

@Data
public class PracticeDTO {

    private String name;
    private String code;

    public PracticeDTO(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
