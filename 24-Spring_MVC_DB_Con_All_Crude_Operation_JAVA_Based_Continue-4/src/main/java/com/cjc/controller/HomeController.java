package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		//view name
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
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int rollno,Model m)
	{
		List<Student> list=service.deleteStudent(rollno);
		m.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int rollno,Model m)
	{
		Student stu=service.editStudent(rollno);
		m.addAttribute("stu",stu);
		return "update";
	}
	@RequestMapping("/up")
	public String update(@ModelAttribute Student student)
	{
		
		service.saveStudent(student);
		return "login";
	}
	//url ---path variable
	//http://localhost:8090/20-Spring_MVC_DB_Con_XMl_Based_Continue-2/check/200
	@RequestMapping("check/{num}")
	public String check(@PathVariable int num)
	{
		System.out.println("Number is "+num);
		return "check";
	}
	
	//or
	//url -query parameter
		//http://localhost:8090/20-Spring_MVC_DB_Con_XMl_Based_Continue-2/check?num=444
//	@RequestMapping("check")
//	public String check(@RequestParam int num)
//	{
//		System.out.println("Number is "+num);
//		return "check";
//	}
	
	
	//managing wrong url
	//fallback Function
	@RequestMapping("/*")
	public String error()
	{
		return "error";
	}
}
