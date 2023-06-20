package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Course;
import com.cjc.model.Student;
import com.cjc.repository.CourseRepository;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Autowired
	private CourseRepository crepo;

	@Override
	public Student saveStudent(Student stu) {

		if (repo.existsById(stu.getId())) {
			Integer id = stu.getId();
			Student student = repo.findById(id).get();
			List<Course> list = student.getcList();
			List<Course> list2 = stu.getcList();
			list.addAll(list2);
			stu.setcList(list);
			return repo.save(stu);

		} else {

			return repo.save(stu);

		}
	}

	@Override
	public List<Student> getAllStudent() {

		return repo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Student editStudent(Student stu) {
		return repo.save(stu);
	}

	@Override
	public void saveCourseUsingStudentId(List<Course> clist, Integer id) {
		Student student = repo.findById(id).get();
		System.out.println("save************************");
		List<Course> list = student.getcList();
		list.addAll(clist);
		student.setcList(list);

		repo.save(student);
		crepo.saveAll(clist);

	}

}
