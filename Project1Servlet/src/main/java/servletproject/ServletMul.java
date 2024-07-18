package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletMul extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		
		int x = (int)request.getAttribute("aaa");
		int y = (int)request.getAttribute("aa");
//		
		out.println("<h3>Multiplied Number: "+(x*y)+"</h3>");
	}
}
