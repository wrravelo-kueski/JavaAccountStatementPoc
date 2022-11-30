package com.javaaccountstatement.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaaccountstatement.poc.models.Transaction;
import com.javaaccountstatement.poc.repositories.FinanceProductRepository;
import com.javaaccountstatement.poc.repositories.TransactionRepository;

@RestController
@RequestMapping("finance_products")
public class FinanceProductController {

    @Autowired
    FinanceProductRepository financeProductRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping("/{id}/transactions")
    public List<Transaction> transactions(@PathVariable String id) throws NotFoundException {
        int financeProductId = Integer.parseInt(id);
        return transactionRepository.findByFinanceProductId(financeProductId);
    }
}