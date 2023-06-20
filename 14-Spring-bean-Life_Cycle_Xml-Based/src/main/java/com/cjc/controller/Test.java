package com.cjc.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		//Student student = ac.getBean(Student.class,"stu");
		//((ConfigurableApplicationContext)ac).close();
		ac.close();
	}

}
