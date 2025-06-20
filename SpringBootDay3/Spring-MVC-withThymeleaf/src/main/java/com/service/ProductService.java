package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo prepo;
	
	public List<Product> getAllProducts(){
		return prepo.getAll();
	}
	
	public void addProduct(Product p) {
		prepo.getAll().add(p);
	}
}
