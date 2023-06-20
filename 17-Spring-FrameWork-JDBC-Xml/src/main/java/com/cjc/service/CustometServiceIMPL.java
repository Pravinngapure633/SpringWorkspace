package com.cjc.service;

import com.cjc.dao.CustomerDao;
import com.cjc.model.Customer;

public class CustometServiceIMPL implements CustomerService{
	
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	public void saveCustomer(Customer customer) {
		
		dao.saveCustomer(customer);
	}

	public void updateCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}

	public void deleteCustomer(Customer customer) {
		dao.deleteCustomer(customer);
	}

	public void deleteAll() {
		dao.deleteAllCustomer();
	}
	
	
	
	

}
