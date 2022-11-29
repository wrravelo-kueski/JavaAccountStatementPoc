package com.javaaccountstatement.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaaccountstatement.poc.models.Transaction;
import com.javaaccountstatement.poc.repositories.TransactionRepository;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping("/{id}")
    public Transaction show(@PathVariable String id) throws NotFoundException {
        int transactionId = Integer.parseInt(id);
        return transactionRepository.findById(transactionId).orElseThrow();
    }
}