package com.api.erdv.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Abonnement  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private TypeAbonnement typeAbonnement;
	private Fournisseur fournisseur;
	private Date dateDebut;
	private Date dateFin;
	private int etat;
	public Abonnement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeAbonnement getTypeAbonnement() {
		return typeAbonnement;
	}
	public void setTypeAbonnement(TypeAbonnement typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public Abonnement(TypeAbonnement typeAbonnement, Fournisseur fournisseur, Date dateDebut, Date dateFin, int etat) {
		super();
		this.typeAbonnement = typeAbonnement;
		this.fournisseur = fournisseur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etat = etat;
	}
}