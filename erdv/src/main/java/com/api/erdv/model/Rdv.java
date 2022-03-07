package com.api.erdv.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rdv implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codeRdv;
	private Date dateRdv;
	private LieuRdv lieu;
	private Prospect prospect;
	@ManyToOne
	@JoinColumn(name = "nature_prestation_id")
	private NaturePrestation naturePrestation;
	private int etatRdv;
	
	public Rdv(String codeRdv, Date dateRdv, LieuRdv lieu, Prospect prospect, NaturePrestation naturePrestation,
			int etatRdv) {
		super();
		this.codeRdv = codeRdv;
		this.dateRdv = dateRdv;
		this.lieu = lieu;
		this.prospect = prospect;
		this.naturePrestation = naturePrestation;
		this.etatRdv = etatRdv;
	}
	public NaturePrestation getNaturePrestation() {
		return naturePrestation;
	}
	public void setNaturePrestation(NaturePrestation naturePrestation) {
		this.naturePrestation = naturePrestation;
	}
	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeRdv() {
		return codeRdv;
	}
	public void setCodeRdv(String codeRdv) {
		this.codeRdv = codeRdv;
	}
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}
	public LieuRdv getLieu() {
		return lieu;
	}
	public void setLieu(LieuRdv lieu) {
		this.lieu = lieu;
	}
	public Prospect getProspect() {
		return prospect;
	}
	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}
	public int getEtatRdv() {
		return etatRdv;
	}
	public void setEtatRdv(int etatRdv) {
		this.etatRdv = etatRdv;
	}
	
}