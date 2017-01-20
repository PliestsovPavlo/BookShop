package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="basket")
public class Basket extends AbstractEntity{
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_user")
	private User user;
	
	@Column(columnDefinition="TINYINT(1)")
	private boolean confirmed = false;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_book")
	private Book book;

	public Basket() {
	}

	public Basket(boolean confirmed, Book book) {
		super();
		this.confirmed = confirmed;
		this.book = book;
	}

	

	public Boolean getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Basket [user=" + user + ", confirmed=" + confirmed + "]";
	}

	
	

}
