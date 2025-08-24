package com.stocktrading.service;
import com.stocktrading.model.Portfolio;
import java.util.List;

public interface PortfolioService {
	Portfolio addPortfolio(Portfolio portfolio);
    List<Portfolio> getUserPortfolio(Long userId);
}
