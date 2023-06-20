package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
@Entity
@DynamicUpdate
public class Student {

	@Id
	private int rollno;
	private String name;
	private String division;
	private double mark;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String division, double mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.division = division;
		this.mark = mark;
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
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", division=" + division + ", mark=" + mark + "]";
	}
	
	
	
}
