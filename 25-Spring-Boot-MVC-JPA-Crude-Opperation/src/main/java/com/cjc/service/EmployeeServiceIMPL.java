package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.EmployeeRepository;
import com.cjc.model.Employee;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> loginCheck(String userName, String password) {

		if (userName.equals("admin") && password.equals("admin@123")) {
			List<Employee> findAll = (List<Employee>) repository.findAll();
			return findAll;

		} else {

			return null;
		}

	}

	@Override
	public void saveEmployee(Employee employee) {
		
		repository.save(employee);
	}

	@Override
	public List<Employee> deleteEmployee(int id) {
	
		repository.deleteById(id);
		List<Employee> findAll =(List<Employee>) repository.findAll();
		return findAll;
	}

	@Override
	public Employee editEmployee(int id) {
	
		return repository.findById(id).get();
	}
	

}
