package com.ssr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.domain.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

	/**
	 * Returns a portfolio based on its name
	 * 
	 * @param string
	 *            portfolio name
	 * @return
	 */
	Portfolio findByName(String string);

}
