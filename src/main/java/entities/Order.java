package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="order")
public class Order extends AbstractEntity{
	
	@Column(columnDefinition="TINYINT(1)")
	private boolean confirmed = false;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_book")
	private Book book;

	public Order() {
	}

	public Order(boolean confirmed, Book book) {
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

	@Override
	public String toString() {
		return "Order [confirmed=" + confirmed + ", book=" + book + "]";
	}

	
	

}
