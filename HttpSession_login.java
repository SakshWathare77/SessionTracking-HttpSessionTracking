package com.SessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSession_login
 */
@WebServlet("/HttpSession_login")
public class HttpSession_login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		out.println("<h1 style='color:purple'>Welcome "+ name +"</h1>");
		
		//http Session
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		
		out.println("<a href='servlet2'>Visit next page</a>");
	}

}
