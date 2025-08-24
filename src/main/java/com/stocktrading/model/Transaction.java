package com.stocktrading.model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long stockId;
    private String type; // BUY or SELL
    private int quantity;
    private double price;
    private LocalDateTime timestamp;

    // getters & setters
}


