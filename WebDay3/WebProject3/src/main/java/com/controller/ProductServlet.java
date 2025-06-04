package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String spid=request.getParameter("pid");
			String spname=request.getParameter("pname");
			String sprice=request.getParameter("price");
			
			int ipid=Integer.parseInt(spid);
			double dprice=Double.parseDouble(sprice);
			
			Product p=new Product(ipid,spname,dprice);
			// Add the product into productlist available at context ( application scope)
			ServletContext context= getServletContext();  
			List<Product> myplist= null;

				myplist=	(ArrayList<Product>)context.getAttribute("prlist");
				if(myplist==null) {
					myplist=new ArrayList<>();

				}

			myplist.add(p);
				// setting product list in a context scope or application scope
			context.setAttribute("prlist",myplist);


			// Pass the product object to SuccessProduct.jsp via request object
			request.setAttribute("pr", p);
			
			// To dispatch the Control to SuccessProduct.jsp we use RequestDispatcher
			RequestDispatcher red= request.getRequestDispatcher("SuccessProduct.jsp");
			red.forward(request, response);
			
			
			}
			catch(Exception e) {
				RequestDispatcher red= request.getRequestDispatcher("ProductForm.jsp");
				red.include(request, response);
				PrintWriter out=response.getWriter();
				out.println("<hr><font color=red size=4> ");
				out.println(e);
				out.println("</font>");
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
