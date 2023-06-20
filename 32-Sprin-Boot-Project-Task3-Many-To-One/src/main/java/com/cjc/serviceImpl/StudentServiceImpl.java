package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository srepo;

	@Override
	public void saveStudent(List<Student> stu) {
		
		srepo.saveAll(stu);
	}

	@Override
	public Student getSingleStudent(Integer sId) {
		if(srepo.existsById(sId)) {
		
			return srepo.findById(sId).get();
		}
		
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return srepo.findAll();
	}

	@Override
	public void updateStudent(Student stu) {
		
		srepo.save(stu);
		
	}

	@Override
	public List<Student> deleteStudent(Integer sId) {
		Student s = srepo.findById(sId).get();
		srepo.delete(s);
		return srepo.findAll();
		
	}

	@Override
	public void saveStudentUsingDepartmentName(Student stu) {
		srepo.save(stu);
		
	}
	
}
