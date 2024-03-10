package com.jsp.cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hospital1driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital1 hospital =new Hospital1();
		hospital.setId(1);
		hospital.setName("apollo hospital");
		hospital.setCeo("ramachandran");
		
		Branch1 branch=new Branch1();
		branch.setId(1);
		branch.setAddress("marathalli");
		branch.setManager("sekar");
		
		Branch1 branch1=new Branch1();
		branch.setId(2);
		branch.setAddress("marathalli");
		branch.setManager("sekar");
		
		List<Branch1> branches=new ArrayList<Branch1>();
		branches.add(branch);
		branches.add(branch1);
		
		hospital.setBranches(branches);
		
		et.begin();
		em.persist(hospital);
		et.commit();
	
	
	
	
	}
}
