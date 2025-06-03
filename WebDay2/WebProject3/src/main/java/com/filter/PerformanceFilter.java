package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PerformanceFilter
 */
//@WebFilter({ "/MyProductlist.jsp", "/LoginServlet.do" })
public class PerformanceFilter extends HttpFilter implements Filter {
       
      public PerformanceFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		System.out.println("PerformanceFilter is destroyed ");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request; // 
		String url= req.getRequestURI();
		
		long start=System.currentTimeMillis();
		chain.doFilter(request, response);  // Going to perticular url component
		long end=System.currentTimeMillis();
		System.out.println("URL => "+url + " executed in "+(end-start)+"ms");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("PerformanceFilter is initialized ");
	}

}
