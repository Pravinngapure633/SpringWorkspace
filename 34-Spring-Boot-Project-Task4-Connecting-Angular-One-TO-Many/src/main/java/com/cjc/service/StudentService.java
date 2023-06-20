package com.cjc.service;

import java.util.List;

import com.cjc.model.Course;
import com.cjc.model.Student;

public interface StudentService {

	Student saveStudent(Student stu);

	List<Student> getAllStudent();

	void deleteStudent(Integer id);

	Student editStudent(Student stu);

	void saveCourseUsingStudentId(List<Course> clist, Integer id);

}
