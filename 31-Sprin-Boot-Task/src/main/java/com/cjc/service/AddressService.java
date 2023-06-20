package com.cjc.service;

import java.util.List;

import com.cjc.model.Address;

public interface AddressService {
	
	
	
	
	public Address saveAddress(Address add);
	
//	List<Address> saveMultipleStudent(List<Address> addr);
//	
	public Address getSingleAdd(Integer aPinCode);
//	
	List<Address> getAllAddress();

	public Address updateAddress(Address addr);

	public void deletAddress(Integer aPinCode);


}
