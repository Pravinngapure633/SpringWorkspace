package com.cjc.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student1;
import com.cjc.repository.Student1Repository;
import com.cjc.service.Student1Service;

@Service
public class Student1ServiceIMPL implements Student1Service{

	@Autowired
	private Student1Repository repository;

	@Override
	public void saveStudent(Student1 stu) {
	
		repository.save(stu);
	}

	@Override
	public List<Student1> saveMultipleStudent(List<Student1> stu) {
	
		repository.saveAll(stu);
		
		return stu;
	}

	@Override
	public Student1 getSingleStudent(int rollno) {
		
		if(repository.existsById(rollno))
		{
			return repository.findById(rollno).get();
		}
		else 
			
		return null;
	}

	@Override
	public List<Student1> getAllStudent() {
	
		return repository.findAll();
	}

	@Override
	public List<Student1> getStudentsMarksGreaterThan(double marks) {
		
		
		return repository.findByMarksGreaterThan(marks);
	}

	@Override
	public List<Student1> getStudentByNameAndAddress(String name, String address) {
		
		return  repository.findByNameAndAddress(name, address);
	}
	
	
}

