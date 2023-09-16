package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DaoImplementation;
import com.example.demo.entity.Product;
import com.example.demo.service.Services;

@RestController
@RequestMapping("/product")//http:10.0.20.41:1010/product
public class Controller {
	
	@Autowired
	Services service;
	
	
	
	@PostMapping("/addproduct")//http//localhost:1010/product/addproduct
	public String addProduct(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	@PutMapping("/updateproduct")//http//localhost:1010/product/updateproduct
	public String updateProduct(@RequestBody Product product)
	{
		return service.updateProdcut(product);
	}
	
	@DeleteMapping("/deleteproduct/{pname}")
	public String deleteProduct(@PathVariable("pname") String productName)
	{
		return service.deleteProduct(productName);
	}
	
	@GetMapping("/getprodcut/{pname}")
	public Product getProduct(@PathVariable("pname") String productName)
	{
		return service.getProduct(productName);
	}
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts(){
		
		return service.getAllProducts();
	}
	
	@GetMapping("/getproinbetween/{min}/{max}")
	public List<Product> getAllProductsInBetween(@PathVariable("min") int minprice,@PathVariable("max") int maxprice){
		
		return service.getAllProductsInBetween(minprice, maxprice);
	}
	
	
}
