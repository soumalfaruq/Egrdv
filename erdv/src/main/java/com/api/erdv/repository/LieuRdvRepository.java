package com.api.erdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.LieuRdv;

@RepositoryRestResource
public interface LieuRdvRepository extends JpaRepository<LieuRdv, Long> {

}