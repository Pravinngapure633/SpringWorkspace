package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Department;
import com.cjc.model.Student;
import com.cjc.service.DepartmentService;
import com.cjc.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	private StudentService ss;

	@Autowired
	private DepartmentService ds;

	@PostMapping(value = "/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody List<Student> stu) {

		ss.saveStudent(stu);
		return new ResponseEntity<String>("Saved", HttpStatus.CREATED);
	}

	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") Integer sId) {
		return new ResponseEntity<Student>(ss.getSingleStudent(sId), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent() {
		return new ResponseEntity<List<Student>>(ss.getAllStudent(), HttpStatus.OK);
	}

	@PutMapping(value = "/updateStudent")
	public ResponseEntity<String> updateStudent(@RequestBody Student stu) {
		ss.updateStudent(stu);

		return new ResponseEntity<String>("Updated", HttpStatus.OK);
	}

	// problem when we perform delete operation student + department will be deleted
	@DeleteMapping(value = "/deleteStudent/{id}")
	public ResponseEntity<List<Student>> deleteOnlyStudent(@PathVariable("id") Integer sId) {

		
		return new ResponseEntity<List<Student>>(ss.deleteStudent(sId), HttpStatus.OK);
	}
	
	//============================================================

	@PostMapping(value = "/saveStudentUsingDepartmentName/{name}")
	public ResponseEntity<String> addStudentUsingDepartmentName(@RequestBody Student stu,
			@PathVariable("name") String dName) {

		System.out.println("Student:" + stu + " " + dName);
		ds.addStudentUsingDepartmentName(stu, dName);

		return new ResponseEntity<String>("saved", HttpStatus.CREATED);

	}

	//===========================================================
	@PostMapping(value = "/saveDepartment")
	public ResponseEntity<Department> addDepartment(@RequestBody Department dep){
		
		
		return new ResponseEntity<Department>(ds.saveDepartment(dep),HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllStudent/{name}")
	public ResponseEntity<List<Student>> getAllStudentUndeParticularDepartment(@PathVariable("name") String dName){
		
		return new ResponseEntity<List<Student>>(ds.getAllStudentUndeParticularDepartment(dName),HttpStatus.OK);
	}
}
