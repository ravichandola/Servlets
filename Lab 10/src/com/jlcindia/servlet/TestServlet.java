package com.jlcindia.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String un=req.getParameter("uname");
		String pw=req.getParameter("password");
		
		PrintWriter out=res.getWriter();
		out.println("<h1>Username:"+un);
		out.println("<br/>Password:"+pw);
		out.println("<hr>");
		out.println("Request Header");
		
		Enumeration e=req.getHeaderNames();
		while(e.hasMoreElements()){
			String hn=e.nextElement().toString();
			String hv=req.getHeader(hn);
			out.println("<br/>"+hn+":"+hv);
		}
		out.println("<hr/>");
		out.println("other info");
		
		out.println("<br/>req.getLocale():"+req.getLocale());
		out.println("<hr/>");
		
		out.println("<br>Method:"+req.getMethod());
		out.println("<br/>Request Url:"+req.getRequestURL());
		out.println("<br/>Protocol:"+req.getProtocol());
		out.println("<br/>Content Length:"+req.getContentLength());
		out.println("<br/>Content Type:"+req.getContentType());
		out.println("<br/>Remote Address"+req.getRemoteAddr());
		out.println("<br/>Remote port"+req.getRemotePort());
		out.println("<br/>Remote Host"+req.getRemoteHost());
		out.println("<br/>Remote Port"+req.getRemotePort());
		out.println("<br/>Server name:"+req.getServerName());
		out.println("<br/>Query String:"+req.getQueryString());
		out.println("<br/>Servlet Path:"+req.getServletPath());
		out.println("<br/>Context Path:"+req.getContextPath());
		out.println("<br/>Servlet Name:"+req.getServerName());
		
	}

}
