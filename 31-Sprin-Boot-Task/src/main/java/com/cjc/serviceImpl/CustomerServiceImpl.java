package com.cjc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Customer;
import com.cjc.repository.CustomerReository;
import com.cjc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerReository repo;

	@Override
	public Customer saveCustomer(Customer cus) {
		Customer cus1 = repo.save(cus);
		return cus1;
	}

	@Override
	public void saveMultipleStudent(List<Customer> cus) {
		// Customer c=new Customer();

		 repo.saveAll(cus);
		
		
	}

	@Override
	public Customer getSingleCustomer(Integer cid) {
		if (repo.existsById(cid)) {
			return repo.findById(cid).get();

		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {

		List<Customer> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteCustomer(Integer cid) {

		repo.deleteById(cid);
	}

	@Override
	public Customer updateCustomer(Customer cus) {
		
		return repo.save(cus);
	}

}
