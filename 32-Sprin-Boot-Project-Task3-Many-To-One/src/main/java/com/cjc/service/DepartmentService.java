package com.cjc.service;

import java.util.List;

import com.cjc.model.Department;
import com.cjc.model.Student;

public interface DepartmentService {

	void addStudentUsingDepartmentName(Student stu, String dName);

	Department saveDepartment(Department dep);

	List<Student> getAllStudentUndeParticularDepartment(String dName);



}
