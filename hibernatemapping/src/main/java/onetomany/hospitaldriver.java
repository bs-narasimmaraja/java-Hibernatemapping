package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class hospitaldriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		hospital hospital1=new hospital();
		hospital1.setName("apollo");
		hospital1.setCeo("ravichandran");
				
		Branch branch1=new Branch();
		branch1.setManager("ram");
		branch1.setAddress("@52562jdenc");
		branch1.setPincode(46246125);
		
		
		Branch branch2=new Branch();
		branch1.setManager("ramam");
		branch1.setAddress("@5256idycb");
		branch1.setPincode(4622134);

		List<Branch> branches=new ArrayList();
		branches.add(branch2);
		branches.add(branch1);
		
		hospital1.setBranches(branches);
		
		et.begin();
		em.persist(hospital1);
		em.persist(branch1);
		em.persist(branch2);
		et.commit();
		
	}
}
