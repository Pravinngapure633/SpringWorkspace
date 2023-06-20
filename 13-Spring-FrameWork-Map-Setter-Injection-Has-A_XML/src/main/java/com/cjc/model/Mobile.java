package com.cjc.model;

import java.util.List;
import java.util.Map;

public class Mobile {

	private int price;
	private Map<Integer, Contact> data;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Map<Integer, Contact> getData() {
		return data;
	}
	public void setData(Map<Integer, Contact> data) {
		this.data = data;
	}
	
	
	
}
