package com.api.erdv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeAbonnement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libeleType;
	private Double montant;
	public String getLibeleType() {
		return libeleType;
	}
	public void setLibeleType(String libeleType) {
		this.libeleType = libeleType;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeAbonnement(String libeleType, Double montant) {
		super();
		this.libeleType = libeleType;
		this.montant = montant;
	}
	public TypeAbonnement() {
		super();
		// TODO Auto-generated constructor stub
	}
}