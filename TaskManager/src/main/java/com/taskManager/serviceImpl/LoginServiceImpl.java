package com.taskManager.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.taskManager.beans.SampleLogin;
import com.taskManager.repo.LoginRepository;
import jakarta.transaction.Transactional;

@Service
public class LoginServiceImpl implements UserDetailsService{
	
	@Autowired
	public LoginRepository loginRepository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SampleLogin sl= loginRepository.findByUserName(username);
		return sl;
	}

}
