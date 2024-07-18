package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		
		String namestr = (String)request.getAttribute("username2");
		String n = (String)request.getAttribute("numm");
		String n1 = (String)request.getAttribute("numm2");
		
		int x = Integer.parseInt(n);
		int y = Integer.parseInt(n1);
		String a = namestr.toUpperCase();
		
		out.println("<h3>Added Number: "+(x+y)+"</h3>");
		out.println("<h7>User Name:"+namestr+"</h7>");
		out.println("<h2>Welcome to Second Servlet "+a+"</h2>");
		out.println("<h2>Validated your Password</h2>");
	}

}
