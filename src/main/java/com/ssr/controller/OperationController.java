package com.ssr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.domain.Operation;
import com.ssr.repository.OperationRepository;

@RestController
public class OperationController {

	@Autowired
	private OperationRepository operationRepository;

	@RequestMapping(value = "/api/operations/{id}", method = RequestMethod.GET)
	public Operation findByName(@PathVariable("id") String id) {
		return operationRepository.findOne(new Long(id));
	}
}
