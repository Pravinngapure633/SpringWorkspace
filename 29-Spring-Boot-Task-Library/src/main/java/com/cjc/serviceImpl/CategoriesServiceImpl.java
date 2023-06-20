package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Categories;
import com.cjc.repository.CategoriesRepository;
import com.cjc.service.CategoriesService;
@Service
public class CategoriesServiceImpl  implements CategoriesService{

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Override
	public void saveCategorie(Categories categories) {
	
		categoriesRepository.save(categories);
	}

	@Override
	public List<Categories> allBook(Categories categories) {
		
		
		return categoriesRepository.findAll();
	}
	
	
}
