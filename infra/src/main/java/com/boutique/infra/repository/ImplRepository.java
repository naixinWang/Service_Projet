package com.boutique.infra.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.boutique.api.dto.CategorieBean;
import com.boutique.api.dto.ProduitBean;
import com.boutique.api.irepository.IRepository;
import com.boutique.infra.hibernate.model.Produit;

@Component
public class ImplRepository implements IRepository{
	
	
//	SessionFactory factory = new Configuration()
//			.configure("hibernate.cfg.xml")
//			.addAnnotatedClass(Produit.class)
//			.buildSessionFactory();
//	
//	Session session = factory.getCurrentSession();
	
	public ArrayList<ProduitBean> getProducts(){
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Produit.class)
		.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		
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
				cat.setLibelleCategorie(p.getCategorie().getLibelleCategorie());
				
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

	public void buyProduct(int idProduit) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Produit.class)
		.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		
		try{
			
			session.beginTransaction();
			
			Query query = session.createQuery("update Produit set nombreVentes = nombreVentes+1 where idProduit = :idPrd");
			query.setParameter("idPrd", idProduit);
			query.executeUpdate();
			session.getTransaction().commit();
			
			
		} finally{
			factory.close();
		}
		
		
	}


}
