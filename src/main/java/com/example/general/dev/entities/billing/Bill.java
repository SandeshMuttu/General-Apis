package com.example.general.dev.entities.billing;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
public class Bill {
    private List<Item> items;
    private double total;

    public Bill(List<Item> items, double total) {
        this.items = items;
        this.total = total;
    }
}
