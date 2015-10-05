package com.ssp.initializator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssp.domain.Operation;
import com.ssp.domain.Portfolio;
import com.ssp.domain.Product;
import com.ssp.repository.OperationRepository;
import com.ssp.repository.PortfolioRepository;
import com.ssp.repository.ProductRepository;

@Component
public class DataInitializator {

	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Autowired
	private OperationRepository operationRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void init() {
		initPortfolio();
		initProducts();
		initOperations();

	}

	private void initProducts() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("ENA", "Enagas"));
		productList.add(new Product("SAN", "Banco Santander"));
		productList.add(new Product("MAP", "Mapfre"));
		productRepository.save(productList);
	}

	private void initPortfolio() {
		Portfolio portfolio = new Portfolio("RV_Spain");
		portfolioRepository.save(portfolio);
	}

	private void initOperations() {
		List<Operation> operationList = new ArrayList<Operation>();
		operationList.add(new Operation(new Date(), productRepository.findByTickerSymbol("ENA"), 21.05, 71L, 6.95,
				"EURO", "BUY", portfolioRepository.findByName("RV_Spain")));
		operationList.add(new Operation(new Date(), productRepository.findByTickerSymbol("SAN"), 6.0, 230L, 6.95,
				"EURO", "BUY", portfolioRepository.findByName("RV_Spain")));
		operationRepository.save(operationList);

	}

}
