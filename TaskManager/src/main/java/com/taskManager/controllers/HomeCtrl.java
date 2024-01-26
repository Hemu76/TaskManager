package com.taskManager.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.beans.Home;
import com.taskManager.daoImpl.HomeDAO;

@RestController
public class HomeCtrl {
	@Autowired
	HomeDAO hdao;
	
	@GetMapping("/get")
	public List<Home> get() {
		return hdao.get();
	}
	
	@PostMapping("/api/data")
    public ResponseEntity<String> receiveData(@RequestBody Map<String, Object> data) {
        // Process the received data
        System.out.println("Received data: " + data);
        return ResponseEntity.ok().body("{\"message\": \"Data received successfully\"}");
    }
}
