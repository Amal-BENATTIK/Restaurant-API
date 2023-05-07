package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IDao;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


public class UserService implements IDao <User> {
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public User save(User u) {
		
		return this.userRepository.save(u);
	}

	@Override
	public List<User> findAll() {
		
		return this.userRepository.findAll();
	}

	@Override
	public User findById(int id_User) {
		
		return userRepository.findById(id_User);
	}

	@Override
	public void update(User u) {
		userRepository.save(u);
		
	}

	@Override
	public void delete(User u) {
		userRepository.delete(u);
		
	}

}
