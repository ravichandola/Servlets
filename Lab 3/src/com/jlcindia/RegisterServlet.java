package com.jlcindia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReisterServlet
 */
@WebServlet("/ReisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    		String fn=req.getParameter("fname");
    		String em=req.getParameter("email");
    		String ph=req.getParameter("phone");
    		String gen=req.getParameter("gender");
    		String tim=req.getParameter("timings");
    		String cou=req.getParameter("course");
    		String cous[]=req.getParameterValues("course");
    		String rem=req.getParameter("remarks");
    		
    		String msg="Your Enquiry has been added successfully";
    		System.out.println("Full name:"+fn);
    		System.out.println("Email:"+em);
    		System.out.println("Phone:"+ph);
    		System.out.println("Gender:"+gen);
    		System.out.println("Timings:"+tim);
    		System.out.println("course:"+cou);
    		System.out.println("All courses");
    		
    		if(cous!=null)
    		{
    			for(String c:cous)
    			{
    				System.out.println(c);
    			}
    		}
    		System.out.println("Remarks"+rem);
    		
    		res.setContentType("text/html");
    		PrintWriter out=res.getWriter();
    		out.println("<h1>Java Learning Center</h1>");
    		out.println("<h1>"+msg+"</h1>");
    		out.println("<h1>Full Name:"+fn);
    		out.println("<h1>Email Id"+em);
    		out.println("<h1>Phone"+ph);
    		out.println("<h1>Gender"+gen);
    		out.println("<h1>Timmings"+tim);
    		out.println("<h1>Course"+cou);
    		out.println("<h1>All Courses");
    		
    		if(cous!=null)
    		{
    			for(String c:cous){
    				out.println("<br/>"+c);
    			}
    			out.println("<h1>Remarks:"+rem);
    		}
    		    		
	}

}
