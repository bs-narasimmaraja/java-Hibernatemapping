package hibernatemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class countrydriver {
 public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	country country1=new country();
	country1.setId(1);
	country1.setName("india");
	country1.setPopulation("150 cr");
	
	Primeminister minister1=new Primeminister();
	minister1.setAge(0);
	
	country country2=new country();
	country2.setId(2);
	country2.setName("USA");
	country2.setPopulation("50 cr");
	
	et.begin();
	em.persist(args);
	
}
}
