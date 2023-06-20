package com.cjc.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.ProductRepository;
import com.cjc.entity.Product;
import com.cjc.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProduct(Integer productID) {
	
		Optional<Product> product = productRepository.findById(productID);
		
		
		return product.get();
	}
	
	
}
