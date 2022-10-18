package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;



@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/products")
	public List<Product> getAllProducts(){
		
		return service.getAllProducts();

	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/products")
	public void addProduct(@RequestBody Product p1) {
		service.addProduct(p1); 
	}
	
} 
