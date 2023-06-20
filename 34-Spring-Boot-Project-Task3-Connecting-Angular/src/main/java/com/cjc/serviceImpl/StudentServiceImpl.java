package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Student saveStudent(Student stu) {
		
		return repo.save(stu);
	}

	@Override
	public List<Student> getAllStudent() {
	
	return repo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Student editStudent(Student stu) {
		return repo.save(stu);
	}
	

}
