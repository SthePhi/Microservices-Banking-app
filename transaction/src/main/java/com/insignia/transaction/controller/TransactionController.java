package com.insignia.transaction.controller;

import com.insignia.transaction.model.TransactionModel;
import com.insignia.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TransactionController
{
    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/getAllTransactions")
    public Iterable<TransactionModel> getTransaction()
    {
        return transactionRepository.findAll();
    }

    @GetMapping("/getOneTransaction/{transactionID}")
    public Optional<TransactionModel> getTransaction(@PathVariable Long transactionID)
    {
        return transactionRepository.findById(transactionID);
    }

    @PostMapping("/postTransaction")
    public void createTransaction(@RequestBody TransactionModel transaction)
    {
        transactionRepository.save(transaction);
    }
}
