package dao;

import java.util.List;

import entities.Basket;
import entities.User;

public interface UserDao {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User findUserById(int id);
	public List<User> findAllUser();
	public List<Basket> findBasketsByUserId(User user);

}
