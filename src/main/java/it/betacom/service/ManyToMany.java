package it.betacom.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.betacom.entity.Clas;
import it.betacom.entity.Teacher;

public class ManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPAMTM");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Clas clas1 = new Clas();
		clas1.setName_clas("Prima");
		
		Clas clas2 = new Clas();
		clas2.setName_clas("Seconda");
		
		Clas clas3 = new Clas();
		clas3.setName_clas("Terza");
		
		entityManager.persist(clas1);
		entityManager.persist(clas2);
		entityManager.persist(clas3);
		
		Set <Clas> classeSet1 = new HashSet<Clas>();
		classeSet1.add(clas1);
		classeSet1.add(clas2);
		classeSet1.add(clas3);
		
		Set <Clas> classeSet2 = new HashSet<Clas>();
		classeSet2.add(clas2);
		classeSet2.add(clas3);
		
		Set <Clas> classeSet3 = new HashSet<Clas>();
		classeSet3.add(clas1);
		classeSet3.add(clas3);
		
		Teacher teacher1 = new Teacher("Francesco", "Matematica", classeSet1);
		
		Teacher teacher2 = new Teacher("Monica", "Storia", classeSet2);
		
		Teacher teacher3 = new Teacher("Monica", "Storia", classeSet3);
		
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();

	}

}
