package com.example.demo.item.dto;

import lombok.Data;

@Data
public class ItemDto {

    private String itemName;
    private Integer price;
    private Integer quantity;

    public ItemDto() {

    }

    public ItemDto(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
