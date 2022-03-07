package com.api.erdv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private RoleEnum name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Role(RoleEnum name) {
		super();
		this.name = name;
	}
	public RoleEnum getName() {
		return name;
	}
	public void setName(RoleEnum name) {
		this.name = name;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}