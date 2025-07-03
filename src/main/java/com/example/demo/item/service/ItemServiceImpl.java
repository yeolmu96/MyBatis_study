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
        return itemMapper.findById(itemId);
    }

    @Override
    public Boolean update(ItemUpdateDto itemUpdateDto) {
        return itemMapper.update(itemUpdateDto.getId(),
                new ItemEntity(itemUpdateDto.getItemName(), itemUpdateDto.getPrice(), itemUpdateDto.getQuantity()));
    }

    @Override
    public Boolean deleteById(Long itemId) {
        return itemMapper.deleteById(itemId);
    }

    public boolean saveAll(List<ItemDto> itemDtoList) {
        for(ItemDto itemDto:itemDtoList){
            System.out.println("저장:" + itemDto.getItemName());
            save(itemDto);
        }
        return true;
    }
}
