package com.example.demo.practice.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PracticeEntity {

    private Long id;

    private String name;
    private String code;

    public PracticeEntity() {

    }

    public PracticeEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
