package com.stocktrading.service;

import com.stocktrading.model.Stock;
import java.util.List;

public interface StockService {
	 Stock addStock(Stock stock);
	    List<Stock> getAllStocks();
}
