package com.mkr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet  extends HttpServlet
{
	
	// need to use service method name
	// service is method belongs to Servlet lifecycle
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int i = Integer.parseInt( req.getParameter("num1"));
		int j = Integer.parseInt( req.getParameter("num2"));
		
		int k = i + j;
		
		k = k*k;
		
		//Request dispatcher and redirect
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("/sq");
		rd.forward(req, res);
		
		
	}

}
