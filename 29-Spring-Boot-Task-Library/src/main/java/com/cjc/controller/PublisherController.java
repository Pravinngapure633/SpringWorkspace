package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.model.Publisher;
import com.cjc.service.PublisherService;

@Controller
public class PublisherController {
	
	@Autowired
	private PublisherService publisherService;
	
	
	@RequestMapping("/pu")
	public String getAllPub(@ModelAttribute Publisher publisher,Model m) {
		System.out.println("Book::Called");
		List<Publisher> pList=publisherService.allBook(publisher);
		m.addAttribute("pdata", pList);
		return "publisher";
	}
	
	@RequestMapping("/b3")
	public String back()
	{
		return "success";
	}
	
	@RequestMapping("/preg")
	public String addPublisher()
	{
		return "pregister";
	}
	
	@RequestMapping("/pubreg")
	public String savePublisher(@ModelAttribute Publisher publisher)
	{
		publisherService.savePublisher(publisher);
		
		return "success";
	}
	
	

}
