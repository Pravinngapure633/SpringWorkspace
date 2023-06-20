package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String loadPage() {
		System.out.println("LoadPage :: Called");
		return "index";

	}

	@RequestMapping("/logPage")
	public String loginPage() {
		System.out.println("LoginPage :: Called");
		return "login";
	}

	@RequestMapping("/regPage")
	public String registerPage() {
		System.out.println("RegisterPage :: Called");
		return "register";
	}

	@RequestMapping("/log")
	public String loginCheck(@RequestParam String userName, @RequestParam String password,Model m) {
		System.out.println("LoginCheck :: Called" + userName + " " + password);
		List<Student> stuList=service.loginCheck(userName,password);
		m.addAttribute("data", stuList);
		if(stuList!=null)
		{
			m.addAttribute("data",stuList);
			return "success";
		}
		else {
			return "login";	
		}
		

	}

	@RequestMapping("/reg")
	public String registerStudent(@ModelAttribute Student student) // @ModelAttribute is used for multiple field
	{
		System.out.println(student);
		System.out.println("registerStudent :: Called");
		service.saveStudent(student);
		return "index";
	}

}
