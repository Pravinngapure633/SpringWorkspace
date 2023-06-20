package com.cjc.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao {
	@Autowired
	private SessionFactory factory;

	public List<Student> getAllStudent() {
		
		Session session = factory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		return list;
	}

	public void saveStudent(Student student) {
		
		Session session = factory.openSession();
		session.saveOrUpdate(student);
		session.beginTransaction().commit();
	}

	public List<Student> deletStudent(int rollno) {
		Session session = factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Student where rollno=?");
		query.setParameter(0, rollno);
		query.executeUpdate();
		session.getTransaction().commit();
		return getAllStudent();
	}

	public Student editStudent(int rollno) {
		
		
		return factory.openSession().get(Student.class, rollno);
	}

}
