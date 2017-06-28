package com.jlcindia.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		System.out.println("service method of login servlet");
		
		String unm=req.getParameter("uname");
		String pwd=req.getParameter("password");
		Writer out=res.getWriter();
		out.write("<h1>Hi Welcome to JLC");
		String page="";
		if(unm.equals(pwd)){
			page="/WEB-INF/home.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			
		}
		else{
			page="/WEB-INF/error.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		out.write("<h1>Again,Welcome to Course Cube");
		System.out.println("****Service Completed****");
		
	}

}
