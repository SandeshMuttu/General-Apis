package com.example.general.dev.controller;

import java.util.List;

import com.example.general.dev.entities.billing.Bill;
import com.example.general.dev.entities.billing.Item;
import com.example.general.dev.services.billing.CalculateBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingAPI {
    @Autowired
    private CalculateBillService calculateBillService;

    @PostMapping("/calculateBill")
    public ResponseEntity<Bill> addItem(@RequestBody List<Item> items) {
        Bill bill = calculateBillService.calculateBill(items);
        return new ResponseEntity<>(bill, HttpStatus.OK);
    }

}