package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	public List<Student> loginCheck(String userName, String password);

	public void saveStudent(Student student);

	public List<Student> deleteStudent(int rollno);

	public Student editStudent(int rollno);
}
