package com.example.demo.item.service;

import com.example.demo.item.dto.ItemDto;
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

    public boolean save(ItemDto itemDto) {

        ItemEntity saveitem = new ItemEntity(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
        Boolean isSave = itemMapper.save(saveitem);

        if(!isSave){
            return false;
        }

        return true;
    }

    public List<ItemEntity> findAll() {
        return itemMapper.findAll();
    }

    public Optional<ItemEntity> findById(Long itemId) {
        return itemMapper.findById(itemId);
    }

    public boolean update(ItemUpdateDto itemUpdateDto) {
        return itemMapper.update(itemUpdateDto.getId(),
                new ItemEntity(itemUpdateDto.getItemName(),
                        itemUpdateDto.getPrice(),
                        itemUpdateDto.getQuantity()));
    }

    public Boolean deleteById(Long id) {
        return itemMapper.deleteById(itemId);
    }
}
