package com.cjc.service;

import java.util.List;

import com.cjc.model.Student1;

public interface Student1Service {

	void saveStudent(Student1 stu);

	List<Student1> saveMultipleStudent(List<Student1> stu);

	Student1 getSingleStudent(int rollno);

	List<Student1> getAllStudent();

	List<Student1> getStudentsMarksGreaterThan(double marks);

	List<Student1> getStudentByNameAndAddress(String name, String address);

}
