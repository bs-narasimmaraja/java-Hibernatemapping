package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class companydriver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	company1 company=new company1();
	company.setCeo("sundarpicahi");
	company.setName("google");
	
	Employee1 employee=new Employee1();
	employee.setName("rajesh");
	employee.setrole("developer");
	
	Employee1 employee1=new Employee1();
	employee1.setName("jithesh");
	employee1.setrole("tester");
	
	List<Employee1> employees=new ArrayList();
	employees.add(employee);
	employees.add(employee1);
	
	company.setEmployess(employees);
	
	et.begin();
	em.persist(company);
	em.persist(employee);
	em.persist(employee1);
	et.commit();
	
	
	
	
}
}
