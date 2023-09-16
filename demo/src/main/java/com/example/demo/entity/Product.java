package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	
	
	private int productId;
	@Id
	private String productName;
	
	private int productPrice;
	
	private int productQuant;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuant=" + productQuant + "]";
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}



	public int getProductQuant() {
		return productQuant;
	}



	public void setProductQuant(int productQuant) {
		this.productQuant = productQuant;
	}



	public Product(int productId, String productName, int productPrice, int productQuant) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuant = productQuant;
	}
	
	

}
