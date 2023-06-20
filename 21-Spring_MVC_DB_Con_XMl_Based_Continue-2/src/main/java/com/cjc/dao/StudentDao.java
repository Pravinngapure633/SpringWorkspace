package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface StudentDao {

	List<Student> getAllStudent();

	void saveStudent(Student student);

}
