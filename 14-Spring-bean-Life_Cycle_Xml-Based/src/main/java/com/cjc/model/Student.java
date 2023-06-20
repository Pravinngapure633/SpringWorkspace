package com.cjc.model;

public class Student {
	
	public Student() {
		
		System.out.println("Student::Const");
	}
	
	public void init() {
		
		System.out.println("Student: Object Created");
	}
	
	public void destroy()
	{
		System.out.println("Student : Object destroy in IOC Container");
	}

}
