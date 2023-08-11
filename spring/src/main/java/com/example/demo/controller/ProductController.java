package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product") //http://localhost:9999/product

public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addproduct")//http://localhost:9999/product/addproduct
	
	public String insertProduct(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product product)//http://localhost:9999/product/updateproduct
	{
		return service.updateProduct(product);
		
	}
}
