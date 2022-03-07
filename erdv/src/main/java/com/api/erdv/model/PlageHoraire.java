package com.api.erdv.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PlageHoraire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datePlage;
	private Date heureDebut;
	private Date heureFin;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatePlage() {
		return datePlage;
	}
	public void setDatePlage(Date datePlage) {
		this.datePlage = datePlage;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}
	public PlageHoraire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlageHoraire(Date datePlage, Date heureDebut, Date heureFin) {
		super();
		this.datePlage = datePlage;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}
}