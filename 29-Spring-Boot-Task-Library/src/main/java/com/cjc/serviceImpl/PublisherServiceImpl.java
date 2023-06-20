package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Publisher;
import com.cjc.repository.PublisherRepository;
import com.cjc.service.PublisherService;
@Service
public class PublisherServiceImpl implements PublisherService{

	@Autowired
	private PublisherRepository prepo;
	
	@Override
	public void savePublisher(Publisher publisher) {
		
		prepo.save(publisher);
	}

	@Override
	public List<Publisher> allBook(Publisher publisher) {
	
		return prepo.findAll();
	}

}
