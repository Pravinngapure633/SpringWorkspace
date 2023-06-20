package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student1;
import com.cjc.service.Student1Service;

@RestController
public class HomeController {

	@Autowired
	private Student1Service service;

	@RequestMapping("/")
	public String check() {
		return "Welcome To WebService";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@RequestBody Student1 stu) {
		System.out.println("---------------------");
		System.out.println(stu);
		service.saveStudent(stu);
		return "Student Saved";
	}

	@RequestMapping(value = "/saveMultipleStudent", method = RequestMethod.POST)
	public String saveMultipleStudent(@RequestBody List<Student1> stu) {
		System.out.println(stu);
		service.saveMultipleStudent(stu);
		return "Multiple save";
	}

	@RequestMapping(value = "/getSingleStudent/{rollno}", method = RequestMethod.GET)
	public Student1 getSingleStudent(@PathVariable int rollno) {
		return service.getSingleStudent(rollno);

	}

	@RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
	public List<Student1> getAllStudent() {
		List<Student1> slist = service.getAllStudent();
		return slist;
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Student1 stu) {
		service.saveStudent(stu);
		return "Student Updated";
	}

	@RequestMapping(value = "getByMarksGreaterThan/{marks}", method = RequestMethod.GET)
	public List<Student1> getByMarksGreaterThan(@PathVariable double marks) {
		return service.getStudentsMarksGreaterThan(marks);
	}

	@RequestMapping(value = "/getStudentByNameAndAddress/{name}/{address}", method = RequestMethod.GET)
	public List<Student1> getStudentByNameAndAddress(@PathVariable String name, @PathVariable String address) {
		return service.getStudentByNameAndAddress(name, address);
	}
	
	
}
