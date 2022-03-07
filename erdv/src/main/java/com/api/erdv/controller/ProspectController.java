package com.api.erdv.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.erdv.model.Prospect;
import com.api.erdv.model.Rdv;
import com.api.erdv.repository.ProspectRepository;
import com.api.erdv.repository.RdvRepository;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/rdv/prospect")
public class ProspectController {

	@Autowired
	ProspectRepository prospect;
	
	@Autowired
	RdvRepository rdv;
	
	@GetMapping("/rdv/{code}")
	public Rdv RdvByCode(@PathVariable("code") String code){
		return rdv.findByCodeRdv(code);
	}
	
	@GetMapping("/{code}")
	public Prospect ProspectByCode(@PathVariable("code") String code){
		return prospect.findByCode(code);
	}
	
}
