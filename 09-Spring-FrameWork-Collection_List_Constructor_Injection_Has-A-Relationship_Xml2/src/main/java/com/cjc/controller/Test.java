package com.cjc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Contact;
import com.cjc.model.Mobile;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");
		Mobile mobile = factory.getBean(Mobile.class,"mob");
		System.out.println("Price :"+mobile.getPrice());
		for (Contact con : mobile.getContacts()) {
			System.out.println("Contacts :"+con.getCnum()+" "+"Names :"+con.getCname());
			
		}
	}

}
