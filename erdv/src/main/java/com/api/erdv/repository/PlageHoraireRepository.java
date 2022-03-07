package com.api.erdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.PlageHoraire;

@RepositoryRestResource
public interface PlageHoraireRepository extends JpaRepository<PlageHoraire, Long>{

}