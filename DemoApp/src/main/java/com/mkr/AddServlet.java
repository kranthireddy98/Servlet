package com.mkr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet  extends HttpServlet
{
	
	// need to use service method name
	// service is method belongs to Servlet lifecycle
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int i = Integer.parseInt( req.getParameter("num1"));
		int j = Integer.parseInt( req.getParameter("num2"));
		
		int k = i + j;
		
		k = k*k;
		int x =k*j;
		System.out.print(x);
		
		/*
		Request dispatcher 
		
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("/sq");
		rd.forward(req, res);
		
		*/
		
		//redirect
		
		/*
		 * HttpSession session = req.getSession();
			session.setAttribute("k", k);
		
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");// URl Rewriting
		*/
	}

}
