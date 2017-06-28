package com.jlcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCartServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession sess=req.getSession(false);
		if(sess==null){
			req.setAttribute("MSG", "session is destroyed");
		}else{
			String bnm=req.getParameter("bname");
			sess.removeAttribute(bnm);
		}
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}

}
