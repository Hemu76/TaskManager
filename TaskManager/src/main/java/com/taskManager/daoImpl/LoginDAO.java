package com.taskManager.daoImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.taskManager.beans.SampleLogin;
import com.taskManager.repo.LoginRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class LoginDAO{
	
//	@Autowired
//    private EntityManager entityManager;
	
//	@Transactional
//	public boolean verifyUser(SampleLogin sampleLogin) {
//		System.out.println(sampleLogin.getUserName());
//		System.out.println(sampleLogin.getPassword());
//		TypedQuery<SampleLogin> query1 = entityManager.createQuery("SELECT sl FROM SampleLogin sl", SampleLogin.class);
//		System.out.println(query1.getResultList().size()+" hii");
//		TypedQuery<Long> query = entityManager.createQuery("SELECT COUNT(sl) FROM SampleLogin sl where sl.userName=:userName and sl.password=:password", Long.class);
//		query.setParameter("userName", sampleLogin.getUserName().trim());
//		query.setParameter("password", sampleLogin.getPassword().trim());
//		long count = query.getSingleResult();
//		System.out.println(count);
//		return count>0;
//    }
}
