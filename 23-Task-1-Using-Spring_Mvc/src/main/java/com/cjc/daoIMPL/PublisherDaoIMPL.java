package com.cjc.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.PublisherDao;
import com.cjc.model.Publisher;
@Repository
public class PublisherDaoIMPL implements PublisherDao{

	@Autowired
	private SessionFactory factory;
	
	public void savePublisher(Publisher publisher) {
	
		Session session = factory.openSession();
		session.save(publisher);
		session.beginTransaction().commit();
	}
	
}
