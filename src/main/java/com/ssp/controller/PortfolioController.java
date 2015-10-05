package com.ssp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssp.domain.Portfolio;
import com.ssp.repository.PortfolioRepository;

@RestController
public class PortfolioController {

	@Autowired
	private PortfolioRepository portfolioRepository;

	@RequestMapping(value = "/portfolios/{name}/operations", method = RequestMethod.GET)
	public Portfolio findByName(@PathVariable("name") String name) {
		return portfolioRepository.findByName(name);
	}


}
