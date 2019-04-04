package com.javaonboarding.microservices.reviewservice;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Review {
	
	@Id
	@Column(name="review_id")
	private long reviewId;
	@Column(name="review_description")
	private String descrption;
	@Column(name="min_range")
	private int minRange;
	
	@Column(name="max_range")
	private int maxRange;
	
	@Column(name="product_id")
	private long productId;
	
	
	@OneToMany(mappedBy = "productId", cascade = CascadeType.ALL)
	List<Review> reviews ;
	
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public Review(long reviewId, String descrption, int minRange, int maxRange, long productId) {
		super();
		this.reviewId = reviewId;
		this.descrption = descrption;
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.productId = productId;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public int getMinRange() {
		return minRange;
	}
	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}
	public int getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
}
