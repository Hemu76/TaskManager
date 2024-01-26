package com.taskManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.beans.TMUser;

public interface UserRepository extends JpaRepository<TMUser, Long> {
    Optional<TMUser> findByUsername(String username);
}
