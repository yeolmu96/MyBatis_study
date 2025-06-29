package com.example.demo.item.service;

import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.ItemEntity;
import com.example.demo.item.repository.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemMapper itemMapper;

    @Override
    public boolean save(ItemDto itemDto) {
        ItemEntity saveitem = new ItemEntity(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
        Boolean isSave = itemMapper.save(saveitem);

        if(!isSave){
            return false;
        }

        return true;
    }

    @Override
    public List<ItemEntity> findAll() {
        return itemMapper.findAll();
    }

    @Override
    public Optional<ItemEntity> findById(Long itemId) {
        return Optional.empty();
    }

    @Override
    public Boolean update(ItemUpdateDto itemUpdateDto) {
        return null;
    }

    @Override
    public Boolean deletebyId(Long itemId) {
        return null;
    }
}
