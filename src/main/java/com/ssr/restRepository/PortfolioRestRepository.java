package com.ssr.restRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ssr.domain.Portfolio;

@RepositoryRestResource(collectionResourceRel = "portfolio", path = "portfolios")
public interface PortfolioRestRepository extends CrudRepository<Portfolio, Long> {

}
