package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	public List<Product> getAllProducts(){
		
		List<Product> pl=new ArrayList<>();
		
		repo.findAll().forEach(pl :: add);
		
		return pl;
		
	}
	
	public void addProduct(Product p1) {
		
		repo.save(p1);
	}
}
