package com.ssr.service;

import java.util.Set;

import com.ssr.domain.Portfolio;
import com.ssr.domain.Product;

public interface PortfolioService {

	/**
	 * Returns a portfolio based on its name
	 * 
	 * @param string
	 *            portfolio name
	 * @return
	 */
	Portfolio findByName(String portfolio);

	/**
	 * Returns the list of distincts products that are included in a porfolio
	 * 
	 * @param portfolio
	 *            The portfolio name
	 * @return
	 */
	Set<Product> findDistinctOperationProductyByPorfolio(String portfolio);

}
