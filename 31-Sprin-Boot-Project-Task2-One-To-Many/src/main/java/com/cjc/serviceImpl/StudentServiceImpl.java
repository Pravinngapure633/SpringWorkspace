package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Department;
import com.cjc.model.Student;
import com.cjc.repository.DepartmentRepository;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;
	@Autowired
	private DepartmentRepository drepo;


	
		
	}

	

