package com.kubewarrior.store.repository;

import com.kubewarrior.store.domain.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
public interface ProductRepository extends CrudRepository<Product, Long> {}