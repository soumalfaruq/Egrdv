package com.api.erdv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.Role;
import com.api.erdv.model.RoleEnum;

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(RoleEnum roleUser);
}
