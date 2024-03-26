package com.allyServer.repository;

import com.allyServer.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import java.util.List;
import java.util.Optional;


public class UserRepository {

    private final EntityManager entityManager;

    public UserRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Optional<User> findById(Long userId){
        return Optional.ofNullable(entityManager.find(User.class, userId));
    }

    public Optional<User> findByEmail(String email){
        return entityManager
                .createQuery("SELECT u FROM User u WHERE u.email LIKE :email", User.class)
                .setParameter("email", email).getResultList()
                .stream()
                .findFirst();
    }

    public List<User> listAll(){
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public User persist(User user){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        return user;
    }

}
