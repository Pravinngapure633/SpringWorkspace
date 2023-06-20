package com.cjc.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;
import com.cjc.service.StudentService;
@Service
public class StudentServiceIMPL implements StudentService{
	@Autowired
	private StudentDao dao;

	public List<Student> loginCheck(String userName, String password) {
		if(userName.equals("admin")&& password.equals("admin@123"))
		{
			return dao.getAllStudent();
		}
		else
			return null;
		}

	public void saveStudent(Student student) {
	
		dao.saveStudent(student);
	}

	public List<Student> deleteStudent(int rollno) {
		
		
		return dao.deletStudent(rollno);
	}

	public Student editStudent(int rollno) {
		
		
		return dao.editStudent(rollno);
	}
		
		

}
