package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	Department findBydName(String dName);

}
