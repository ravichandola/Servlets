package com.jlcindia.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchBookServlet")
public class SearchBookServlet extends HttpServlet {
	
       
    
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String cat=req.getParameter("category");
		if(cat!=null&&cat.equals("java")){
			ArrayList<String> blist=new ArrayList<String>();
			blist.add("Java");
			blist.add("JDBC");
			blist.add("JSP");
			blist.add("Servlet");
			blist.add("EJB");
			blist.add("RMI");
			
			HttpSession sess=req.getSession();
			sess.setAttribute("BOOKS", blist);
		}
		else{
			
			req.setAttribute("MSG", "No Book found with category"+cat);
		}
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
	}

}
