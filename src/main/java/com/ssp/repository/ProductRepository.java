package com.ssp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssp.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	/**
	 * Finds a product using its ticker
	 * 
	 * @param string
	 *            ticker of the product
	 * @return
	 */
	Product findByTickerSymbol(String string);

}
