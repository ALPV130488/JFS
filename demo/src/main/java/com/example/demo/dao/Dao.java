package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface Dao {
	
	public abstract String addProduct(Product product);
	
	public abstract String updateProduct(Product product);
	
	public abstract String deleteProduct(String productName);
	
	public abstract Product getProduct(String productName);
	
	public abstract List<Product> getAllProducts();
	
	public abstract List<Product> getAllProductsInBetween(int minprice,int maxprice);
	
	

}
