package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="busket")
public class Busket extends AbstractEntity{
	
	@OneToMany(mappedBy="busket")
	private List<Order> orders = new ArrayList<>();

	public Busket(List<Order> orders) {
		super();
		this.orders = orders;
	}

	public Busket() {
		super();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Busket [orders=" + orders + "]";
	}
	

	
}
