package com.cjc.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.AuthorDao;
import com.cjc.model.Author;
@Repository
public class AuthorDaoIMPL implements AuthorDao {

	@Autowired
	private SessionFactory factory;

	public void saveAuthor(Author author) {
		Session session = factory.openSession();
		session.save(author);
		session.beginTransaction().commit();

	}

}
