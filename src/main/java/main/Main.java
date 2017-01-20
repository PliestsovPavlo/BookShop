package main;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import dao.BasketDao;
import dao.BasketDaoImpl;
import dao.BookDao;
import dao.BookDaoImpl;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import entities.Author;
import entities.Basket;
import entities.Book;
import entities.Category;
import entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.findUserById(1);
		Basket basket = new Basket();
		basket.setUser(user);
		BookDao bookDao = new BookDaoImpl();
//		CategoryDao categoryDao = new CategoryDaoImpl();
//		Category category = categoryDao.findCategoryById(1);
//		AuthorDao authorDao = new AuthorDaoImpl();
//		Author author = authorDao.findAuthorById(1);
//		Book book = new Book("ABC", 20.9, "aaa", author, category);
//		bookDao.addBook(book);
		Book book = bookDao.findBookById(2);
		basket.setBook(book);
		BasketDao basketDao = new BasketDaoImpl();
		basketDao.addBasket(basket);
	
//		User user = new User();
//		user.setName("psp");
//		user.setEmail("admin@gmail.com");
//		user.setPassword("pass");
//		
//		UserDao userDao = new UserDaoImpl();
//		userDao.addUser(user);
//		 user = userDao.findUserById(1);
//		user.setName("psp");
//		System.out.println(user.toString());
//		
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
//		book.setAuthor(authorDao.findAuthorById(1));
//		book.setCategory(categoryDao.findCategoryById(1));
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
//				
//		List<User>users = userDao.findAllUser();
//		for (User user2 : users) {
//			System.out.println(user2.toString());
//			
//		}
//		
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
