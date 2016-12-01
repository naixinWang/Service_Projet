package com.boutique.api.irepository;

import java.util.ArrayList;

import com.boutique.api.dto.ProduitBean;

public interface IRepository {
	public ArrayList<ProduitBean> getProducts();
	public void buyProduct();
	
}
