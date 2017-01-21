package ua.service;

import java.util.List;

import ua.entity.Author;

public interface AuthorService {
	
	void save (Author author);
	void delete (int id);
	Author findOne(int id);
	List<Author> findAll();

}
