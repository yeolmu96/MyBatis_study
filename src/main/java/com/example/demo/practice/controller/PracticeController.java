package com.example.demo.practice.controller;

import com.example.demo.practice.dto.PracticeDTO;
import com.example.demo.practice.entity.PracticeEntity;
import com.example.demo.practice.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PracticeController {
    //create, select

    @Autowired
    private PracticeService practiceService;

    //create
    @PostMapping("/create")
    public ResponseEntity<String> getOne(){
        PracticeDTO dto = new PracticeDTO("spring", "code001");
        boolean result = practiceService.create(dto);

        if(result){
            return ResponseEntity.ok("successed");
        }else{
            return ResponseEntity.badRequest().body("failed");
        }
    }

    //select
    @GetMapping("/getAll")
    public ResponseEntity<List<PracticeEntity>> getAll(){
        return ResponseEntity.ok(practiceService.getAll());
    }
}
