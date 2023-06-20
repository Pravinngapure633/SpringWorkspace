package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.configuration.BeanConfiguration;
import com.cjc.model.Mobile;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Mobile mobile=context.getBean(Mobile.class,"getMobile");
		System.out.println(mobile.getPrice()+" "+mobile.getName());
		System.out.println("Main End");
		mobile.dial();
		mobile.call();
	}
}
