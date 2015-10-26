package com.ssr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.domain.Portfolio;
import com.ssr.domain.Product;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

	/**
	 * Returns a portfolio based on its name
	 * 
	 * @param string
	 *            portfolio name
	 * @return
	 */
	Portfolio findByName(String string);

	/**
	 * Returns the products inside a protfolio
	 * 
	 * @param name
	 *            Portfolio name
	 * @return
	 */
	List<Product> findDistinctOperationProductByName(String name);

}
