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
public class DepartmentController {

	@Autowired
	private DepartmentService ds;
	
	@Autowired
	private StudentService ss;
	
	

	@PostMapping(value = "/saveDepartment")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department dep) {
		
		System.out.println(dep);
		//ds.saveCustomer(dep);

		return new ResponseEntity<Department>(ds.saveCustomer(dep), HttpStatus.CREATED);
	}

	@GetMapping(value = "/getSingleDepartment/{id}")
	public ResponseEntity<Department> getSingleDepartment(@PathVariable("id") Integer did) {

		return new ResponseEntity<Department>(ds.getSingleDepartment(did), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllDepartment")
	public ResponseEntity<List<Department>> getAllDepartment() {

		return new ResponseEntity<List<Department>>(ds.getAllDepartment(), HttpStatus.OK);
	}

	@PutMapping(value = "/updateDepartment")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department dep) {

		return new ResponseEntity<Department>(ds.updateDepartment(dep), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/deleteDepartment/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") Integer cid){
		
		ds.deleteDepartment(cid);
		return new ResponseEntity<String>("Delete",HttpStatus.OK);
		
	}
	
	//===================
//	@PostMapping(value ="/saveStudentWithDepartmentId/{id}")
//	public ResponseEntity<String>  saveStudentUsingDepartment(@RequestBody List<Student> stu,@PathVariable("id") Integer did){
//	
//		ss.saveStudentUsingDid(stu,did);
//		return new ResponseEntity<String>("Saved",HttpStatus.OK);
//	}
	

}
