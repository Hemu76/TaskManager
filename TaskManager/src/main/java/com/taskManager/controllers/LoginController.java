package com.taskManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.beans.SampleLogin;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LoginController {
	
	@Autowired
	public UserDetailsService userDetailsService;
	
	@PostMapping("/verify")
    public ResponseEntity<SampleLogin> createUser(@RequestBody SampleLogin sampleLogin) {
		System.out.println("step 1 "+sampleLogin.getUsername());
		UserDetails login = userDetailsService.loadUserByUsername(sampleLogin.getUsername());
		sampleLogin.setReturnStatus("Failed");
		System.out.println(login.getPassword()+"  "+sampleLogin.getPassword());
		if(login.getPassword().equals(sampleLogin.getPassword())) {
			sampleLogin.setReturnStatus("Success");
			sampleLogin.setPassword(null);
		}
        return ResponseEntity.status(HttpStatus.OK).body(sampleLogin);
    }
}
