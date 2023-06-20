package com.cjc.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String loadPage()
	{
		System.out.println("LoadPage :: Called");
		return "index";
	}
	@RequestMapping("logPage")
	public String loginPage()
	{
		System.out.println("LoginPAge :: Called");
		return "login";
	}
	@RequestMapping("/regPage")
	public String registerPage()
	{
		System.out.println("RegisterPAge :: called");
		return "register";
	}
	@RequestMapping("/log")
	public String loginCheck(@RequestParam String userName, @RequestParam String password,Model m) {
		System.out.println("LoginCheck :: Called" + userName + " " + password);
		List<Employee> empList=service.loginCheck(userName,password);
		if(empList!=null)
		{
			m.addAttribute("data",empList);
			return "success";
		}
		else {
			return "login";	
		}
		
	}
	@RequestMapping("reg")
	public String registerEmployee(@ModelAttribute Employee employee)
	{
		service.saveEmployee(employee);
		return "index";
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int id, Model m) {
		  List<Employee> list = service.deleteEmployee(id);
		  m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int id, Model m) {
		Employee stu = service.editEmployee(id);
		m.addAttribute("emp", stu);
		return "update";
	}
	@RequestMapping("/up")
	public String updateStudent(@ModelAttribute Employee employee) {
		 service.saveEmployee(employee);
		return "login";
	}
	
}

