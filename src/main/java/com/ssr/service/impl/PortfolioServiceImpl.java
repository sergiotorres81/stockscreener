package com.ssr.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.aop.logging.Loggable;

import com.ssr.domain.Operation;
import com.ssr.domain.Portfolio;
import com.ssr.domain.Product;
import com.ssr.repository.PortfolioRepository;
import com.ssr.service.PortfolioService;

@Service
@Loggable
public class PortfolioServiceImpl implements PortfolioService {

	private final static Logger logger = LoggerFactory.getLogger(PortfolioServiceImpl.class);

	@Autowired
	private PortfolioRepository portfolioRepository;

	@Override
	public Set<Product> findDistinctOperationProductyByPorfolio(String portfolio) {
		// TODO: improve this ... It should be something like this:
		// portfolioRepository.findDistinctOperationProductByName(String name);
		logger.debug("PortfolioServiceImpl.findDistinctOperationProductyByPorfolio ... " + portfolio);
		Set<Product> products = new HashSet<Product>();
		List<Operation> operations = portfolioRepository.findByName(portfolio).getOperations();
		if (!CollectionUtils.isEmpty(operations)) {
			for (Operation operation : operations) {
				if (!products.contains(operation.getProduct())) {
					products.add(operation.getProduct());
				}
			}
		}
		return products;
	}

	@Override
	public Portfolio findByName(String portfolio) {
		logger.debug("PortfolioServiceImpl.findByName ... " + portfolio);
		return portfolioRepository.findByName(portfolio);
	}

}
