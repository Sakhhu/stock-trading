package com.stocktrading.service.impl;
import com.stocktrading.model.Stock;
import com.stocktrading.repository.StockRepository;
import com.stocktrading.service.StockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
	 private final StockRepository stockRepository;

	    public StockServiceImpl(StockRepository stockRepository) {
	        this.stockRepository = stockRepository;
	    }

	    @Override
	    public Stock addStock(Stock stock) {
	        return stockRepository.save(stock);
	    }

	    @Override
	    public List<Stock> getAllStocks() {
	        return stockRepository.findAll();
	    }
}
