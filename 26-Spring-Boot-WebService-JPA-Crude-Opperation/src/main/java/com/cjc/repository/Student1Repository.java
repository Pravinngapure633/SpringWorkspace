
package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student1;

@Repository
public interface Student1Repository extends JpaRepository<Student1, Integer> {

	
	List<Student1> findByMarksGreaterThan(double marks);
	
	
	//List<Student1> findByNameAndMarksLessThan(String name , double marks);

	List<Student1> findByNameAndAddress(String name, String address);
}
