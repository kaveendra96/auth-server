package com.example.authserverown.repo;

import com.example.authserverown.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRespo extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String name);
}
