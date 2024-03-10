package manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class collegedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		college college1=new college();
		college1.setName("mountzion college of engineering");
		college1.setPricipalname("Balamurugan");
		
		student student1=new student();
		student1.setName("Narasimmaraja");
		student1.setDegree("B.E");
		student1.setStream("Mecahnical");
		student1.setCollege1(college1);
		
		student student2=new student();
		student2.setName("surya");
		student2.setDegree("B.E");
		student2.setStream("Mecahnical");
		student2.setCollege1(college1);
		
		List<student>students=new ArrayList<student>();
		students.add(student1);
		students.add(student2);
		
		college1.setStudents(students);
		
		et.begin();
		em.persist(college1);
		em.persist(student1);
		em.persist(student2);
		et.commit();
		
		
		
		
		
		
	}

}
