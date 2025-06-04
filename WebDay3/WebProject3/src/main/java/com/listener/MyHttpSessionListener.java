package com.listener;

import javax.servlet.annotation.WebListener;
import java.util.Date;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    public MyHttpSessionListener() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("New Session created with ID "+se.getSession().getId() +
        		 		" and creation time "+	new Date());
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	 System.out.println("Session Destroyed with ID "+se.getSession().getId() +
 		 		" and  time "+ 		new Date());
    }
	
}
