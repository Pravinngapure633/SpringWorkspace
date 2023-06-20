package com.cjc.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Department;
import com.cjc.model.Student;
import com.cjc.repository.DepartmentRepository;
import com.cjc.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository repo;

	@Override
	public Department saveCustomer(Department dep) {

		Integer id = dep.getdId();
		

			Department d = repo.findById(id).get();
			   List<Student> list2 = d.getsList();
			   List<Student> list = dep.getsList();
			   list2.addAll(list);
			   d.setsList(list2);
			   return repo.save(d);
			   
		

		// repo.save(dep);

//		Student s=new Student();
//		
//		List<Student> stu=new ArrayList<Student>();
//		//List<Student> getsList = dep.getsList();
//		
//		
//		
//		 List<Student> sr = stu.stream().collect(Collectors.toList());
//		dep.setsList(sr);
		// dep.setsList(stu);
		// dep.setsList(stu);

	}

	@Override
	public Department getSingleDepartment(Integer did) {
		if (repo.existsById(did)) {
			return repo.findById(did).get();
		}
		return null;
	}

	@Override
	public List<Department> getAllDepartment() {

		return repo.findAll();
	}

	@Override
	public Department updateDepartment(Department dep) {

		return repo.save(dep);
	}

	@Override
	public void deleteDepartment(Integer cid) {
		repo.deleteById(cid);
	}

}
