package com.taskManager.dtos;

import java.util.Set;

import com.taskManager.enums.Role;

public class UserDTO {
    private String username;
    private Set<Role> roles;
    
	public UserDTO(String username, Set<Role> roles) {
		super();
		this.username = username;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}