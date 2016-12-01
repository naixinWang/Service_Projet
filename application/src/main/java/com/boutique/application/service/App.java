package com.boutique.application.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.boutique.api.dto.ProduitBean;
import com.boutique.api.irepository.IRepository;

public class App {
	
	@Autowired
	private IRepository repo;
	private ArrayList<ProduitBean> products;
	
	public App(){
		
	}
	
	public ArrayList<ProduitBean> getProduits(){
		products = repo.getProducts();
		return products;
	}
	
	

}
