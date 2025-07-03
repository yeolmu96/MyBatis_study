package com.example.demo.item.service;

import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    public boolean save(ItemDto itemDto);
    public List<ItemEntity> findAll();
    public Optional<ItemEntity> findById(Long itemId);
    public Boolean update(ItemUpdateDto itemUpdateDto);
    public Boolean deleteById(Long itemId);
    public boolean saveAll(List<ItemDto> itemDtoList);
}
