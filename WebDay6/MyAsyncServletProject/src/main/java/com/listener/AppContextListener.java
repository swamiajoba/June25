package com.listener;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class AppContextListener implements ServletContextListener {


    public AppContextListener() {
        // TODO Auto-generated constructor stub
    }

 
    public void contextInitialized(ServletContextEvent sce)  { 
        int corePoolSize = 100;
        int maxPoolSize = 200;
        long keepAliveTime = 50000L;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
        		corePoolSize,
        		maxPoolSize,
        		keepAliveTime,
        		TimeUnit.MICROSECONDS,
        		queue
        		);
        
        sce.getServletContext().setAttribute("executor", executor);
        System.out.println("ThreadPoolExecutor initialized.");
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        ThreadPoolExecutor executor=(ThreadPoolExecutor)sce.getServletContext().getAttribute("executor");
        if (executor != null && !executor.isShutdown()) {
            executor.shutdown();
        }
        System.out.println("ThreadPoolExecutor shutdown.");
        				
   }

	
}
