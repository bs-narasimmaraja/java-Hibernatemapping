package com.jsp.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class persondriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		person person1 =new person();
		person1.setId(1);
		person1.setName("rajesh");
		
		Pan pan=new Pan();
		pan.setId(1);
		pan.setAddress("banglore");
		pan.setPannumber("abc123");
		person1.setPan(pan);
		
		et.begin();
		em.persist(person1);
		et.commit();
		
		
	}

}
