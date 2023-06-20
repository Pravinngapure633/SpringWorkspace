package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.Dao.DeveloperDao;
import com.cjc.model.Developer;
@Component
public class DeveloperImpl implements DeveloperService{

	@Autowired
	private DeveloperDao dao;
	
	
	
	public void setDao(DeveloperDao dao) {
		this.dao = dao;
	}



	public void saveData(Developer dev) {
		
		dao.saveData(dev);
		
	}
	
	


}
