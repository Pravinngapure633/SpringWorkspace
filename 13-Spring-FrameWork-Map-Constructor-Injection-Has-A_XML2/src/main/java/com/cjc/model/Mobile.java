package com.cjc.model;

import java.util.Map;

public class Mobile {

	private int price;
	private Map<Integer, Contact> data;
	
	
	public Mobile(int price, Map<Integer, Contact> data) {
		super();
		this.price = price;
		this.data = data;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}
	
	public Map<Integer, Contact> getData() {
		return data;
	}
	
	
	
}
