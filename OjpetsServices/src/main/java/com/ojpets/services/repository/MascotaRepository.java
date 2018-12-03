package com.ojpets.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Mascota;

@RepositoryRestResource(collectionResourceRel = "mascota", path = "mascota")
public interface MascotaRepository extends PagingAndSortingRepository<Mascota, Long> {
	List<Mascota> findByRaza(@Param("raza") String name);
	
	@Query("select e from Mascota e "
	          + "where UPPER(e.raza) like %:raza%")
	    List<Mascota> advancedSearch(@Param("raza") String raza);
}
