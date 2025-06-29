package com.example.demo.item.repository;

import com.example.demo.item.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    Boolean save(ItemEntity itemEntity);
    Boolean update(@Param("id") Long id, @Param("updateParam") ItemEntity updateParam);
    Optional<ItemEntity> findById(Long id);
    List<ItemEntity> findAll();
    Boolean deleteById(@Param("id") Long id);
}
