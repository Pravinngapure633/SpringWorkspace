package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test1_Constructor_Injection {

	public static void main(String[] args) {
		
		System.out.println("Main--Start");
		ApplicationContext fac=new ClassPathXmlApplicationContext("bean.xml");
		Student student=(Student)fac.getBean("stu");
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		System.out.println("Main--End");
		
		
	}
	
}
