package com.ssp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssp.domain.Product;
import com.ssp.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/findAll")
	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
