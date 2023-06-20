package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findBydep_dId(Integer getdId);

	
	



	

}
