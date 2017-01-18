package entities;

import javax.persistence.Entity;

@Entity
public class Category extends AbstractEntity{
	
	private String typeOfGenre;
	
	

	public Category() {
		super();
	}

	public Category(String typeOfGenre) {
		super();
		this.typeOfGenre = typeOfGenre;
	}

	public String getTypeOfGenre() {
		return typeOfGenre;
	}

	public void setTypeOfGenre(String typeOfGenre) {
		this.typeOfGenre = typeOfGenre;
	}

	@Override
	public String toString() {
		return "Genre [typeOfGenre=" + typeOfGenre + "]";
	}

	
}
