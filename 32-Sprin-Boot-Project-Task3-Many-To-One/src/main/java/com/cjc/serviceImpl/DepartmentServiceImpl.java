package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Department;
import com.cjc.model.Student;
import com.cjc.repository.DepartmentRepository;
import com.cjc.repository.StudentRepository;
import com.cjc.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository drepo;
	@Autowired
	private StudentRepository srepo;

	@Override
	public void addStudentUsingDepartmentName(Student stu, String dName) {

		Department dep = drepo.findBydName(dName);
		stu.setDep(dep);

		srepo.save(stu);

	}

	@Override
	public Department saveDepartment(Department dep) {
		
		return drepo.save(dep);
	}

	@Override
	public List<Student> getAllStudentUndeParticularDepartment(String dName) {
			Department d = drepo.findBydName(dName);
			List<Student> list = srepo.findBydep_dId(d.getdId());
			
		
		return list;
	}

}
