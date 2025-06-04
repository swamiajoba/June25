package com.listener;

import java.time.LocalDateTime;
import java.util.Enumeration;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {
    public MyServletRequestListener() {
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
//    	ServletRequest req=sre.getServletRequest();
//    	HttpServletRequest request=(HttpServletRequest)req;
//    	String url=request.getRequestURI();
//    	System.out.println("=>Request to "+ url + " is Destroyed at "+LocalDateTime.now());
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
//    	ServletRequest req=sre.getServletRequest();
//    	HttpServletRequest request=(HttpServletRequest)req;
//    	String url=request.getRequestURI();
//    	System.out.println("=>Request to "+ url + " is initialized at "+
//    									LocalDateTime.now());
//    	System.out.println("Parameters are ");
//    	Enumeration<String> paramNames= request.getParameterNames();
//    	while(paramNames.hasMoreElements()) {
//    		String paramName=paramNames.nextElement();
//    		System.out.println("Parameter is "+paramName+
//    				", value "+request.getParameter(paramName));
//    	}
    	

    }
	
}
