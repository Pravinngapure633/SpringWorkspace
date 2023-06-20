package com.cjc.model;

public class Student {
	
	private int rollno;
	private String name;
	private String address;
	private long mobileno;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String address, long mobileno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
