package com.cjc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile implements SIM {
	
	private int price;
	private String name;
	@Autowired
	@Qualifier("airtel")
	private SIM sim;
	
	
	public void call() {
		System.out.println("Mobile");
	}
	
	public void dial() {
		System.out.println("Dailing.....");
		if(sim!=null)
		{
			sim.call();
		}
		else {
			System.out.println("No Newtwork");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SIM getSim() {
		return sim;
	}

	public void setSim(SIM sim) {
		this.sim = sim;
	}
	
	
}
