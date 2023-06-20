package com.cjc.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.BookDao;
import com.cjc.model.Book;
@Repository
public class BookDaoIMPL implements BookDao{

	@Autowired
	private SessionFactory factory;
	
	public void saveBook(Book book) {
		
		Session session = factory.openSession();
		session.saveOrUpdate(book);
		session.beginTransaction().commit();
	}

	public List<Book> allBook() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Book");
		List<Book> list = query.getResultList();
		

		return list;
	}

	public List<Book> deleteBook(int bookId) {
		Session session = factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Book where bookId=?");
		query.setParameter(0, bookId);
		query.executeUpdate();
		session.getTransaction().commit();
		
		return allBook();
	}

	public Book editBook(int bookId) {
		
		return factory.openSession().get(Book.class, bookId);
	}

	
	

	
}
