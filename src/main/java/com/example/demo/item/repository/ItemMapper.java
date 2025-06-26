package com.example.demo.item.repository;

import com.example.demo.item.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    Boolean save(ItemEntity saveitem);
    List<ItemEntity> findAll();
    Optional<ItemEntity> findById(Long itemId);
}
