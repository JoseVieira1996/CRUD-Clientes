package com.example.trabalho.Atividade.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.example.trabalho.Atividade.entities.Client;


public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	private Long id;
	private String name;
	private Double income;
	private Instant birthDate;
	private Integer children;
	private String cpf;
	
	
	public ClientDTO() {
	}


	public ClientDTO(Long id, String name, Double income, Instant birthDate, Integer children, String cpf) {
		this.id = id;
		this.name = name;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
		this.cpf = cpf;
	}


	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
		cpf = entity.getCpf();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getIncome() {
		return income;
	}


	public void setIncome(Double income) {
		this.income = income;
	}


	public Instant getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}


	public Integer getChildren() {
		return children;
	}


	public void setChildren(Integer children) {
		this.children = children;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	

}
