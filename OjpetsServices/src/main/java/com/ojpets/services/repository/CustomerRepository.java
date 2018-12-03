package com.ojpets.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ojpets.services.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customeraws", path = "customeraws")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
	List<Customer> findByLastName(@Param("name") String name);
	
	@Query("select e from Customer e "
	          + "where e.lastName like %:field1%")
	    List<Customer> advancedSearch(@Param("field1") String field1);
}
	