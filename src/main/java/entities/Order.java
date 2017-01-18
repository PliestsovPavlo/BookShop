package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

public class Order extends AbstractEntity{
	
	@OneToMany(mappedBy="order")
	private List<Book> books = new ArrayList<>();

	public Order() {
		super();
	}

	public Order(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Order [books=" + books + "]";
	}
	
	

}
