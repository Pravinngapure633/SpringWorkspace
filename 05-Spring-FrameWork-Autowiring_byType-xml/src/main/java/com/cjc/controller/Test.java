package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Mobile;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Mobile mobile = ac.getBean(Mobile.class,"m");
		mobile.dail();
	}
} 
