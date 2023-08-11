package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_info")
public class Product {

	@Id
	private String productName;

	private int productId;

	private int productPrice;

	private int productQuantity;

	private String productDesc;

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

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Product(String productName, int productId, int productPrice, int productQuantity, String productDesc) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productDesc = productDesc;
	}

}
