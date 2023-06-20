package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.model.Book;
import com.cjc.model.Categories;
import com.cjc.service.CategoriesService;

@Controller
public class CategoriesController {

	@Autowired
	private CategoriesService categoriesService;
	
	@RequestMapping("/ca")
	public String getAllCate(@ModelAttribute Categories categories,Model m) {
		System.out.println("Cate::Called");
		List<Categories> cList=categoriesService.allBook(categories);
		m.addAttribute("cdata", cList);
		return "categories";
	}
	
	@RequestMapping("/b4")
	public String back()
	{
		return "success";
	}
	
	@RequestMapping("/creg")
	public String addCategorie()
	{
		return "cregister";
	}
	
	@RequestMapping("/categoriesreg")
	public String saveCategorie(@ModelAttribute Categories categories)
	{
		System.out.println("Saved Categories called");
		categoriesService.saveCategorie(categories);
		return "success";
	}
	
	
}
