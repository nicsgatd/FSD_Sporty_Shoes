package org.simplilearn.servicesimpl;

import java.util.List;

import org.simplilearn.entities.Product;
import org.simplilearn.entities.User;
import org.simplilearn.repositories.UserRepository;
import org.simplilearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside insert user method");
		userRepository.save(user);
		
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	

	

}
