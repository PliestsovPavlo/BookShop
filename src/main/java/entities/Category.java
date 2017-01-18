package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category extends AbstractEntity{
	
	@Column(name="typeOfCategory")
	private String typeOfCategory;
	
	

	public Category() {
		super();
	}

	public Category(String typeOfCategory) {
		super();
		this.typeOfCategory = typeOfCategory;
	}

	public String getTypeOfCategory() {
		return typeOfCategory;
	}

	public void setTypeOfCategory(String typeOfCategory) {
		this.typeOfCategory = typeOfCategory;
	}

	@Override
	public String toString() {
		return "Genre [typeOfGenre=" + typeOfCategory + "]";
	}

	
}
