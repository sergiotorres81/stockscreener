package com.ssr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.domain.Operation;
import com.ssr.domain.Portfolio;
import com.ssr.repository.PortfolioRepository;

@RestController
public class PortfolioController {

	@Autowired
	private PortfolioRepository portfolioRepository;

	@RequestMapping(value = "/api/portfolios/{name}", method = RequestMethod.GET)
	public Portfolio findByName(@PathVariable("name") String name) {
		return portfolioRepository.findByName(name);
	}

	@RequestMapping(value = "/api/portfolios/{name}/operations", method = RequestMethod.GET)
	public Iterable<Operation> findPortfolioOperations(@PathVariable("name") String name) {
		return portfolioRepository.findByName(name).getOperations();
	}

}
