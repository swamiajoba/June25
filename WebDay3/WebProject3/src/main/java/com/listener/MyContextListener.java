package com.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.bean.Product;

@WebListener
public class MyContextListener implements ServletContextListener {
    public MyContextListener() {
        
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
       System.out.println("Context is Destroyed");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	 System.out.println("Context is Initialized");
    	 List<Product> productList = new ArrayList<>();
    	 productList.add(new Product(100,"Dell Laptop",90000));
    	 productList.add(new Product(101,"HP Laptop",120000));
    	 productList.add(new Product(102,"Asus Laptop",70000));
    	 
    	 ServletContext context=sce.getServletContext();
    	 context.setAttribute("prlist", productList);
    	 System.out.println("Product List Initialized and set to application scope");
    	 
    }
	
}
