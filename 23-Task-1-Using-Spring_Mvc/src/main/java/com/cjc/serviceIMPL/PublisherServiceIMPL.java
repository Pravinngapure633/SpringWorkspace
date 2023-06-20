package com.cjc.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.PublisherDao;
import com.cjc.model.Publisher;
import com.cjc.service.PublisherService;
@Service
public class PublisherServiceIMPL implements PublisherService {

	@Autowired
	private PublisherDao publisherDao;

	public void savePublisher(Publisher publisher) {
		
		publisherDao.savePublisher(publisher);
	}
	
	
}
