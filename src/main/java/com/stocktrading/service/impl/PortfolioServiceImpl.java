package com.stocktrading.service.impl;
import com.stocktrading.model.Portfolio;
import com.stocktrading.repository.PortfolioRepository;
import com.stocktrading.service.PortfolioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService{
	 private final PortfolioRepository portfolioRepository;

	    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
	        this.portfolioRepository = portfolioRepository;
	    }

	    @Override
	    public Portfolio addPortfolio(Portfolio portfolio) {
	        return portfolioRepository.save(portfolio);
	    }

	    @Override
	    public List<Portfolio> getUserPortfolio(Long userId) {
	        return portfolioRepository.findAll(); // Later we add query by userId
	    }
}
