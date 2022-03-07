package com.api.erdv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class EntryPointController {

	@GetMapping("/")
	public String entryPoint() {
		return "E-RDV";
	}
}
