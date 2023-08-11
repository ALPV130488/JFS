package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public abstract String addProduct(Product product);

	public abstract String updateProduct(Product product);

	public abstract String deleteProduct(int productId);

	public abstract Product getProduct(int productId);

	public abstract List<Product> getAllProducts();

	public abstract List<Product> getAllProducts(int minPrice, int maxPrice);

	public abstract List<Product> getAllProductsByName(String productName);

}
