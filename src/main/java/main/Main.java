package main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

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
	
	 private static Scanner sc = new Scanner(System.in);
	 private static User user = new User();
	 private static UserDao userDao = new UserDaoImpl();
	 private static Book book = new Book();
	 private static BookDao bookDao = new BookDaoImpl();
	 private static Author author = new Author();
	 private static AuthorDao authorDao = new AuthorDaoImpl();
	 private static Category category = new Category();
	 private static CategoryDao categoryDao = new CategoryDaoImpl();
	 private static Basket basket = new Basket();
	 private static BasketDao basketDao = new BasketDaoImpl();
	 
	 
	public static void main(String[] args) {
		
		boolean isRun = true;
		while(isRun){
			System.out.println("1: USER");
			System.out.println("2: BOOK");
			System.out.println("3: AUTHOR");
			System.out.println("4: BASKET");
			System.out.println("5: CATEGORY");
			System.out.println("0: EXIT");
			switch (sc.next()) {
			case "1":
				System.out.println("1: Add user");
				System.out.println("2: Update user");
				System.out.println("3: Delete user");
				System.out.println("4: Find user by ID");
				System.out.println("5: Find all users");
				switch (sc.next()) {
				case "1":
					
					System.out.println("Enter name");
					user.setName(sc.next());
					System.out.println("Enter email");
					user.setEmail(sc.next());
					System.out.println("Enter password");
					user.setPassword(sc.next());
					
					userDao.addUser(user);
					
					break;
				case "2":
					System.out.println("Enter user id to update");
					user = userDao.findUserById(sc.nextInt());
					System.out.println("Enter what you want to update");
					System.out.println("1: name");
					System.out.println("2: email");
					System.out.println("3: password");
					switch (sc.next()) {
					case "1":
						System.out.println("Enter new name");
						user.setName(sc.next());
						userDao.updateUser(user);
						break;
					case "2":
						System.out.println("Enter new email");
						user.setEmail(sc.next());
						userDao.updateUser(user);
						break;
					case "3":
						System.out.println("Enter new password");
						user.setPassword(sc.next());
						break;
					}
				break;
				case "3":
					System.out.println("Enter user id to delete");
					user = userDao.findUserById(sc.nextInt());
					userDao.deleteUser(user);
					break;
				case "4":
					System.out.println("Enter user id to find");
					user = userDao.findUserById(sc.nextInt());
					System.out.println(user.toString());
					break;
				case "5":
					List<User> users = userDao.findAllUser();
					for (User user : users) {
						System.out.println(user.toString());
					}break;
				
			}break;
				
			case "2":
				System.out.println("1: Add book");
				System.out.println("2: Update book");
				System.out.println("3: Delete book");
				System.out.println("4: Find book by ID");
				System.out.println("5: Find all books");
				switch (sc.next()) {
				case "1":
					System.out.println("Enter book name");
					book.setName(sc.next());
					System.out.println("Enter book price");
					book.setPrice(sc.nextDouble());
					System.out.println("Enter author id");
					author = authorDao.findAuthorById(sc.nextInt());
					book.setAuthor(author);
					System.out.println("Enter book category id");
					category = categoryDao.findCategoryById(sc.nextInt());
					book.setCategory(category);
					System.out.println("Enter book description");
					book.setDescription(sc.next());
					bookDao.addBook(book);
					break;
				case "2":
					System.out.println("Enter book id to update");
					book = bookDao.findBookById(sc.nextInt());
					System.out.println("Choose what to update");
					System.out.println("1: name");
					System.out.println("2: description");
					System.out.println("3: price");
					System.out.println("4: author(need to enter id)");
					System.out.println("5: category (need to enter id)");
					switch (sc.next()) {
					case "1":
						System.out.println("Enter new name");
						book.setName(sc.next());
						bookDao.updateBook(book);
						break;
					case "2":
						System.out.println("Enter new description");
						book.setDescription(sc.next());
						bookDao.updateBook(book);
						break;
					case "3":
						System.out.println("Enter new price");
						book.setPrice(sc.nextDouble());
						bookDao.updateBook(book);
						break;
					case "4":
						System.out.println("Enter new author id");
						author = authorDao.findAuthorById(sc.nextInt());
						book.setAuthor(author);
						bookDao.updateBook(book);
						break;
					case "5":
						System.out.println("Enter new category id");
						category = categoryDao.findCategoryById(sc.nextInt());
						book.setCategory(category);
						bookDao.updateBook(book);
						break;
						}
				case "3":
					System.out.println("Enter book id to delete");
					book = bookDao.findBookById(sc.nextInt());
					bookDao.deleteBook(book);
					break;
				case "4":	
					System.out.println("Enter bookm id to find");
					book = bookDao.findBookById(sc.nextInt());
					System.out.println(book.toString());
					break;
				case "5":
					List<Book> books = bookDao.findAllBooks();
					for (Book book : books) {
						System.out.println(book.toString());
					}
					break;
				
				}break;
			case "3":
				System.out.println("1: add");
				System.out.println("2: update");
				System.out.println("3: delete");
				System.out.println("4: find by id");
				System.out.println("5: find all");
				switch (sc.next()) {
				case "1":
					System.out.println("Enter first name");
					author.setFirstName(sc.next());
					System.out.println("Enter last name");
					author.setLastName(sc.next());
					authorDao.addAuthor(author);
					break;
				case "2":
					System.out.println("Enter id author to update");
					author = authorDao.findAuthorById(sc.nextInt());
					System.out.println("Enter what to update");
					System.out.println("1: first name");
					System.out.println("2: last name");
					switch (sc.next()) {
					case "1":
						System.out.println("Enter new first name");
						author.setFirstName(sc.next());
						authorDao.updateAuthor(author);
						break;
					case "2":
						System.out.println("Enter new last name");
						author.setLastName(sc.next());
						authorDao.updateAuthor(author);
						break;
					}break;
				case "3":
					System.out.println("Enter id author to delete");
					author = authorDao.findAuthorById(sc.nextInt());
					authorDao.deleteAuthor(author);
					break;
				case "4":
					System.out.println("Enter author id to find");
					author = authorDao.findAuthorById(sc.nextInt());
					System.out.println(author.toString());
					break;
				case "5":
					List<Author> authors = authorDao.findAllAuthors();
					for (Author author : authors) {
						System.out.println(author.toString());
					}
					break;
				}break;
			case "4":
				System.out.println("1: add");
				System.out.println("2: confirm");
				System.out.println("3: delete");
				System.out.println("4: find by id");
				System.out.println("5: find all");
				switch (sc.next()) {
				case "1":
					System.out.println("Enter user id");
					user = userDao.findUserById(sc.nextInt());
					basket.setUser(user);
					System.out.println("Enter id book");
					book = bookDao.findBookById(sc.nextInt());
					basket.setBook(book);
					basketDao.addBasket(basket);
					break;
				case "2":
					System.out.println("Enter basket id to confirm");
					basket = basketDao.findBasketById(sc.nextInt());
					basket.setConfirmed(true);
					basketDao.updateBasket(basket);
					break;
				case "3":
					System.out.println("all baskets of user by id");
					user = userDao.findUserById(sc.nextInt());
					List<Basket>baskets = userDao.findBasketsByUserId(user);
					for (Basket basket : baskets) {
						System.out.println(basket.toString());
					}

					break;
				}
				
				
				
			break;
			default:isRun=false;
				
			}
		}
		
	}

}
