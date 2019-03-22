package com.javaonboarding.microservices.productservice.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	@GetMapping("/javaonboarding/product")
	List<Product>findAllPoducts(){
	
	List<Product>  products = repository.findAll();
	//exchangeValue.setPort((Integer.parseInt(environment.getProperty("local.server.port"))));
	
	return products;
	}
	
	
	@GetMapping("/javaonboarding/product/{productId}")
	Optional<Product> findById(@PathVariable long productId) {
		
		
	Optional<Product> product = 	repository.findById(productId);
		return product;
	}
}
