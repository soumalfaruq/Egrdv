package com.api.erdv.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.erdv.model.Prospect;
import com.api.erdv.model.Rdv;
import com.api.erdv.repository.NaturePrestationRepository;
import com.api.erdv.repository.ProspectRepository;
import com.api.erdv.repository.RdvRepository;

@RestController
@RequestMapping("api/rdv")
public class RdvController {

	@Autowired
	RdvRepository rdv;
	
	@Autowired 
	ProspectRepository prospect;
	@Autowired
	NaturePrestationRepository naturePrestation;
	
	@GetMapping("/all")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
	List<Rdv> AllRdv(){
		return rdv.findAll();
	}
	
	@PostMapping("/creation")
	public void CreationRdv(@RequestBody Rdv newRdv,@RequestBody Prospect newProspect) {
		
		//Generation code rdv et code prospect
	newRdv.setCodeRdv(newProspect.getPrenom().substring(0, 1)+""
			+""+newProspect.getPrenom().substring(0, 1)+""
			+rdv.findAll().size()+""
			+""+newRdv.getNaturePrestation().getLibele().substring(0, 2)+"");
	newRdv.setEtatRdv(1);
	newProspect.setCode(newRdv.getCodeRdv());
	
	//Sauvegarde du rdv et du prospect
	rdv.save(newRdv);
	prospect.save(newProspect);
	}
	
	 @PutMapping("/update")
	 public void updateRdv(@Valid @RequestBody Rdv updateRdv) {
		 rdv.save(updateRdv);
	 }
	
}
