package com.taskManager.dtos;

import java.time.LocalDateTime;

import com.taskManager.enums.TaskPriority;
import com.taskManager.enums.TaskStatus;

public class TaskDTO {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private TaskPriority priority;
    private TaskStatus status;
    private Long assignedUserId;
    private Long projectId;
    
	public TaskDTO(String title, String description, LocalDateTime dueDate, TaskPriority priority, TaskStatus status,
			Long assignedUserId, Long projectId) {
		super();
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.status = status;
		this.assignedUserId = assignedUserId;
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public TaskPriority getPriority() {
		return priority;
	}

	public void setPriority(TaskPriority priority) {
		this.priority = priority;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Long getAssignedUserId() {
		return assignedUserId;
	}

	public void setAssignedUserId(Long assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
    
}
