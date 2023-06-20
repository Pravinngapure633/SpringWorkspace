
package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dto.OrderResponse;
import com.cjc.model.Customer;
import com.cjc.model.Product;
import com.cjc.repository.CustomerRepository;
import com.cjc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository crepo;

	@Override
	public Customer saveCustomer(Customer cus) {

		if (crepo.existsById(cus.getCid())) {

			Integer cid = cus.getCid();
			Customer c = crepo.findById(cid).get();
			List<Product> list = c.getpList();
			List<Product> list2 = cus.getpList();
			list.addAll(list2);
			cus.setpList(list);
			return crepo.save(cus);
		} else {
			return crepo.save(cus);
		}
	}

	@Override
	public List<Customer> getAllCustomer() {
		return crepo.findAll();
	}

	// dto
	@Override
	public List<OrderResponse> getJoinInformation1() {

		return crepo.getJoinInformation1();

	}

	@Override
	public List<OrderResponse> getJoinInformation2() {

		return crepo.getJoinInformation2();
	}

	@Override
	public List<OrderResponse> getJoinInformation3() {

		return crepo.getLeftJoin();
	}

	@Override
	public List<OrderResponse> getJoinInformation4() {

		return crepo.getInnerJoin();
	}

}
