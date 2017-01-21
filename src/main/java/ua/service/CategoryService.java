package ua.service;

import java.util.List;

import ua.entity.Category;

public interface CategoryService {
	
	void save (Category category);
	void delete (int id);
	Category findOne(int id);
	List<Category> findAll();

}
