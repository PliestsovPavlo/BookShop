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
		
		
//		Order order = new Order();
		
//		Book book = em.find(Book.class, 1);
//		List<Book>books= new ArrayList<>();
//		books.add(book);
//		order.setBooks(books);
		
		
		Author author = new Author();
		author.setFirstName("J.");
		author.setLastName("Rolling");
		
		Category category = new Category();
		category.setTypeOfCategory("Advanture");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setCategory(category);
		book.setDescription("Very interesting book");
		book.setName("Harry Potter");
		
		
		
		em.persist(user);
		em.persist(category);
		em.persist(author);
		em.persist(book);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
