package com.cjc.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.CategoriesDao;
import com.cjc.model.Categorie;
@Repository
public class CategoriesDaoIMPL implements CategoriesDao{

	@Autowired
	private SessionFactory factory;

	public void saveCategori(Categorie categorie) {
		
		Session session = factory.openSession();
		session.save(categorie);
		session.beginTransaction().commit();
	}
	
	
}
