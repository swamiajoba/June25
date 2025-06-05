package com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.RegisterUser;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = {"/RegServlet1"})
public class RegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      try {
          String user=req.getParameter("user");
          String hob[]=req.getParameterValues("hobbies");
          String gender=req.getParameter("gender");
          String items[]=req.getParameterValues("items");
          List<String> its= Arrays.asList(items);
          //storing form parametsrs into object ie model
          RegisterUser userob=new RegisterUser(user,hob,gender,its);
          Map<String,String> p=new HashMap<>();
          p.put("useremail",user+"@abc.com");
          p.put("token","user%2345");
          userob.setProps(p);

          //setting Attribute at session
          HttpSession session=req.getSession(true);
          session.setAttribute("myuser" ,userob);


          RequestDispatcher red= req.getRequestDispatcher("el5_1.jsp");
          red.forward(req,resp);


      }
      catch (Exception e) {
          req.setAttribute("errmsg","Error = "+e);
          RequestDispatcher red= req.getRequestDispatcher("el5.jsp");
          red.forward(req,resp);
      }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
