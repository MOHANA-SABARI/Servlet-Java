package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException  {
		
		response.setContentType("text/html");
		
		String name = request.getParameter("username");
		String password = request.getParameter("userpass");
		String email = request.getParameter("useremail");
		String content = request.getParameter("content");
		String course = request.getParameter("course");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Name :"+name+"</h1>");
		out.println("<h1>Password :"+password+"</h1>");
		out.println("<h1>Mail :"+email+"</h1>");
		out.println("<h1>Content :"+content+"</h1>");
		out.println("<h1>Course :"+course+"</h1>");
	}
}
