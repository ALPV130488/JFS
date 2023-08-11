package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {//POJO
	
	@Id
	private String productName;
	
	private int productId;
	
	private int productPrice;
	
	private String productDesc;
	
	private int productQuantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product(String productName, int productId, int productPrice, String productDesc, int productQuantity) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.productQuantity = productQuantity;
	}
	
	
	
}
