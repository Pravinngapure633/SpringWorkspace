package com.cjc.controller;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Mobile;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Mobile mobile = ac.getBean(Mobile.class,"mob");
		System.out.println(mobile.getPrice());
		Set<Integer> keys = mobile.getData().keySet();
		
		for (Integer key :keys) {
			System.out.println("Key :"+key+"  Values :"+mobile.getData().get(key));
		}
	}

}
