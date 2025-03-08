package com.mkr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("mkr") && pass.equals("mkr123"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			response.sendRedirect("Welcome.jsp");
		}else
		{
			response.sendRedirect("login.jsp");
		}
	}

	

}
