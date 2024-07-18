package comhttpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("num1");
		String pass = request.getParameter("num2");
		
		HttpSession obj = request.getSession();
		obj.setAttribute("user",uname);
		
		obj.setAttribute("paass", pass);
		
		out.println("<h1>Hi "+uname+"</h1>");
		out.println("<a href='l2Servlet'> welcome to next servlet</a>");
	}


}
