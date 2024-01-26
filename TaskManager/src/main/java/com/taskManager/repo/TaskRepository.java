package com.taskManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.beans.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Custom query methods if needed
}
