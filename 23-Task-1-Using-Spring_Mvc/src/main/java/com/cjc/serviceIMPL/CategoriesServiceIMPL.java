package com.cjc.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.CategoriesDao;
import com.cjc.model.Categorie;
import com.cjc.service.CategoriesService;
@Service
public class CategoriesServiceIMPL implements CategoriesService{

	@Autowired
	private CategoriesDao categoriesDao;

	public void saveCategori(Categorie categorie) {
		categoriesDao.saveCategori(categorie);
	}
	
	
}
