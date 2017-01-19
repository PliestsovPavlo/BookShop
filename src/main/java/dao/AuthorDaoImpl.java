package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;

public class AuthorDaoImpl implements AuthorDao{

	@Override
	public void addAuthor(Author author) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public void updateAuthor(Author author) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(author);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public void deleteAuthor(Author author) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(author);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public Author findAuthorById(int id) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Author author = em.find(Author.class, id);
		em.getTransaction().commit();
		em.close();
		factory.close();
		return author;
	}

	@Override
	public List<Author> findAllAuthors() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Author> authors = em.createQuery("from Author").getResultList();
		em.getTransaction().commit();
		em.close();
		factory.close();
		return authors;
	}

}
