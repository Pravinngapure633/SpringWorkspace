package com.cjc.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Student {
	
	public Student() {
		
		System.out.println("Student::Const");
	}
	@PostConstruct
	public void init() {
		
		System.out.println("Student: Object Created");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Student : Object destroy in IOC Container");
	}

}
