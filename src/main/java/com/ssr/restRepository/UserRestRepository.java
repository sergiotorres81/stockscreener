package com.ssr.restRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ssr.domain.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRestRepository extends CrudRepository<User, Long> {

}
