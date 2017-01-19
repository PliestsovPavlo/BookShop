package dao;

import java.util.List;

import entities.Book;

public interface BookDao {
	
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Book book);
	public Book findBookById(int id);
	public List<Book> findAllBooks();
	

}
