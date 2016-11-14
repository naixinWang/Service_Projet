package com.boutique.infra.hibernate.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CAT")
public class Categorie {

	@Id
	@Column(name = "ID_CAT")
	private int idCategorie;
	
	@Column(name = "LIBCAT")
	private String libelleCategorie;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categorie")
	private List<Produit> produits;
	
	
	public Categorie(){
		
	}
	
	public Categorie(String libelleCategorie, List<Produit> produits) {
		super();
		this.libelleCategorie = libelleCategorie;
		this.produits = produits;
	}
	
	public Categorie(int idCategorie, String libelleCategorie, List<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.libelleCategorie = libelleCategorie;
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", libelleCategorie=" + libelleCategorie + ", produits="
				+ produits + "]";
	}


	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
