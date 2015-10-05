package com.ssp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssp.domain.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
