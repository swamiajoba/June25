package com.processor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;

public class AsyncRequestProcessor implements Runnable {
	private AsyncContext asyncContext;
	private int secs;
	
	public AsyncRequestProcessor() {
		
	}
	
	public AsyncRequestProcessor(AsyncContext asyncContext, int secs) {
		this.asyncContext = asyncContext;
		this.secs = secs;
	}

	@Override
	public void run() {
		System.out.println("Async Supported ? "+
					asyncContext.getRequest().isAsyncSupported());
		// long duration processing
		longProcessing(secs);
		
		try {
			asyncContext.getResponse().setContentType("text/html");
			PrintWriter out=asyncContext.getResponse().getWriter();
			out.write("Processing Done for "+secs+" milliseconds");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		// complete the processing
		asyncContext.complete();
		
	}

	private void longProcessing(int secs) {
		
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}

}
