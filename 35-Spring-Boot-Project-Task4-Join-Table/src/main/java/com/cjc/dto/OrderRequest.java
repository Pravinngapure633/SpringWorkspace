package com.cjc.dto;

import com.cjc.model.Customer;

public class OrderRequest {
	
	private Customer customer;
	
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

	
	
	
	
	
	

}
