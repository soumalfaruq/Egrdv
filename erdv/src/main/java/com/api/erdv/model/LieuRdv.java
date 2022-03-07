package com.api.erdv.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class LieuRdv implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String adress;
	private String coordonneeMaps;
	private String telephone;
	private int capacite;
	private String representant;
	private Fournisseur fournisseur;
	@OneToMany
	private List<PlageHoraire> plageHoraire;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCoordonneeMaps() {
		return coordonneeMaps;
	}
	public void setCoordonneeMaps(String coordonneeMaps) {
		this.coordonneeMaps = coordonneeMaps;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getRepresentant() {
		return representant;
	}
	public void setRepresentant(String representant) {
		this.representant = representant;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public List<PlageHoraire> getPlageHoraire() {
		return plageHoraire;
	}
	public void setPlageHoraire(List<PlageHoraire> plageHoraire) {
		this.plageHoraire = plageHoraire;
	}
	public LieuRdv(String adress, String coordonneeMaps, String telephone, int capacite, String representant,
			Fournisseur fournisseur, List<PlageHoraire> plageHoraire) {
		super();
		this.adress = adress;
		this.coordonneeMaps = coordonneeMaps;
		this.telephone = telephone;
		this.capacite = capacite;
		this.representant = representant;
		this.fournisseur = fournisseur;
		this.plageHoraire = plageHoraire;
	}
	public LieuRdv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}