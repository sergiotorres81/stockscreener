package com.ssr.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.domain.Operation;
import com.ssr.domain.Portfolio;
import com.ssr.domain.Product;
import com.ssr.service.PortfolioService;

@RestController
public class PortfolioController {


	@Autowired
	private PortfolioService portfolioService;

	@RequestMapping(value = "/api/portfolios/{name}", method = RequestMethod.GET)
	public Portfolio findByName(@PathVariable("name") String name) {
		return portfolioService.findByName(name);
	}

	@RequestMapping(value = "/api/portfolios/{name}/operations", method = RequestMethod.GET)
	public Iterable<Operation> findPortfolioOperations(@PathVariable("name") String name) {
		return portfolioService.findByName(name).getOperations();
	}

	@RequestMapping(value = "/api/portfolios/{portfolio}/products", method = RequestMethod.GET)
	public Set<Product> findPortfolioProducts(@PathVariable("portfolio") String portfolio) {
		return portfolioService.findDistinctOperationProductyByPorfolio(portfolio);
	}

}
