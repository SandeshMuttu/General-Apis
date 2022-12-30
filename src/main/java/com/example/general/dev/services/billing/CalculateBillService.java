package com.example.general.dev.services.billing;

import com.example.general.dev.entities.billing.Bill;
import com.example.general.dev.entities.billing.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateBillService {
    public Bill calculateBill(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.price * item.quantity;
        }
        return new Bill(items, total);
    }
}
