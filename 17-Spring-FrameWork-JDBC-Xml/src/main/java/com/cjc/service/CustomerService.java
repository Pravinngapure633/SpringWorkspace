package com.cjc.service;

import com.cjc.model.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(Customer customer);
	
	public void deleteAll();
}
