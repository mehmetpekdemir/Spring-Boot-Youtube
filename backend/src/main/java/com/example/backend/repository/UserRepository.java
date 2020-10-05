package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.User;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsUserByUsername(String username);

}
