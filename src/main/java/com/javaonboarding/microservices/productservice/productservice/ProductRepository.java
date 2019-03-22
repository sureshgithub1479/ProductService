package com.javaonboarding.microservices.productservice.productservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
				
	List<Product>findAll();
}
