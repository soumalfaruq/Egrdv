package com.api.erdv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByMail(String email);
}
