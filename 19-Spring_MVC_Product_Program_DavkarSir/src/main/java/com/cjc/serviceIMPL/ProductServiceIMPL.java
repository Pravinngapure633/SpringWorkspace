package com.cjc.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.ProductRepository;
import com.cjc.model.Product;

@Service
public class ProductServiceIMPL {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getAllProducts();
	}
	
}
