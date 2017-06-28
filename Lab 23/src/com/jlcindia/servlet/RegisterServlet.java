package com.jlcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.jdbc.UserService;
import com.jlcindia.to.UserTo;

public class RegisterServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		UserService userService=new UserService();
		System.out.println("Register Action Service()");
			String fn=req.getParameter("fname");
			String em=req.getParameter("email");
			String ph=req.getParameter("phone");
			String un=req.getParameter("username");
			String pw=req.getParameter("password");
			int uid=userService.getNextUserId();
			long ph1=Long.parseLong(ph);
			UserTo uto=new UserTo(uid,fn,em,ph1,un,pw);
			int x=userService.registerUser(uto);
			HttpSession sess=req.getSession();
			String result=" ";
			
			if(x==1){
				sess.setAttribute("UN", un);
				result="home.jsp";
			}
			else{
				String msg="Registration Failed- Please Try Again";
				req.setAttribute("MSG", msg);
				result="register.jsp";
			}
			RequestDispatcher rd= req.getRequestDispatcher(result);
			rd.forward(req, res);
			
			
	}

}
