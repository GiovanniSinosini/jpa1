package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(null, "João Silva", "joao@gmail.com");
		Person p2 = new Person(null, "Maria Silva", "maria@gmail.com");
		Person p3 = new Person(null, "Manuel Santos", "manel@gmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");
		EntityManager em = emf.createEntityManager(); // creates connection to the database

		em.getTransaction().begin();  // start database transaction
		em.persist(p1);  // send to the database
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();  // finalize and confirm transaction
		System.out.println("Done!");
		
		
		
	}
}
