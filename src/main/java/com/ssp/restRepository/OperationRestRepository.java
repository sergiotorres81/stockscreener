package com.ssp.restRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ssp.domain.Operation;

@RepositoryRestResource(collectionResourceRel = "operation", path = "operations")
public interface OperationRestRepository extends CrudRepository<Operation, Long> {

}
