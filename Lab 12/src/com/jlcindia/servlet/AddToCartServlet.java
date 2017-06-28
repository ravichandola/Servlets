package com.jlcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession sess=req.getSession(false);
		if(sess==null){
			req.setAttribute("Msg", "Session is destroyed");
		}
		else{
			String bnm= req.getParameter("bname");
			sess.setAttribute(bnm, bnm);
			req.setAttribute("Added",bnm+"is added to cart");
		}
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
		
	}

}
