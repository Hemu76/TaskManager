package com.taskManager.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskManager.beans.TMUser;
import com.taskManager.repo.UserRepository;
import com.taskManager.service.UserService;

public class UserServiceImpl implements UserService{
	 @Autowired
	 private UserRepository userRepository;
	 
	 @Override
     public List<TMUser> getAllUsers() {
	     return userRepository.findAll();
	 }
	 
	 @Override
	 public Optional<TMUser> getUserById(Long id) {
	     return userRepository.findById(id);
	 }
	 
}
