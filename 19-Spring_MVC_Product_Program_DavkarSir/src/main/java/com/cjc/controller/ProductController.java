package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.model.Product;
import com.cjc.service.ProductService;

@Controller
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public ModelAndView getAllProducts() {
		List<Product> productList = productService.getAllProducts();
		ModelAndView modelAndView = new ModelAndView("getproduct");
		modelAndView.addObject("productList", productList);
		return modelAndView;
	}
}
