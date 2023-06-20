package com.cjc.service;

import java.util.List;

import com.cjc.dto.OrderResponse;
import com.cjc.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer cus);

	List<Customer> getAllCustomer();

	
	List<OrderResponse> getJoinInformation1();

	List<OrderResponse> getJoinInformation2();

	List<OrderResponse> getJoinInformation3();

	List<OrderResponse> getJoinInformation4();

}
