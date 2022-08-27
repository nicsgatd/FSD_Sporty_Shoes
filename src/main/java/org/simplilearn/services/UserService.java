package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Product;
import org.simplilearn.entities.User;

public interface UserService {
	
	void addUser(User user);
	List<User> getUsers();

}
