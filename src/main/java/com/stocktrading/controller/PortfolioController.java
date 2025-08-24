package com.stocktrading.controller;
import com.stocktrading.model.Portfolio;
import com.stocktrading.service.PortfolioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {
	 private final PortfolioService portfolioService;

	    public PortfolioController(PortfolioService portfolioService) {
	        this.portfolioService = portfolioService;
	    }

	    @PostMapping
	    public Portfolio addPortfolio(@RequestBody Portfolio portfolio) {
	        return portfolioService.addPortfolio(portfolio);
	    }

	    @GetMapping("/{userId}")
	    public List<Portfolio> getUserPortfolio(@PathVariable Long userId) {
	        return portfolioService.getUserPortfolio(userId);
	    }
	}

