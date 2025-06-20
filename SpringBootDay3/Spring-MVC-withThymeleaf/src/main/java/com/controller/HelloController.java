package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class HelloController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String sayHello2(Model m) {
		return "index";
	}
	
	@GetMapping("all")
	public String sayHello(Model m) {
		List<Product> li=service.getAllProducts();
		m.addAttribute("name","Manjiri");
		m.addAttribute("products",li);
		return "Result";
	}
	
	@GetMapping("new")
	public String sayHello1(Model m) {
		return "AddNewProduct";
	}
	
	@PostMapping("addProduct")
	public String newProduct(Product p) {
		service.addProduct(p);
		return "redirect:all";
	}
}
