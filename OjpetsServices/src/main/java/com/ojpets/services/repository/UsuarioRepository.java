package com.ojpets.services.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Usuario;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
}
