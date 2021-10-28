package com.ghada.parfum.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Parfum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParfum;
	private String nomParfum;
	private String genre;
	private Double prix;
	@ManyToOne
    private Marque marque;
    
	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Parfum() {
	super();
	}

	public Parfum(String nomParfum, String genre, Double prix) {
		super();
		
		this.nomParfum = nomParfum;
		this.genre = genre;
		this.prix = prix;
	}

	public Long getIdParfum() {
		return idParfum;
	}

	public void setIdParfum(Long idParfum) {
		this.idParfum = idParfum;
	}

	public String getNomParfum() {
		return nomParfum;
	}

	public void setNomParfum(String nomParfum) {
		this.nomParfum = nomParfum;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Parfum [idParfum=" + idParfum + ", nomParfum=" + nomParfum + ", genre=" + genre + ", prix=" + prix
				+ ", getIdParfum()=" + getIdParfum() + ", getNomParfum()=" + getNomParfum() + ", getGenre()="
				+ getGenre() + ", getPrix()=" + getPrix() + "]";
	}
	
}