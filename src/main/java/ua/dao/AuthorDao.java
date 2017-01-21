package ua.dao;

import java.util.List;

import ua.entity.Author;

public interface AuthorDao {
	
	public void addAuthor(Author author);
	public void updateAuthor(Author author);
	public void deleteAuthor(Author author);
	public Author findAuthorById(int id);
	public List<Author> findAllAuthors();

}
