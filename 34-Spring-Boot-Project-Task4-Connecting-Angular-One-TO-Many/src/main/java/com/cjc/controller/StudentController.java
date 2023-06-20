package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Course;
import com.cjc.model.Student;
import com.cjc.service.CourseService;
import com.cjc.service.StudentService;

@RequestMapping("/Student/v1")
@CrossOrigin("*")
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@Autowired
	private CourseService cservice;
	
	@PostMapping(value = "/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stu){
		
		System.out.println(stu);
		
		
		return new ResponseEntity<Student>(service.saveStudent(stu),HttpStatus.CREATED);
	}
	@GetMapping(value = "/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent(){
		return new ResponseEntity<List<Student>>(service.getAllStudent(),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id ){
		
		service.deleteStudent(id);
		return new ResponseEntity<String>("Delete",HttpStatus.OK);
	}
	@PutMapping(value = "editStudent")
	public ResponseEntity<Student> editStudent(@RequestBody Student stu){
		return new ResponseEntity<Student>(service.editStudent(stu),HttpStatus.OK);
	}
	
	//==================================
	
	@PostMapping(value = "/saveCourse/{id}")
	public ResponseEntity<String> saveCourseUsingStudentId(@RequestBody List<Course> clist,@PathVariable Integer id){
		
		service.saveCourseUsingStudentId(clist,id);
		return new ResponseEntity<String>("Saved",HttpStatus.CREATED);
	}
}
