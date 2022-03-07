package com.api.erdv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NaturePrestation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5849879318618144150L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libele;
	public NaturePrestation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibele() {
		return libele;
	}
	public void setLibele(String libele) {
		this.libele = libele;
	}
	public NaturePrestation(String libele) {
		super();
		this.libele = libele;
	}
}
