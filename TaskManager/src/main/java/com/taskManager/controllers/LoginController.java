package com.taskManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.beans.SampleLogin;
import com.taskManager.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	public LoginService loginService;
	
	@PostMapping("/verify")
    public ResponseEntity<SampleLogin> createUser(@RequestBody SampleLogin sampleLogin) {
		boolean login = loginService.login(sampleLogin);
		sampleLogin.setReturnStatus("Failed");
		if(login==true) {
			sampleLogin.setReturnStatus("Success");
			sampleLogin.setPassword(null);
		}
        return ResponseEntity.status(HttpStatus.OK).body(sampleLogin);
    }
}
