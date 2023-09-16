package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.entity.Product;

@Service
public class ServiceImplementation implements Services{
	
	
	@Autowired
	Dao dao;

	@Override
	public String addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public String updateProdcut(Product prodcut) {
		
		return dao.updateProduct(prodcut);
	}

	@Override
	public String deleteProduct(String productName) {
		
		return dao.deleteProduct(productName);
	}

	@Override
	public Product getProduct(String productName) {
	
		return dao.getProduct(productName);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public List<Product> getAllProductsInBetween(int minprice, int maxprice) {
		
		return dao.getAllProductsInBetween(minprice, maxprice);
	}


}
