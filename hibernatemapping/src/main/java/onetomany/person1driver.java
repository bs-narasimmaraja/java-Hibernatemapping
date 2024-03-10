package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class person1driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		person1 p1=new person1();
		p1.setId(1);
		p1.setName("kamalesh");
		p1.setAge(22);
		
		Aadhar a1=new Aadhar();
		a1.setId(1);
		a1.setAadharnumber(1233455);
		a1.setAddress("@dhbhk");
		p1.setAadhar(a1);
		
		et.begin();
		em.persist(a1);
		em.persist(p1);
		et.commit();

		
		
	}
}
