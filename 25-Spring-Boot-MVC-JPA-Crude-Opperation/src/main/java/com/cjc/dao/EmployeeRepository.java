package com.cjc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
}
