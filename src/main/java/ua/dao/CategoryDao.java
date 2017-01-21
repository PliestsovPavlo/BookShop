package ua.dao;

import java.util.List;

import ua.entity.Category;

public interface CategoryDao {
	
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public void deleteCategory(Category category);
	public Category findCategoryById(int id);
	public List<Category> findAllCategories();

}
