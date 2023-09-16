package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class DaoImplementation implements Dao {

	@PersistenceContext
	EntityManager em;

	@Override
	public String addProduct(Product product) {

		em.persist(product);

		return "Product is inserted successfully";
	}

	@Override
	public String updateProduct(Product product) {

		em.merge(product);

		return "Product is updated successfully";
	}

	@Override
	public String deleteProduct(String productName) {

		Product prodcut1 = em.find(Product.class, productName);

		em.remove(prodcut1);

		return "Product is deleted successfully";
	}

	@Override
	public Product getProduct(String productName) {

		return em.find(Product.class, productName);
	}

	@Override
	public List<Product> getAllProducts() {

		TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class);

		return query.getResultList();
	}

	@Override
	public List<Product> getAllProductsInBetween(int minprice,int maxprice) {

		TypedQuery<Product> query = em.createQuery("select p from Product p where p.productPrice  between ?1 and ?2",
				Product.class);

		query.setParameter(1, minprice);
		query.setParameter(2, maxprice);

		return query.getResultList();
	}

}
