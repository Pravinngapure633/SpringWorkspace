package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Course;
@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
