package com.ssr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.domain.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
