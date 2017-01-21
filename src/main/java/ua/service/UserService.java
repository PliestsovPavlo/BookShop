package ua.service;

import java.util.List;

import ua.entity.User;

public interface UserService {
	
	void save(User user);
	void delete (int id);
	User findOne(int id);
	List<User> findAll();

}
