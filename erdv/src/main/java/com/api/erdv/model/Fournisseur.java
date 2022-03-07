package com.api.erdv.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur extends Personne{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String profession;
	private String description;
	private int note;
	@OneToMany
	private List<LieuRdv> adresses;
	private Domaine domaine;
	private String type;
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public List<LieuRdv> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<LieuRdv> adresses) {
		this.adresses = adresses;
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Fournisseur(String nom, String prenom, String mail, String tel, String profession,
			String description, int note, List<LieuRdv> adresses, Domaine domaine, String type) {
		super(nom, prenom, mail, tel);
		this.profession = profession;
		this.description = description;
		this.note = note;
		this.adresses = adresses;
		this.domaine = domaine;
		this.type = type;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

}