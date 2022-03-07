package com.api.erdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.api.erdv.model.LieuRdv;
import com.api.erdv.model.Rdv;

@RepositoryRestResource
public interface RdvRepository extends JpaRepository<Rdv, Long> {
	
List<Rdv> findByLieu(LieuRdv lieu);
Rdv findByCodeRdv(String code);
}