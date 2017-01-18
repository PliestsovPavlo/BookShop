package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;
import entities.Book;
import entities.Category;
import entities.User;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setName("Ivan");
		user.setEmail("ivan@gmail.com");
		user.setPassword("superpass");
		
		Author author = new Author("Aaa", "Bbb");
		
		Category category = new Category("Drama");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setCategory(category);
		book.setDescription("Very interesting book");
		book.setName("Harry Potter");
		
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.persist(book);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
