package com.kubewarrior.store.repository;

import com.kubewarrior.store.domain.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {}