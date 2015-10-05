package com.ssp.restRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ssp.domain.Product;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRestRepository extends CrudRepository<Product, Long> {

}
