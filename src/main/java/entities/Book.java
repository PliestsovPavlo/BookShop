package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book extends AbstractEntity{
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_author")
	private Author author;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_category")
	private Category category;
	
	
	public Book() {

	}

	public Book(String name, Double price, String description, Author author, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.author = author;
		this.category = category;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", description=" + description + ", author=" + author
				+ ", category=" + category + "]";
	} 
	
	

}
