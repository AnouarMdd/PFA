package com.inn.restaurant.repositories;

import java.util.Optional;

import com.inn.restaurant.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}