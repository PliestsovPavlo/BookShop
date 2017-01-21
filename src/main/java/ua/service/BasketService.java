package ua.service;

import java.util.List;

import ua.entity.Basket;

public interface BasketService {
	
	void save (Basket basket);
	void delete (int id);
	Basket findOne(int id);
	List<Basket> findAll();

}
