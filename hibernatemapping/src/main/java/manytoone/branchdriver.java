package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class branchdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setName("Apollo");
		hospital.setCeo("Prathap reddy");
		
		branch branch1=new branch();
		branch1.setName("Marathalli- Apollo");
		branch1.setPincode(560037);
		
		branch branch2=new branch();
		branch2.setName("Yelahanka-Apollo");
		branch2.setPincode(560090);
		branch2.setHospital(hospital);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		et.commit();
	}

}
