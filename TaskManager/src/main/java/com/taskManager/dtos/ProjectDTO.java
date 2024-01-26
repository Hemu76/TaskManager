package com.taskManager.dtos;

import java.util.List;

public class ProjectDTO {
    private String name;
    private String description;
    private List<Long> teamMemberIds;
    
	public ProjectDTO(String name, String description, List<Long> teamMemberIds) {
		super();
		this.name = name;
		this.description = description;
		this.teamMemberIds = teamMemberIds;
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
	public List<Long> getTeamMemberIds() {
		return teamMemberIds;
	}
	public void setTeamMemberIds(List<Long> teamMemberIds) {
		this.teamMemberIds = teamMemberIds;
	}

}
