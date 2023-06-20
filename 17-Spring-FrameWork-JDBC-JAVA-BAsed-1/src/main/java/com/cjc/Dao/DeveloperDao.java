package com.cjc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cjc.model.Developer;
//@Component
public class DeveloperDao {
	//@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void saveData(Developer dev) {
		
		String insert="insert into Developer values("+dev.getId()+",'"+dev.getName()+"')";
		
		template.update(insert);
		System.out.println("Done");
		
	}
	
	

}
