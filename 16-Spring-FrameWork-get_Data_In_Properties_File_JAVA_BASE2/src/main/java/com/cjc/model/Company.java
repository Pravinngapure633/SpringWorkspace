package com.cjc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "c1")
@Scope(scopeName = "prototype")

public class Company {
	@Autowired
	private Employee employee;
	//	@Autowired
	public void setEmployee(Employee employee) {
		System.out.println("Setter Called");
		this.employee = employee;
	}
	//	@Autowired
	public Company(Employee employee) {
		System.out.println("Const called");
		this.employee = employee;
	}

	public Company() {
		System.out.println("Default Const");
	}

	public String getCompanyDetails() {
		System.out.println("In company class " + employee);
		return "AAA";
	}

}
