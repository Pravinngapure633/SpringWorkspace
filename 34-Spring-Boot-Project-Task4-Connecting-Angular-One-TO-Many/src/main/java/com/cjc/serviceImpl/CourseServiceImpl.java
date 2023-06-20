package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Course;
import com.cjc.model.Student;
import com.cjc.repository.CourseRepository;
import com.cjc.repository.StudentRepository;
import com.cjc.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository crepo;
	@Autowired
	private StudentRepository srepo;

//	@Override
//	public void saveCourseUsingStudentId(List<Course> clist, Integer id) {
//		
//		Student student = srepo.findById(id).get();
//		
//		List<Course> list = student.getcList();
//		list.addAll(clist);
//		crepo.saveAll(list);
//			
//	}

}
