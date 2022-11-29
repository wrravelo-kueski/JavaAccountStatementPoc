package com.javaaccountstatement.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaaccountstatement.poc.models.FinanceProduct;
import com.javaaccountstatement.poc.repositories.FinanceProductRepository;
import com.javaaccountstatement.poc.repositories.UserRepository;

@RestController
@RequestMapping("finance_products")
public class FinanceProductController {

    @Autowired
    FinanceProductRepository financeProductRepository;

    @GetMapping("/{id}/transactions")
    public FinanceProduct transactions(@PathVariable String id) throws NotFoundException {
        return financeProductRepository.findById(6001).orElseThrow();
    }
}