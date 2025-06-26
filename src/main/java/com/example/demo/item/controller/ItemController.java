package com.example.demo.item.controller;

import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.entity.ItemEntity;
import com.example.demo.item.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item")
public class ItemController {

    private final ItemServiceImpl itemService;

    //저장
    @PostMapping("save")
    public ResponseEntity<String> save(@RequestBody ItemDto itemDto){

        boolean result = itemService.save(itemDto);

        if(result){
            return ResponseEntity.ok().body("생성 successed");
        } else{
            return ResponseEntity.badRequest().body("생성 failed");
        }
    }

    //검색
    @GetMapping("/{id}")
    public ResponseEntity<ItemEntity> findById(@PathVariable("id") Long id){

        Optional<ItemEntity> findItem = itemService.findById(id);
        log.info("findItem:{}", findItem);

        if(findItem.isPresent()){
            return ResponseEntity.ok().body(findItem.get());
        }

        return ResponseEntity.notFound().build();
    }

    //전체검색
    @GetMapping("/All")
    public ResponseEntity<List<ItemEntity>> findAll(){
        return ResponseEntity.ok(itemService.findAll());
    }

    //수정
    @PatchMapping("/update")
    public ResponseEntity<String> update(@RequestBody ItemUpdateDto itemUpdateDto){

        boolean result = itemService.update(itemUpdateDto);

        if(result){
            return ResponseEntity.ok().body("수정 successed");
        }

        return ResponseEntity.badRequest().body("수정 failed");
    }

    //삭제
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {

        Boolean result = itemService.deleteById(id);

        if(result){
            return ResponseEntity.ok().body("삭제 successed");
        }

        return ResponseEntity.badRequest().body("삭제 failed");
    }
}
