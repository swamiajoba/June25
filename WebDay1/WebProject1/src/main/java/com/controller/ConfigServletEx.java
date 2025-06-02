package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServletEx
 */
@WebServlet(
		urlPatterns = { "/ConfigServletEx" }, 
		initParams = { 
				@WebInitParam(name = "jdbcurl", value = "jdbc:oracle:thin@locahost"), 
				@WebInitParam(name = "company", value = "aabbccdd")
		})
public class ConfigServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServletEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String jdbcurl=config.getInitParameter("jdbcurl");
		String com=config.getInitParameter("company");
		String servletname = config.getServletName();
		response.setContentType("text/html");
		response.getWriter().append("Served at: ")
							.append(request.getContextPath())
							.append("<br> JDBC url = "+jdbcurl)
							.append("<br> Company = "+com)
							.append("<br> Servlet name = "+servletname);	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
