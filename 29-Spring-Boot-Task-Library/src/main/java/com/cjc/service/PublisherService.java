package com.cjc.service;

import java.util.List;

import com.cjc.model.Publisher;

public interface PublisherService {

	void savePublisher(Publisher publisher);

	List<Publisher> allBook(Publisher publisher);

}
