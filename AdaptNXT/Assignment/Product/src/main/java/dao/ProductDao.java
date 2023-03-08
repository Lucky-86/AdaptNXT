package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}
	
	
	
}
