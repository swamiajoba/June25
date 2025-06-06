package com.controller;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.listener.AppAsyncListener;
import com.processor.AsyncRequestProcessor;

/**
 * Servlet implementation class AsyncLongRunningServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/AsyncLongRunningServlet" })
public class AsyncLongRunningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AsyncLongRunningServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long startTime=System.currentTimeMillis();
		System.out.println("AsyncLongRunningServlet Start: name "+
					Thread.currentThread().getName() +
					" , ID :"+
					Thread.currentThread().getId());	
		request.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
		
		String time=request.getParameter("time");
		int secs= Integer.valueOf(time);
		
		if(secs>10000) {
			secs=10000;
		}
		
		//Configuring and starting Asynchronous context
		AsyncContext asyncCtx=request.startAsync();
		asyncCtx.addListener(new AppAsyncListener());
		asyncCtx.setTimeout(9000);
		
		ThreadPoolExecutor executor=(ThreadPoolExecutor)
				request.getServletContext().getAttribute("executor");
		
		// Submit and execute the Thread with AsyncRequestProcessor
		executor.execute(new AsyncRequestProcessor(asyncCtx, secs));
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("AsyncLongRunningServlet END: name "+
				Thread.currentThread().getName() +
				" , ID :"+
				Thread.currentThread().getId()+
				" , Time taken "+(endTime-startTime) +" ms");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
