package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class compantdriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		company company1=new company();
		company1.setName("Google");
		company1.setCEO("Sundarpichai");
		
		employee employee1=new employee();
		employee1.setName("shubam");
		employee1.setRole("developer");
		employee1.setYearofexperience(2);
		
		employee employee2=new employee();
		employee2.setName("rajesh");
		employee2.setRole("tester");
		employee2.setYearofexperience(2);
		
		List<employee>employees =new ArrayList<employee>();
		employees.add(employee1);
		employees.add(employee2);
		
		company1.setEmployees(employees);
		
		et.begin();
		em.persist(company1);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();
		
	}

}
