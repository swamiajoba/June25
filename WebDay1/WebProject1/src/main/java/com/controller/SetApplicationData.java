package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetApplicationData
 */
@WebServlet("/SetApplicationData")
public class SetApplicationData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetApplicationData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> prlist=new ArrayList<>();
		prlist.add("Laptop");
		prlist.add("PC");
		prlist.add("Watch");
		prlist.add("Bluetooth earpod");
		
		ServletContext application=getServletContext();
		application.setAttribute("productList", prlist);
		
		response.setContentType("text/html");
		
		response.getWriter().append("Served at: ")
				.append(request.getContextPath())
				.append("<br>Product List initialized");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
