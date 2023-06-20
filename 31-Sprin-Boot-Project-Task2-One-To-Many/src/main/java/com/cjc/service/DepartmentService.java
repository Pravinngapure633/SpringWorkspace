package com.cjc.service;

import java.util.List;

import com.cjc.model.Department;

public interface DepartmentService {

	Department saveCustomer(Department dep);

	Department getSingleDepartment(Integer did);

	List<Department> getAllDepartment();

	Department updateDepartment(Department dep);

	void deleteDepartment(Integer cid);



}
