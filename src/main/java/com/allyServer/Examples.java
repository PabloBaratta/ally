package com.allyServer;

import com.allyServer.model.User;

import javax.persistence.*;

public class Examples {
    public static void main(String[] args) {
        final EntityManagerFactory factory = Persistence.createEntityManagerFactory("ally");

        final EntityManager entityManager = factory.createEntityManager();

        sample1(entityManager);

        entityManager.close();
    }

    private static void sample1(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        User firstUser = new User("Jose", "pablo@ally.com", "allyproject");
        entityManager.persist(firstUser);
        firstUser.setPreferences(123, 1234,1234 );
        entityManager.persist(firstUser);
        transaction.commit();
    }
}
