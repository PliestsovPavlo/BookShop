package main;

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
		
		Book book = new Book();
		book.setAuthor(new Author("Aaa", "Bbb"));
		book.setCategory(new Category(""));
		
	}

}
