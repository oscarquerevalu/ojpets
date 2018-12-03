package com.ojpets.services.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Ubigeo;

@RepositoryRestResource(collectionResourceRel = "ubigeo", path = "ubigeo")
public interface UbigeoRepository extends PagingAndSortingRepository<Ubigeo, Long> {
}
