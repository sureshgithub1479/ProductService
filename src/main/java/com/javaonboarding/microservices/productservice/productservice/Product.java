package com.javaonboarding.microservices.productservice.productservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productCategory, String productDescription,
			Date productCreationdate, double productPrice) {
		super();
		this.productId = productId;
		ProductName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productCreationdate = productCreationdate;
		this.productPrice = productPrice;
	}
	
	
	@Id
	@Column(name="product_id")
	private long productId;
	
	@Column(name="product_Name")
	private String ProductName;
	
	@Column(name="product_Category")
	private String productCategory;
	
	@Column(name="product_Description")
	private String productDescription;
	
	@Column(name="product_Creationdate")
	private Date productCreationdate;
	
	@Column(name="product_Price")
	private double productPrice;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getProductCreationdate() {
		return productCreationdate;
	}
	public void setProductCreationdate(Date productCreationdate) {
		this.productCreationdate = productCreationdate;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	@Column(name="port")
	private long port;

}
