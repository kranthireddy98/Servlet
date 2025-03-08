package com.mkr;

import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		/*
		
		int k = (int)req.getAttribute("k");
		out.println("Hello to Square "+k);
		
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
	*/	
		//int k = Integer.parseInt(req.getParameter("k"));
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		out.println("Sq Called " + k);
	}
	
}
