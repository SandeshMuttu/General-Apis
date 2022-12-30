package com.example.general.dev.entities.billing;

import lombok.Data;
import lombok.Getter;

@Getter
public class Item {
    public String name;
    public double price;
    public int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
