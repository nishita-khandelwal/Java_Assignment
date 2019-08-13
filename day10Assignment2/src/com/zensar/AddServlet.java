package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int pgcount=0;
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int a=(int)request.getAttribute("a");
	int b=(int)request.getAttribute("b");
	int c=a+b;
	response.getWriter().println("the sum of numbers is "+c);
	response.getWriter().println("<br />Addition Page Visited Count : " +(++pgcount));
}
}
