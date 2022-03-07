package com.api.erdv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.erdv.model.Personne;
import com.api.erdv.model.Rdv;
import com.api.erdv.repository.PersonneRepository;
import com.api.erdv.repository.RdvRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	PersonneRepository person;
	
	@Autowired
	RdvRepository rdv;
  @GetMapping("/all")
  public List<Personne> allAccess() {
    return person.findAll();
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_CLIENT') or hasRole('ROLE_ADMIN')")
  public String userAccess() {
    return "User Content.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('ROLE_CLIENT')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }

}
