package com.cjc.model;

import java.util.List;

public class Mobile {
	
	
	private int price;
	private List<Contact> contacts;
	
	
	public Mobile(int price, List<Contact> contacts) {
		super();
		this.price = price;
		this.contacts = contacts;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}
	
	

}
