package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AvgServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	int s1,s2,s3,s4,s5;
	s1 = Integer.parseInt(request.getParameter("sub1"));
	s2 = Integer.parseInt(request.getParameter("sub2"));
	s3 = Integer.parseInt(request.getParameter("sub3"));
	s4 = Integer.parseInt(request.getParameter("sub4"));
	s5 = Integer.parseInt(request.getParameter("sub5"));
	double avg=(s1+s2+s3+s4+s5)/5;
	response.getWriter().println("the average of five subjects is: " + avg);
	}

}
