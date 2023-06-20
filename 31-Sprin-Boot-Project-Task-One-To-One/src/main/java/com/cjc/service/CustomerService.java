package com.cjc.service;

import java.util.List;

import com.cjc.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer cus);
	
	void saveMultipleStudent(List<Customer> cus);

	public Customer getSingleCustomer(Integer cid);
	
	List<Customer> getAllCustomer();
	
	public void deleteCustomer(Integer cid);

	public Customer updateCustomer(Customer cus);

	
	
	
	
	
	
}
