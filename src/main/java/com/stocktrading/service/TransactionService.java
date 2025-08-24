package com.stocktrading.service;

import com.stocktrading.model.Transaction;
import java.util.List;
public interface TransactionService {
	Transaction makeTransaction(Transaction transaction);
    List<Transaction> getTransactionsByUser(Long userId);
}
