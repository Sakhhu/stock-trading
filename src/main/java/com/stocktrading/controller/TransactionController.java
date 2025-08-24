package com.stocktrading.controller;
import com.stocktrading.model.Transaction;
import com.stocktrading.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
	private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction makeTransaction(@RequestBody Transaction transaction) {
        return transactionService.makeTransaction(transaction);
    }

    @GetMapping("/{userId}")
    public List<Transaction> getTransactionsByUser(@PathVariable Long userId) {
        return transactionService.getTransactionsByUser(userId);
    }
}
