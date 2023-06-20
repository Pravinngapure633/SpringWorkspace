package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
		
		Student student = factory.getBean(Student.class,"stu");
	}

}
