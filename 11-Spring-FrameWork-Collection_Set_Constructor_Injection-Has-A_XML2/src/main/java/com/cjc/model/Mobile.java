package com.cjc.model;

import java.util.Set;

public class Mobile {
	
	
	private int price;
	private Set<Contact> contacts;
	
	
	public Mobile(int price, Set<Contact> contacts) {
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
	
	public Set<Contact> getContacts() {
		return contacts;
	}
	
	
	
	

}
