package com.taskManager.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {
	public UserDetails loadUserByUsername(String username);
}
