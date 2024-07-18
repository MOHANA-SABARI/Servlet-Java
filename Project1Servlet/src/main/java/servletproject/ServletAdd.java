package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletAdd extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		
		String n = (String)request.getAttribute("numm");
		String n1 = (String)request.getAttribute("numm2");
		
		int x = Integer.parseInt(n);
		int y = Integer.parseInt(n1);
		
		out.println("<h3>Added Number: "+(x+y)+"</h3>");
	}

}
