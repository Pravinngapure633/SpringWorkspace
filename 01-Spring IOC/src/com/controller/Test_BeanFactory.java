package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cjc.model.Student;

public class Test_BeanFactory {
	
	public static void main(String[] args) {
		
		System.out.println("Main--Start");
		
		Resource rs=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		
		Student student=(Student)factory.getBean("stu");
		
		System.out.println("Main--End");
	}

}
