package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class countrydriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		country c1=new country();
		c1.setId(1);
		c1.setName("india");
		c1.setPopulation("145crore");
		
		primeminister minister=new primeminister();
		minister.setId(1);
		minister.setName("narendramodi");
		minister.setAge(70);
		
		c1.setPm(minister);
		
		et.begin();
		em.persist(minister);
		em.persist(c1);
		et.commit();
	}
}
