package com.taskManager.service;

import java.util.List;
import java.util.Optional;

import com.taskManager.beans.TMUser;

public interface UserService {
	public List<TMUser> getAllUsers();

    public Optional<TMUser> getUserById(Long id);
}
