package com.stocktrading.repository;

import com.stocktrading.model.Portfolio;
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
	    List<Portfolio> findByUserId(Long userId);
	}


