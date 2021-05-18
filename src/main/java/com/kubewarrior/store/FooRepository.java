package com.kubewarrior.store;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface FooRepository extends PagingAndSortingRepository<Foo, Long> {

  List<Foo> findByName(@Param("name") String name);

}