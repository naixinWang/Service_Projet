package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRD")
public class Produit {
	
	@Id
	@Column(name = "ID_PRD")
	private int idProduit;
	
	@Column(name = "LIBPRD")
	private String libelleProduit;
	
	@Column(name = "PRIPRD")
	private int prix;
	
	@Column(name = "NBRVTE")
	private int nombreVentes;
	
	@ManyToOne
	@JoinColumn(name = "cat_ID_CAT")
	private Categorie categorie;
	
	public Produit(){
		
	}
	
	public Produit(String libelleProduit, int prix, int nombreVentes, Categorie categorie) {
		super();
		this.libelleProduit = libelleProduit;
		this.prix = prix;
		this.nombreVentes = nombreVentes;
		this.categorie = categorie;
	}
	

	public Produit(int idProduit, String libelleProduit, int prix, int nombreVentes, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.libelleProduit = libelleProduit;
		this.prix = prix;
		this.nombreVentes = nombreVentes;
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", libelleProduit=" + libelleProduit + ", prix=" + prix
				+ ", nombreVentes=" + nombreVentes + ", categorie=" + categorie + "]";
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNombreVentes() {
		return nombreVentes;
	}

	public void setNombreVentes(int nombreVentes) {
		this.nombreVentes = nombreVentes;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}	
	
	
}