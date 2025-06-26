package com.example.demo.practice.service;

import com.example.demo.practice.dto.PracticeDTO;
import com.example.demo.practice.entity.PracticeEntity;
import com.example.demo.practice.repository.PracticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeService {

    @Autowired
    PracticeMapper practiceMapper;

    public boolean create(PracticeDTO practiceDTO) {
        PracticeEntity practiceEntity = new PracticeEntity(practiceDTO.getName(), practiceDTO.getCode());

        boolean createResult = practiceMapper.create(practiceEntity);

        if(!createResult){
            return false;
        }
        return true;
    }

    public List<PracticeEntity> getAll() {
        return practiceMapper.getAll();
    }
}
