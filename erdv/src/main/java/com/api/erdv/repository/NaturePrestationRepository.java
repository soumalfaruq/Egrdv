package com.api.erdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.NaturePrestation;

@RepositoryRestResource
public interface NaturePrestationRepository extends JpaRepository<NaturePrestation, Long>{

}