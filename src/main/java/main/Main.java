package main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;
import entities.Book;
import entities.Category;
import entities.Order;
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
		category.setTypeOfCategory("Sience");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setCategory(category);
		book.setDescription("Not interesting book");
		book.setName("Math");
		
		Order order = new Order();
		book = em.find(Book.class, 1);
		order.setBook(book);
//		order.setConfirmed(false);
		
		em.persist(user);
		em.persist(category);
		em.persist(author);
		em.persist(book);
		em.persist(order);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
