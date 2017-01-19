package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;
import entities.Book;
import entities.Category;
import entities.Basket;
import entities.User;

public class Main {

	public static void main(String[] args) {

		
		
		
			
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		User user = new User();
		user.setName("Ivan");
		user.setEmail("ivan@gmail.com");
		user.setPassword("superpass");
		
		
		
		
		Author author = new Author();
		author.setFirstName("Halileu");
		author.setLastName("Accient");
		
		Category category = new Category();
		category.setTypeOfCategory("Advanture");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setCategory(category);
		book.setDescription("Very interesting book");
		book.setName("Harry Potter");
		
		Basket basket = new Basket();
		basket.setId(3);
		basket.setBook(book);
		
		
//		em.persist(user);
		em.persist(category);
		em.persist(author);
		em.persist(book);
		em.persist(basket);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
