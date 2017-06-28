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

@WebServlet("/HaiServlet")
public class HaiServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("**service() method of HaiServlet****");
		String fnm=req.getParameter("fname");
		String ph=req.getParameter("phone");
		Writer out=res.getWriter();
 		res.setContentType("text/html");
		
		out.write("<h1>Response from Helloservlet");
		out.write("<hr>Resquest Parameter");
		out.write("<br/>Fname"+fnm);
		out.write("<br/>Phone"+ph);
		
		out.write("<hr>Config Parameter");
		ServletConfig cfg=getServletConfig();
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
