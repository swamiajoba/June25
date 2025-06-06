package com.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppAsyncListener implements AsyncListener{

	@Override
	public void onComplete(AsyncEvent arg0) throws IOException {
		System.out.println("AppAsyncListener onComplete");
		// we can do resource cleanup activity here
		
	}

	@Override
	public void onError(AsyncEvent arg0) throws IOException {
		System.out.println("AppAsyncListener onError");
		System.out.println("Async error: " + arg0.getThrowable());
		arg0.getAsyncContext().getResponse().setContentType("text/html");
	    PrintWriter out = arg0.getAsyncContext().getResponse().getWriter();
	    out.println("<h3>Error occurred during async processing.</h3>");
	    

		
	}

	@Override
	public void onStartAsync(AsyncEvent arg0) throws IOException {
		System.out.println("AppAsyncListener onStartAsync");
		
	}

	@Override
	public void onTimeout(AsyncEvent arg0) throws IOException {
		System.out.println("AppAsyncListener onTimeout");
		arg0.getAsyncContext().getResponse().setContentType("text/html");
	    PrintWriter out = arg0.getAsyncContext().getResponse().getWriter();
	    out.println("<h3>Request timed out!</h3>");
	    out.println("<h3>Timed out error in processing!</h3>");
	    
	  
		
	}

}


