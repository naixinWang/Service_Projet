package com.boutique.api.dto;

public class CategorieBean {

	private int idCategorie;
	private String libelleCategorie;
	
	public CategorieBean(){
		
	}

	public CategorieBean(int idCategorie, String libelleCategorie) {
		super();
		this.idCategorie = idCategorie;
		this.libelleCategorie = libelleCategorie;
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
	
	

}
