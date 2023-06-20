package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Book;
import com.cjc.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String landingPage() {
		System.out.println("Landingpage :: Called ");

		return "index";
	}

	@RequestMapping("log")
	public String loginCheck(@RequestParam String userName, @RequestParam String password, Model m) {
		
		if (userName.equals("admin") && password.equals("11111111")) {
			System.out.println("LoginCheck :: Called");
			return "success";
		} else {
			System.out.println("Check Your ID Password");
			return "index";
		}
	}
	
	@RequestMapping("/lo")
	public String logOut()
	{
		return "index";
	}
	
	@RequestMapping("/back")
	public String back()
	{
		return "success";
	}
	
	@RequestMapping("/bo")
	public String toBook(@ModelAttribute Book book,Model m) {
		System.out.println("Book::Called");
		List<Book> list=bookService.allBook(book);
		m.addAttribute("data", list);
		return "book";
	}
	@RequestMapping("/breg")
	public String addBook()
	{
		return "bregister";
	}
	
	@RequestMapping("/reg")
	public String saveBook(@ModelAttribute Book book)
	{
		System.out.println("savebook :: Called");
		bookService.saveBoook(book);
		return "success";
	}

}
