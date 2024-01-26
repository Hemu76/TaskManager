package com.taskManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.beans.TMUser;
import com.taskManager.dtos.UserDTO;
import com.taskManager.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //@Autowired
    //private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        //List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        //UserDTO user = userService.getUserById(id);
        return ResponseEntity.ok(null);
//        return users.stream()
//                .map(user -> modelMapper.map(user, UserDTO.class))
//                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        //UserDTO createdUser = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        //UserDTO updatedUser = userService.updateUser(id, userDTO);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        //userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
