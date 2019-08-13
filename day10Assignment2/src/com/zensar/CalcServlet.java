package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	static int pgcount=0;
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	pgcount++;
	int a, b;
	String d;
	a = Integer.parseInt(request.getParameter("num1"));
	b = Integer.parseInt(request.getParameter("num2"));
	d = request.getParameter("operation");
	if(d!=null && d.equals("add") )
	{
		RequestDispatcher rd = request.getRequestDispatcher("AddServlet");
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		rd.forward(request, response);
	}
	else if(d!=null && d.equals("substract"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("SubstractServlet");
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		rd.forward(request, response);
	}
	else if(d!=null && d.equals("multiply"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("MultiplyServlet");
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		rd.forward(request, response);
	}
	else if(d!=null && d.equals("divide"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("DivideServlet");
		request.setAttribute("a", a);
		request.setAttribute("b", b);
		rd.forward(request, response);
	}	
	response.getWriter().println("Page Visited Count : " +(pgcount));
	
	}

}
