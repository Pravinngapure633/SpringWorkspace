package com.cjc.model;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements SIM {

	public void call() {
		
		System.out.println("Airtel calling start....");
	}
	public Airtel() {
	
			System.out.println("Airtel::Const");
	}

}
