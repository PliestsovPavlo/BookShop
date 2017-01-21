package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends AbstractEntity{

	private String name;
	
	@Column(name="email", unique=true)
	private String email;
	private String password;
	
	@OneToMany(mappedBy="user")
	private List<Basket> basket = new ArrayList<>();
	
	public User(String name, String email, String password, List<Basket> baskets) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.basket = baskets;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		
	
	public List<Basket> getBaskets() {
		return basket;
	}

	public void setBaskets(List<Basket> baskets) {
		this.basket = baskets;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	
	

}
