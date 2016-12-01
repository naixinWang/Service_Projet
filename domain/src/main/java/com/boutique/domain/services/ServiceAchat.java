package com.boutique.domain.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boutique.api.dto.ProduitBean;
import com.boutique.api.irepository.IRepository;


@Component
public class ServiceAchat {
	
	@Autowired
	private IRepository repo;//repos.actemetier
	private ArrayList<ProduitBean> products;
	
	public ServiceAchat(){
//		this.dao = dao;
//		this.products = this.dao.getProducts();
		
	}
	
//	public ArrayList<ProduitBean> test(){
//		return this.dao.getProducts();
//		
//	}
	

	

}
