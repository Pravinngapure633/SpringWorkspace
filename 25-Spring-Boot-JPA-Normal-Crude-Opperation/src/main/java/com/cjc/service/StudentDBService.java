package com.cjc.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;

@Service
public class StudentDBService {

	@Autowired
	private StudentRepository repository;
	
	public void check()
	{
		Student stu=new Student(102,"Suda","D",11);
		repository.save(stu);
		
		
	}



	public void update() {
		Student stu=new Student();
		stu.setRollno(101);
		stu.setName("Rohit");
		
		repository.save(stu);
	}



	public void deleteMultipleBYID() {
		List<Integer> list = Arrays.asList(102,103);
		repository.deleteAllById(list);
	}



	public void deleteSingleById() {
		repository.deleteById(104);
	}
	
	
	
	public void deleteAllStudent()
	{
		repository.deleteAll();
	}

	
	public void getAllStudentByID() {
		List<Integer> list = Arrays.asList(102,103);
		Iterable<Student> iterable = repository.findAllById(list);
		
		iterable.forEach(System.out::println);
	}

	public void getSingleStudentByID() {
		Optional<Student> optional = repository.findById(109);
		if(optional.isPresent())
		{
			Student student = optional.get();
			System.out.println(student);
		}
		else
			System.out.println("Record Not Found");
	}

	public void getAllStudent() {
		Iterable<Student> iterable = repository.findAll();
		for (Student student : iterable) {
			System.out.println("-----------------");
			System.out.println(student);
		}
	}

	public void saveMultipleStudent() {
		List<Student> list=Arrays.asList(new Student(102, "Vishal", "C", 75.6), 
										new Student(103,"Saurabh","B",85),
										new Student(104, "Sahil", "B", 78.9));
		repository.saveAll(list);
		System.out.println("Multiple Student Save"+list);
	}

	public void saveSingleStudent() {
		Student stu=new Student(101, "Pravin", "A", 85.6);
		repository.save(stu);
		System.out.println("Student Saved ****"+stu);
	}
}
