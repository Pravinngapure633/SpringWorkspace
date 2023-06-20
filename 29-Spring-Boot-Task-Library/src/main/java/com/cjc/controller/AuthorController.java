package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.model.Author;
import com.cjc.model.Book;
import com.cjc.service.Authorservice;

@Controller
public class AuthorController {

	
	@Autowired
	private Authorservice authorservice;
	

	@RequestMapping("/au")
	public String getAllAuthor(@ModelAttribute Author author,Model m) {
		System.out.println("Book::Called");
		List<Author> aList=authorservice.allBook(author);
		m.addAttribute("adata", aList);
		return "author";
	}
	
	@RequestMapping("/b2")
	public String back()
	{
		return "success";
	}
	
	@RequestMapping("/areg")
	public String addAuthor()
	{
		return "aregister";
	}
	
	@RequestMapping("/authorreg")
	public String saveAuthor(@ModelAttribute Author author)
	{
		authorservice.saveAuthor(author);
		
		return "success";
	}
	
}
