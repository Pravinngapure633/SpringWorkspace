package com.cjc.model;

public class Address {
	
	private int pincode;
	private String city;
	private String area;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", area=" + area + "]";
	}
	
	

}
