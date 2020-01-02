package com.ntq.springapp.repositories;

import java.util.Optional;

import com.ntq.springapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
