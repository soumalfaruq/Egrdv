package com.api.erdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.Prospect;

@RepositoryRestResource
public interface ProspectRepository extends JpaRepository<Prospect, Long>{

Prospect findByCode(String code);
}