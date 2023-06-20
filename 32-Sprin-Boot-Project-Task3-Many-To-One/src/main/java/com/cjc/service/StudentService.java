package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	void saveStudent(List<Student> stu);

	Student getSingleStudent(Integer sId);

	List<Student> getAllStudent();

	void updateStudent(Student stu);

	List<Student> deleteStudent(Integer sId);

	void saveStudentUsingDepartmentName(Student stu);

}
