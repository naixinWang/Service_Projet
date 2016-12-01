package com.boutique.api.dto;

import com.boutique.api.dto.CategorieBean;

public class ProduitBean {
	
	private int idProduit;
	private String libelleProduit;
	private int prix;
	private int nombreVentes;
	private CategorieBean categorie = new CategorieBean();
	
	public ProduitBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProduitBean(int idProduit, String libelleProduit, int prix, int nombreVentes, CategorieBean categorie) {
		super();
		this.idProduit = idProduit;
		this.libelleProduit = libelleProduit;
		this.prix = prix;
		this.nombreVentes = nombreVentes;
		this.categorie = categorie;
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
	public CategorieBean getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieBean categorie) {
		this.categorie.setIdCategorie(categorie.getIdCategorie());
		this.categorie.setLibelleCategorie(categorie.getLibelleCategorie());
	}
	
}
