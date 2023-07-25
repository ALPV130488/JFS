package jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager entityManager = factory.createEntityManager();//persist()-->insert,merge()--->update,remove(),find(),createQuery()
		
		entityManager.getTransaction().begin();//start the query
		
		Employee1 emp1 = new Employee1(130488, "lakshmi",124343434, "hyderabad");
		
		entityManager.persist(emp1);//ORM//
		
		entityManager.getTransaction().commit();
		
	}

}