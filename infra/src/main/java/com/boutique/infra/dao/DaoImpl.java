package com.boutique.infra.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.boutique.infra.dto.CategorieBean;
import com.boutique.infra.dto.ProduitBean;
import com.boutique.infra.hibernate.model.Produit;

public class DaoImpl {
	
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Produit.class)
			.buildSessionFactory();
	
	Session session = factory.getCurrentSession();
	
	public ArrayList<ProduitBean> getProducts(){
		
		try{
			
			session.beginTransaction();
			
			Query query = session.createQuery("from Produit");
			List<Produit> produitsHQL = query.getResultList();
			ArrayList<ProduitBean> produitsBeans = new ArrayList<ProduitBean>();
			ProduitBean bean;
			
			for( Produit p : produitsHQL){
				bean = new ProduitBean();
				CategorieBean cat = new CategorieBean();
				cat.setIdCategorie(p.getCategorie().getIdCategorie());
				cat.setLibelleCategorie(p.getLibelleProduit());
				
				bean.setIdProduit(p.getIdProduit());
				bean.setLibelleProduit(p.getLibelleProduit());
				bean.setNombreVentes(p.getNombreVentes());
				bean.setPrix(p.getPrix());
				bean.setCategorie(cat);

				produitsBeans.add(bean);
			}
			
			return produitsBeans;
			
		} finally{
			factory.close();
		}

		
	}

}
