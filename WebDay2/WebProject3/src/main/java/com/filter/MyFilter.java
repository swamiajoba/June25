package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter({ "/MyProductlist.jsp", "/ProductForm.jsp", "/ProductServlet" })
public class MyFilter extends HttpFilter implements Filter {
       
      public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		System.out.println("MyFilter is destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  HttpServletRequest req=(HttpServletRequest)  request;
	      HttpServletResponse res=(HttpServletResponse) response;
	        // User existing session
	        HttpSession session=req.getSession(false);
	         if(session==null ){
	            System.out.println("NO session");
	            PrintWriter out=res.getWriter();
	            out.println("<script>");
	            out.println("window.open('Login.jsp','_top')");
	            out.println("</script>");
	            out.close();
	        }
	        else {
	        	String user=(String)session.getAttribute("user_name");
	        	if(user==null) {
	        		System.out.println("NO Login");
	 	            PrintWriter out=res.getWriter();
	 	            out.println("<script>");
	 	            out.println("window.open('Login.jsp','_top')");
	 	            out.println("</script>");
	 	            out.close();
	        	}
	        	else {
	                chain.doFilter(request,response);  // go to mapped url component
	        	}
	        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("MyFilter is initialized");
	}

}
