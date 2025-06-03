package com.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/LoginServlet.do" }, 
		initParams = { 
				@WebInitParam(name = "logfile", value = "mylogin.log")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  FileWriter logwriter;

	    @Override
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);
	        String filename=config.getInitParameter("logfile");
	        try {
	            logwriter=new FileWriter(filename,true);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    @Override
	    public void destroy() {
	        try {
	            logwriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        logwriter=null;
	        super.destroy();
	    }


    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   try {


		         String user = request.getParameter("user");
		         String pwd = request.getParameter("pass");

		         if (user.equals("oracle") && pwd.equals("oracle")) {
		             logwriter.write(user +" --> logged in at : "+ LocalDateTime.now() + "\n");
		             logwriter.flush();
		             //HttpSession session= req.getSession(true);
		             HttpSession session= request.getSession();
		             String sessioninfo= "\n -----------------\n";
		             if(session.isNew() )
		             {
		                 sessioninfo +="New Session \n";
		                 sessioninfo+= "Session ID - "+session.getId() + " \n";
		                 sessioninfo+="Session creatation time - "+session.getCreationTime() + "\n";
		             }
		             else {
		                 sessioninfo +="OLD Session \n";
		                 sessioninfo+= "Session ID - "+session.getId() + " \n";
		                 sessioninfo+="Session creatation time - "+session.getCreationTime() + "\n";
		             }
		             sessioninfo +="\n------------------------\n";
		             logwriter.write(sessioninfo);

		             logwriter.flush();

		                // session timeout settings  , session will expire in a given seconds
		             session.setMaxInactiveInterval(30 *60);
		             // setting username in a session
		             session.setAttribute("user_name",user);
		             
		          // put  custom data into request object and pass it to next page, this way of passing is called as request.scope
		             String email= user + "@abc.com";
		             request.setAttribute("myemail" ,email);
		                
		             
//		             RequestDispatcher red = request.getRequestDispatcher("Success.jsp");
//		             red.forward(request, response);
		             
		        
		            response.sendRedirect("Success.jsp");  /// generates new request , LoginServlet request object will not be passed to Success.jsp

		        

		         } else {
		               RequestDispatcher red = request.getRequestDispatcher("Login.jsp");
		                 red.include(request, response);
		             PrintWriter out = response.getWriter();
		             out.println("<font color=red size=4> Invalid username or password </font>");
		         }

		     }
		     catch (Exception e ){
		         RequestDispatcher red = request.getRequestDispatcher("Login.jsp");
		         red.include(request, response);
		         PrintWriter out = response.getWriter();
		         out.println("<font color=red size=4> Error ="+e+"</font>");
		     }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
