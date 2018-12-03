package com.ojpets.services.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Mapa;

@RepositoryRestResource(collectionResourceRel = "mapa", path = "mapa")
public interface MapaRepository extends PagingAndSortingRepository<Mapa, Long> {
	
}
