package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Service
public class ProductServiceImpt implements ProductService {
	
	@Autowired
	ProductDao dao;
	
	@Override
	public String addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
	
		return dao.updateProduct(product);
	}

	@Override
	public String deleteProduct(int productId) {
	
		return dao.deleteProduct(productId);
	}

	@Override
	public Product getProduct(int productId) {
		
		return dao.getProduct(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public List<Product> getAllProducts(int minPrice, int maxPrice) {
	
		return dao.getAllProducts(minPrice, maxPrice);
	}

	@Override
	public List<Product> getAllProductsByName(String productName) {
	
		return dao.getAllProductsByName(productName);
	}

}
