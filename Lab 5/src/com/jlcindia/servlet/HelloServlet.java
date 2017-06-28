package com.jlcindia.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	ServletConfig cfg=null;
	public void init(ServletConfig cfg)throws ServletException{
		this.cfg=cfg;
		System.out.println("*****init() method of Hello Servlet****");
	}
	
    	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    		System.out.println("****Service method of Hello Servlet****");
    		
    		String fnm=req.getParameter("fname");
    		String ph=req.getParameter("phone");
    		
    		Writer out=res.getWriter();
    		res.setContentType("text/html");
    		
    		out.write("<h1>Response from Helloservlet");
    		out.write("<hr>Request Parameter");
    		out.write("<br/>Fname"+fnm);
    		out.write("<br/>Phone"+ph);
    		
    		out.write("<hr>Config Parameter");
    		String eml=cfg.getInitParameter("email");
    		out.write("<br/>Email:"+eml);
    		
    		out.write("<hr>Servlet Context Parameter");
    		ServletContext ctx=cfg.getServletContext();
    		String web=ctx.getInitParameter("website");
    		out.write("<br/>"+ctx);
    		out.write("<br/>" +ctx);
    		out.write("<br/>Web:"+web);
    		
    		
    		
    		
	}

}
