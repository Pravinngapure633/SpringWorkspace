package com.cjc.model;

import java.util.Set;

public class Mobile {

	private int price;
	private Set<String> files;

	public Mobile(int price, Set<String> files) {
		super();
		this.price = price;
		this.files = files;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public Set<String> getFiles() {
		return files;
	}

}
