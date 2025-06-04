package com.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyServletRequestAttributeListener implements javax.servlet.ServletRequestAttributeListener {
    public MyServletRequestAttributeListener() {
        // TODO Auto-generated constructor stub
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
		System.out.println("Destroyed attribute "+srae.getName() +
							" ,value="+srae.getValue());
    }


    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Added attribute "+srae.getName() +
    						" ,value="+srae.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
		System.out.println("Replaced attribute "+srae.getName() +
				" ,value="+srae.getValue());
    }
	
}
