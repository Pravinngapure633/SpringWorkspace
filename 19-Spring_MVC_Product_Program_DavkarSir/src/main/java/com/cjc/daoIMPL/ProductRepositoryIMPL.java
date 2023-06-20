package com.cjc.daoIMPL;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.model.Product;

@Repository
public class ProductRepositoryIMPL {

	List<Product> productList = Arrays.asList(new Product(101, "Mobile", 1000F, 10),
			new Product(102, "TV", 10000F, 5),
			new Product(103, "Watch", 100F, 20)
			);

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}
}
