package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Address;
import com.cjc.model.Customer;
import com.cjc.service.AddressService;
import com.cjc.service.CustomerService;

@RestController
public class HomeController {

	@Autowired
	private CustomerService cs;

	@Autowired
	private AddressService es;

	@PostMapping(value = "/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cus) {
		System.out.println(cus);
//		String saveCustomer = cs.saveCustomer(cus);
		return new ResponseEntity<Customer>(cs.saveCustomer(cus), HttpStatus.CREATED);
	}

	@PostMapping(value = "/saveMutlipleCustomer")
	public ResponseEntity<String> saveMultipleCustomer(@RequestBody List<Customer> cus) {
		System.out.println(cus);
		// List<Customer> list = cs.saveMultipleStudent(cus);
		cs.saveMultipleStudent(cus);
		return new ResponseEntity<String>("Saved", HttpStatus.CREATED);

		//return new ResponseEntity<List<Customer>>(cs.saveMultipleStudent((List<Customer>) cus), HttpStatus.CREATED);
	}

	@GetMapping(value = "/getSingleCustomer/{cid}")
	public ResponseEntity<Customer> getSingleCustomer(@PathVariable("cid") Integer cid) {
		return new ResponseEntity<Customer>(cs.getSingleCustomer(cid), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		// cs.getAllCustomer();
		return new ResponseEntity<List<Customer>>(cs.getAllCustomer(), HttpStatus.OK);
	}

	@DeleteMapping(value = "/deletCustomer/{cid}")
	public ResponseEntity<String> deleteCustomerByID(@PathVariable("cid") Integer cid) {
		cs.deleteCustomer(cid);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}

	@PutMapping(value = "/editCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cus) {
		return new ResponseEntity<Customer>(cs.updateCustomer(cus), HttpStatus.CREATED);
	}

	@PostMapping(value = "/saveAddress")
	public ResponseEntity<Address> saveAddress(@RequestBody Address addr) {
		return new ResponseEntity<Address>(es.saveAddress(addr), HttpStatus.OK);
	}

	@GetMapping(value = "/getSingleAddress/{id}")
	public ResponseEntity<Address> getSingleAddress(@PathVariable("id") Integer aPinCode) {
		return new ResponseEntity<Address>(es.getSingleAdd(aPinCode), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress() {
		return new ResponseEntity<List<Address>>(es.getAllAddress(), HttpStatus.OK);
	}

	@PutMapping(value = "/updateAddress")
	public ResponseEntity<Address> updateAddress(@RequestBody Address addr) {
		return new ResponseEntity<Address>(es.updateAddress(addr), HttpStatus.ACCEPTED);
	}

	@DeleteMapping(value = "/deletAddress/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable("id") Integer aPinCode) {
		es.deletAddress(aPinCode);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
}
