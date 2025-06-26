package com.example.demo.practice.repository;

import com.example.demo.practice.entity.PracticeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PracticeMapper {
    boolean create(PracticeEntity practiceEntity);
    List<PracticeEntity> getAll();
}
