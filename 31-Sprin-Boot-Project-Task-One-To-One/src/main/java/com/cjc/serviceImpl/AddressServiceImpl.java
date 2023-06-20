package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Address;
import com.cjc.repository.AddressRepository;
import com.cjc.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired 
	private AddressRepository repo;

	@Override
	public Address saveAddress(Address add) {
		return repo.save(add);
		
	}
//	@Override
//	public List<Address> saveMultipleStudent(List<Address> addr) {
//		repo.saveAll(addr);
//		return addr;
//	}
//
//
//
	@Override
	public Address getSingleAdd(Integer aPinCode) {
		if(repo.existsById(aPinCode))
		{
			return repo.findById(aPinCode).get();

		}
		return null;
	}

	@Override
	public List<Address> getAllAddress() {
		
		return repo.findAll();
	}
	@Override
	public Address updateAddress(Address addr) {
		
		return repo.save(addr);
	}
	@Override
	public void deletAddress(Integer aPinCode) {
		repo.deleteById(aPinCode);
	}



	
	
}
