package ua.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ua.entity.Book;

public class BookDaoImpl implements BookDao{

	@Override
	public void addBook(Book book) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

	@Override
	public void updateBook(Book book) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(book);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

	@Override
	public void deleteBook(Book book) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Book b where b.id=:id").setParameter("id", book.getId());
		query.executeUpdate();
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public Book findBookById(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
			Book book = em.find(Book.class, id);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		return book;
	}

	@Override
	public List<Book> findAllBooks() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Book> books = em.createQuery("from Book").getResultList();
		em.getTransaction().commit();
		em.close();
		factory.close();
		return books;
	}

}
