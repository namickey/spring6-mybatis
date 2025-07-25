package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    public Item() {
        // Default constructor
    }

    private Integer id;
    private String itemName;
    private Integer price;
}
