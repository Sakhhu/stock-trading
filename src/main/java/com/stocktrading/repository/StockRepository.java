package com.stocktrading.repository;
import com.stocktrading.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> { }



