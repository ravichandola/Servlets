package com.jlcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.jdbc.UserService;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
					UserService userService=new UserService();
					System.out.println("Login Action Service()");
					String un=req.getParameter("username");
					String pw=req.getParameter("password");
					int x=userService.verifyUser(un,pw);
					
					HttpSession session=req.getSession();
					String result="";
					if(x==1){
						session.setAttribute("UN",un);
						result="home.jsp";
					}
					else{
						String msg="Invalid Username or Password";
						req.setAttribute("MSG", msg);
						result="index.jsp";
					}
					RequestDispatcher rd= req.getRequestDispatcher(result);
					rd.forward(req, res);
					
	}

}