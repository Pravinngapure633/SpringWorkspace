package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test_Setter_Injection {
	
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");
		Student student =(Student)factory.getBean("stu");
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		System.out.println(student.getAddr().getPincode());
		System.out.println(student.getAddr().getArea());
		System.out.println(student.getAddr().getCity());
		
		
	}

}
