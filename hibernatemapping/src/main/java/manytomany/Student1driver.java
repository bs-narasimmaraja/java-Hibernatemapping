package manytomany;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Student1driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student1 student1=new Student1();
		
		student1.setId(1);
		student1.setName("harish");
		student1.setAge(22);
		student1.setYop(2023);
		
		Student1 student2=new Student1();
		student2.setId(2);
		student2.setName("kamalesh");
		student2.setAge(23);
		student2.setYop(2022);
		
		Course1 course1=new Course1();
		course1.setId(1);
		course1.setName("java ");
		course1.setDuration("3-months");
		
		Course1 course2=new Course1();
		course2.setId(2);
		course2.setName("python ");
		course2.setDuration("3-months");
		
		List<Student1> students=new ArrayList<Student1>();
		students.add(student1);
		students.add(student2);
		
		List<Course1> courses=new ArrayList<Course1>();
		courses.add(course1);
		courses.add(course2);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		
		course1.setStudents(students);
		course2.setStudents(students);
		
		et.begin();
		em.persist(course1);
		em.persist(course2);
		em.persist(student1);
		em.persist(course2);
		et.commit();
		

		
		
	}
}
