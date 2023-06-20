package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Student;

public class Test_ApplicationContext {

	private static final String Student = null;

	public static void main(String[] args) {
		
		System.out.println("Main--Start");
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");
		//ApplicationContext is Eager loading . No need to getBean method or create object
		//Student student =(Student)factory.getBean("stu");
		
		System.out.println("Main--End");
	}
}
