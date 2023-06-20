package com.cjc.service;

import com.cjc.Dao.EmployeeDao;
import com.cjc.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao dao;
	
	

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public void saveEmployeeDetail(Employee emp) {
		dao.saveEmployeeDetail(emp);
	}

	public void updateEmployeeDetail(Employee emp) {
		dao.updateEmployeeDetail(emp);
	}

	public void deleteEmployeeDetail(Employee emp) {
		dao.deleteEmployeeDetail(emp);
	}

	
}
