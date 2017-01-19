package main;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import entities.User;

public class Main {

	public static void main(String[] args) {
	
//		User user = new User();
//		user.setName("psp");
//		user.setEmail("pspalfa@gmail.com");
//		user.setPassword("pass");
//		
		UserDao userDao = new UserDaoImpl();
//		userDao.addUser(user);
//		User user = userDao.findUserById(1);
//		user.setName("psp");
//		userDao.updateUser(user);
//		System.out.println(user.toString());
//		Author author = new Author();
//		author.setFirstName("J.");
//		author.setLastName("Rolling");
//		
//		AuthorDao authorDao = new AuthorDaoImpl();
//		authorDao.addAuthor(author);
//		
//		Category category = new Category();
//		category.setTypeOfCategory("Fantesy");
//		
//		CategoryDao categoryDao = new CategoryDaoImpl();
//		categoryDao.addCategory(category);
//		
//		Book book = new Book();
//		book.setAuthor(author);
//		book.setCategory(category);
//		book.setDescription("Very interesting book");
//		book.setName("Harry Potter");
//		book.setPrice(302.60);
//		
//		BookDao bookDao = new BookDaoImpl();
//		bookDao.addBook(book);
//		
//		Basket basket = new Basket();
//		basket.setBook(bookDao.findBookById(1));
//		
//		BasketDao basketDao = new BasketDaoImpl();
//		basketDao.addBasket(basket);
//		
//		System.out.println(user.toString());
//		userDao.updateUser(user);
//		User user2 = userDao.findUserById(1);
//		System.out.println(user2.toString());
		
		
		List<User>users = userDao.findAllUser();
		for (User user2 : users) {
			System.out.println(user2.toString());
			
		}
		
//		List<Book> books = bookDao.findAllBooks();
//		for (Book book2 : books) {
//			System.out.println(book2);
//		}
//		
//		List<Author> authors = authorDao.findAllAuthors();
//		for (Author author2 : authors) {
//			System.out.println(author2);
//		}
//		
//		List<Category> categories = categoryDao.findAllCategories();
//		for (Category category2 : categories) {
//			System.out.println(category2);
//		}

		
	}

}
