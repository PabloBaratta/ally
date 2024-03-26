package com.allyServer.controller;

import com.allyServer.model.User;
import com.allyServer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@RestController
public class UserController {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("ally");

    final EntityManager entityManager = factory.createEntityManager();
    UserRepository userRepository = new UserRepository(entityManager);

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        final EntityManagerFactory factory = Persistence.createEntityManagerFactory("ally");

        final EntityManager entityManager = factory.createEntityManager();
        UserRepository a = new UserRepository(entityManager);

        Optional<User> b = a.findById(id);

        if (b.isPresent()){
            return b.get().getName() + b.get().getEmail();
        }
        return "a";
    }

    @PostMapping("/user/create")
    public ResponseEntity<String> createUser(@RequestBody User user){
        try {
            userRepository.persist(user);
            return ResponseEntity.ok("Usuario creado exitosamente");
        } catch (Exception e) {
            // Enviar una respuesta de error en caso de que falle la creación del usuario
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el usuario: " + e.getMessage());
        }
    }

}
