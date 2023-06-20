package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test_Singleton {
	
	public static void main(String[] args) {
		
		System.out.println("Main--Start");
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml"); 
		//no need getBean method
		//Student student=(Student)factory.getBean("stu");
		System.out.println("Main--End");
		
	}
	

}
