package com.ojpets.services.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Perfil;

@RepositoryRestResource(collectionResourceRel = "perfil", path = "perfil")
public interface PerfilRepository extends PagingAndSortingRepository<Perfil, Long> {
}
