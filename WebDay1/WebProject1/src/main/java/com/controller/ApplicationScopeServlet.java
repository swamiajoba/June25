package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicationScopeServlet
 */
@WebServlet("/ApplicationScopeServlet")
public class ApplicationScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application=getServletContext();
		String scount=(String)application.getAttribute("count");
		int count=0;
		if(scount==null) {
			count=1;
		} else {
			count=Integer.parseInt(scount);
			count++;
		}
		scount=""+count;
		application.setAttribute("count",scount );
		
		List<String> myprlist=(List<String>)application.getAttribute("productList");
		String products="";
		
		if(myprlist !=null) {
			for(String pr:myprlist) {
				products+="<br>"+pr;
			}
		}
	
		response.setContentType("text/html");
		
		response.getWriter().append("Served at: ")
							.append(request.getContextPath())
							.append("<br> Count is "+count)
							.append("Product are "+products);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
