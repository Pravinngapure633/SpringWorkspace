package com.cjc.service;

import java.util.List;

import com.cjc.model.Employee;

public interface EmployeeService {

	List<Employee> loginCheck(String userName, String password);

	void saveEmployee(Employee employee);

	List<Employee> deleteEmployee(int id);

	Employee editEmployee(int id);
	
	

}
