package com.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductRepo {
	private List<Product> products;
	public ProductRepo() {
		products=new ArrayList<Product>();
		products.add(new Product(101, "Java Book", 450, 100));
		products.add(new Product(102, "IPhone 16", 85000, 10));
		products.add(new Product(104, "Toy", 850, 100));
		products.add(new Product(105, "Smart Watch", 8500, 25));
	}
	
	public List<Product> getAll() {
		return products;
	}
}
