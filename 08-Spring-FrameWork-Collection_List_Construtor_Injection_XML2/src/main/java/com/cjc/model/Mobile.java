package com.cjc.model;

import java.util.List;

public class Mobile {

	private int price;
	private List<String> songs;

	public Mobile() {
		super();

	}

	public Mobile(int price, List<String> songs) {
		super();
		this.price = price;
		this.songs = songs;
	}

	public int getPrice() {
		return price;
	}

	public List<String> getSongs() {
		return songs;
	}

}
