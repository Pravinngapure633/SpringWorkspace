package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.dto.OrderResponse;
import com.cjc.model.Customer;
import com.cjc.service.CustomerService;
import com.cjc.service.ProductService;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerService cs;
	
	@Autowired ProductService ps;
	
	
	@PostMapping(value = "/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cus){
		
		return new ResponseEntity<Customer>(cs.saveCustomer(cus),HttpStatus.CREATED);
		
	}
	@GetMapping(value = "/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		return new ResponseEntity<List<Customer>>(cs.getAllCustomer(),HttpStatus.OK);
	}
	
	//Dto used
	@GetMapping(value = "/findorderselect")
	public ResponseEntity<List<OrderResponse>> getJoinInformation1(){
		
		return new ResponseEntity<List<OrderResponse>>(cs.getJoinInformation1(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/right")
	public ResponseEntity<List<OrderResponse>> getJoinInformation2(){
		
		return new ResponseEntity<List<OrderResponse>>(cs.getJoinInformation2(),HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/left")
	public ResponseEntity<List<OrderResponse>> getJoinInformation3(){
		
		return new ResponseEntity<List<OrderResponse>>(cs.getJoinInformation3(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/inner")
	public ResponseEntity<List<OrderResponse>> getJoinInformation4(){
		
		return new ResponseEntity<List<OrderResponse>>(cs.getJoinInformation4(),HttpStatus.OK);
	}

	
}
