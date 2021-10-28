package com.ghada.parfum.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarque;
	private String nom;
	@OneToMany (mappedBy="marque")
	private List<Parfum> parfums;
	
	public List<Parfum> getParfums() {
		return parfums;
	}

	public void setParfums(List<Parfum> parfums) {
		this.parfums = parfums;
	}

	public Marque(Long idMarque, String nom) {
		super();
		this.idMarque = idMarque;
		this.nom = nom;
	}
	


	public Long getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(Long idMarque) {
		this.idMarque = idMarque;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Marque [idMarque=" + idMarque + ", nom=" + nom + ", getIdMarque()=" + getIdMarque() + ", getNom()="
				+ getNom() + "]";
	}
	
}
