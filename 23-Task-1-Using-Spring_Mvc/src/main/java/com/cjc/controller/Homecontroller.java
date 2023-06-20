package com.cjc.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Author;
import com.cjc.model.Book;
import com.cjc.model.Categorie;
import com.cjc.model.Publisher;
import com.cjc.service.AuthorService;
import com.cjc.service.BookService;
import com.cjc.service.CategoriesService;
import com.cjc.service.PublisherService;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
public class Homecontroller {

	@Autowired
	private BookService service;
	@Autowired
	private AuthorService service1;
	@Autowired
	private PublisherService service2;
	@Autowired
	private CategoriesService service3;

	@RequestMapping("/")
	public String loadPage() {
		System.out.println("Load :: called");
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

	

	@RequestMapping("au")
	public String toAuthor() {
		System.out.println("Author :: Called");
		return "author";
	}

	@RequestMapping("pu")
	public String toPublisher() {
		System.out.println("publisher :: Called");
		return "publisher";
	}

	@RequestMapping("ca")
	public String toCategories() {
		System.out.println("categories :: Called");
		return "categories";
	}

	@RequestMapping("lo")
	public String logOut() {
		return "index";
	}

	@RequestMapping("breg")
	public String registerBook() {
		return "bregister";
	}

	@RequestMapping("areg")
	public String registerAuthor() {
		return "aregister";
	}

	@RequestMapping("preg")
	public String registerPublisher() {
		return "pregister";
	}

	@RequestMapping("creg")
	public String registerCategorie() {
		return "cregister";
	}
	@RequestMapping("/bo")
	public String toBook(@ModelAttribute Book book,Model m) {
		System.out.println("Book::Called");
		List<Book> list=service.allBook(book);
		m.addAttribute("data", list);
		return "book";
	}

	@RequestMapping("bdel")
	public String deleteBook(@RequestParam int bookId,Model m)
	{
		List<Book> blist=service.deletBook(bookId);
		m.addAttribute("data", blist);
		return "book";
	}
	@RequestMapping("reg")
	public String saveBook(@ModelAttribute Book book) {
		service.saveBook(book);
		return "success";
	}
	
	
	
//	@RequestMapping("beid")
//	public String editBook(@RequestParam int bookId, Model m)
//	{
//		Book book=service.editBook(bookId);
//		m.addAttribute("book", book );
//		
//		return "book";
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping("authorreg")
	public String saveAuthor(@ModelAttribute Author author) {
		service1.saveAuthor(author);
		return "author";
	}

	@RequestMapping("pubreg")
	public String savePublisher(@ModelAttribute Publisher publisher) {
		System.out.println("SavePub::Called");
		service2.savePublisher(publisher);

		return "publisher";
	}

	@RequestMapping("categoriesreg")
	public String saveCategori(@ModelAttribute Categorie categorie) {
		service3.saveCategori(categorie);

		return "publisher";
	}
	

}
