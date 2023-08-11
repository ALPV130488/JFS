package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ProductDaoImpt implements ProductDao {
	
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public String addProduct(Product product) {
		
		em.persist(product);//insert
		
		 return "Product is inserted successfully!!!!";
	}

	@Override
	public String updateProduct(Product product) {
		
		em.merge(product);//update
		
		return "Product Updated Successfully!!!!";
	}

	@Override
	public String deleteProduct(int productId) {
		
		Product product = em.find(Product.class,productId);
	
		em.remove(product);//delete
		
		return "Product is Deleted successfully!!!";
	}

	@Override
	public Product getProduct(int productId) {
		
	return em.find(Product.class, productId);
	}

	@Override
	public List<Product> getAllProducts() {
		
		TypedQuery<Product> query=em.createQuery("select p from Product p",Product.class);
		
		return query.getResultList();
	}

	@Override
	public List<Product> getAllProducts(int minPrice, int maxPrice) {
		TypedQuery<Product> query = em.createQuery("select p from Product p where p.productPrice betwen "
										+ "	?1 and ?2",Product.class);
		
		query.setParameter(1, minPrice);
		query.setParameter(2,maxPrice);

		return query.getResultList();
	}

	@Override
	public List<Product> getAllProductsByName(String productName) {
		TypedQuery<Product> query= em.createQuery("select p from Product p where p.productName=?1",Product.class);
		
		query .setParameter(1, productName);
		
		return query.getResultList();
	}

}
