package com.ojpets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ojpets.services.model.Customer;
import com.ojpets.services.model.Mascota;
import com.ojpets.services.repository.CustomerRepository;
import com.ojpets.services.repository.MascotaRepository;

@SpringBootApplication
public class SpringRestOjpetsApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	MascotaRepository mascotaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestOjpetsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		customerRepository.save(new Customer("Jack", "Smith"));
//		customerRepository.save(new Customer("Adam", "Johnson"));
//		customerRepository.save(new Customer("Kim", "Smith"));
//		customerRepository.save(new Customer("David", "Williams"));
//		customerRepository.save(new Customer("Peter", "Davis"));
		//mascotaRepository.save(new Mascota("M", "casa", "pitbull", "pequenio"));
		//mascotaRepository.save(new Mascota("M", "pantano", "pequines", "pequenio"));
	}
}
