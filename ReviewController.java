package com.javaonboarding.microservices.reviewservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
	
	
	@GetMapping("/javaonboarding/{productId}")
	List<Review>   getReviews(@PathVariable long productId)
	{
		
		
		return null;
		
	}

}
