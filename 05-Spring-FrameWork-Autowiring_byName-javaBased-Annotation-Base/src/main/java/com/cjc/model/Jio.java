package com.cjc.model;

import org.springframework.stereotype.Component;

@Component
public class Jio implements SIM {
	
	public Jio() {
		
		System.out.println("Jio::Const");
	}

	public void call() {
		System.out.println("Jio Calling Started...");
	}
}
