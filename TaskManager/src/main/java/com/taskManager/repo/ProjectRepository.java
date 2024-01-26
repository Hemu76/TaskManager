package com.taskManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.beans.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Custom query methods if needed
}
