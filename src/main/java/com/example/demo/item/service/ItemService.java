package com.example.demo.item.service;

import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    public boolean save(ItemDto itemDto);
    public List<ItemEntity> findAll();
    public Optional<ItemEntity> findById(Long itemId);
    public Boolean update(ItemUpdateDto)
}
