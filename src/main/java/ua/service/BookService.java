package ua.service;

import java.util.List;

import ua.entity.Book;

public interface BookService {
	
	void save (Book book);
	void delete (int id);
	Book findOne(int id);
	List<Book> findAll();

}
