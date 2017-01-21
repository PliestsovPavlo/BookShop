package ua.dao;

import java.util.List;

import ua.entity.Basket;

public interface BasketDao {
	
	public void addBasket(Basket basket);
	public void updateBasket(Basket basket);
	public void deleteBasket(Basket basket);
	public Basket findBasketById(int id);
	public List<Basket> findAllBaskets();

}
