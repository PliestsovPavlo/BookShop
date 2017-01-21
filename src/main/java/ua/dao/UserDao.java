package ua.dao;

import java.util.List;

import ua.entity.Basket;
import ua.entity.User;

public interface UserDao {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User findUserById(int id);
	public List<User> findAllUser();
	public List<Basket> findBasketsByUserId(User user);

}
