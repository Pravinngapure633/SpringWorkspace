package com.cjc.model;

public class Employee {

	private int id;
	private String name;
	private String address;
	private String desig;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String address, String desig, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.desig = desig;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
