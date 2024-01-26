package com.taskManager.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taskManager.beans.TMUser;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class UserDAO {

    @Autowired
    private EntityManager entityManager;

    public List<TMUser> getAllUsers() {
        TypedQuery<TMUser> query = entityManager.createQuery("SELECT u FROM User u", TMUser.class);
        return query.getResultList();
    }

    public TMUser getUserById(Long id) {
        return entityManager.find(TMUser.class, id);
    }

    public TMUser createUser(TMUser user) {
        entityManager.persist(user);
        return user;
    }

    public TMUser updateUser(TMUser user) {
        return entityManager.merge(user);
    }

    public void deleteUser(Long id) {
        TMUser user = getUserById(id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}
