package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String landingPage() {
		System.out.println("LandingPage :: Called");
	
		//return "views/index.jsp";
		return "index";
	}
	@RequestMapping("/logPage")
	public String loginPage()
	{
		System.out.println("LoginPage :: Called");
		//return "views/login.jsp";
		return "login";
	}
	@RequestMapping("/regPage")
	public String registerPage()
	{
		System.out.println("RegisterPage :: Called");
		//return "views/register.jsp";
		return "register";
	}
	@RequestMapping("/log")
	public String loginCheck(@RequestParam String userName,@RequestParam String password )
	{
		System.out.println("LoginCheck :: Called"+userName+" "+password);
//		if (uname.equals("admin") && pass.equals("admin@123"))
//			 return "success";
//			 else
//			 return "login";

		//return "views/success.jsp";
		return "success";
	}
	@RequestMapping("/reg")
	public String registerStudent(@ModelAttribute Student student) //@ModelAttribute is used for multiple field
	{
	 System.out.println(student);
	 System.out.println("registerStudent :: Called");
	// return "views/index.jsp";
	return "index";
	}

}
