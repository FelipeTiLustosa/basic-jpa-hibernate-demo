package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	
		/*Pessoa p1 = new Pessoa(null,"Carlos","Carlos@gamil.com");
		Pessoa p2 = new Pessoa(null,"Luiz","Luiz@gamil.com");
		Pessoa p3= new Pessoa(null,"Breno","Breno@gamil.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 1);
		System.out.println(p);
		
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}

}
