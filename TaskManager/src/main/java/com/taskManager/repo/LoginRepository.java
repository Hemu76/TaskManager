package com.taskManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.beans.SampleLogin;

public interface LoginRepository extends JpaRepository<SampleLogin, Long> {
	SampleLogin findByUserName(String userName);
}
