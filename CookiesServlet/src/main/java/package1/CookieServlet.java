package package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		
		String uname = request.getParameter("num1");
		String pass = request.getParameter("num2");
		
		PrintWriter out = response.getWriter();
		Cookie cook = new Cookie("uname",uname);
		Cookie cco = new Cookie("pass",pass);
		response.addCookie(cco);
		response.addCookie(cook);
		out.println("<h1>Hi "+uname+"</h1>");
		out.println("<a href=mServlet> welcome to next servlet</a>");
	}

}
