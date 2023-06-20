package com.cjc.model;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${e.cid}")
	private int eid;
	@Value("${e.name}")
	private String name;
	@Value("${e.desig}")
	private String desig;
	
	
	public Employee() {
	
		System.out.println("Employee::Const");
	}
	
	
	public Employee(int eid, String name, String desig) {
		super();
		this.eid = eid;
		this.name = name;
		this.desig = desig;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", desig=" + desig + "]";
	}
	
	
}
