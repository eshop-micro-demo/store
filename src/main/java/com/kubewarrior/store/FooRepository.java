package com.kubewarrior.store;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

// @RepositoryRestResource(collectionResourceRel = "people", path = "people")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
// @CrossOrigin
// @CrossOrigin(allowCredentials = "true", origins = {"*"}, 
//     methods = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.OPTIONS})
public interface FooRepository extends PagingAndSortingRepository<Foo, Long> {

  List<Foo> findByName(@Param("name") String name);

}