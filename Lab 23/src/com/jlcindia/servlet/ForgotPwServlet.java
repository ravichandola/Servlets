package com.jlcindia.servlet;

import com.jlcindia.jdbc.UserService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotPwServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 
		UserService userService=new UserService();
		String em=req.getParameter("email");
		String pw=userService.getPasswordByEmail(em);
		String result="";
		if (pw!=null) {
			result="pwstatus.jsp";
			req.setAttribute("PASSWORD", pw);
			
		}else{
			String msg="Invalid Email- Try Again Later";
			req.setAttribute("MSG", msg);
			result="forgotpw.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}
