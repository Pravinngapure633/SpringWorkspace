package com.cjc.service;

import java.util.List;

import com.cjc.model.Categories;

public interface CategoriesService  {

	void saveCategorie(Categories categories);

	List<Categories> allBook(Categories categories);

}
