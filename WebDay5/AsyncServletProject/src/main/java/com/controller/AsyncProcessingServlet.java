package com.controller;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncProcessingServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/async" })
public class AsyncProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsyncProcessingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  // Start asynchronous context
        AsyncContext asyncContext = request.startAsync();
        
        // Set timeout (optional)
        asyncContext.setTimeout(10000);

        // Delegate to background thread
        asyncContext.start(() -> {
            try {
                // Simulate long processing
                Thread.sleep(5000);
                
                // Write response
                HttpServletResponse res = (HttpServletResponse) asyncContext.getResponse();
                res.setContentType("text/html");
                res.getWriter().write("<h3>Async Processing Completed!</h3>");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                asyncContext.complete();
            }
        });
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
