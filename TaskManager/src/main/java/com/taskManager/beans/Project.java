package com.taskManager.beans;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;

    @ManyToMany
    private List<TMUser> teamMembers;

	public Project(Long id, String name, String description, List<Task> tasks, List<TMUser> teamMembers) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tasks = tasks;
		this.teamMembers = teamMembers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<TMUser> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<TMUser> teamMembers) {
		this.teamMembers = teamMembers;
	}

}
