package com.example.demo.item.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ItemUpdateDto {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
}
