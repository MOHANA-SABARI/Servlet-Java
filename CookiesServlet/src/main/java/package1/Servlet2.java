package package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] cooke = request.getCookies();
		
		if(cooke !=null) {
			for(Cookie c : cooke) {
				String n = c.getName();
				out.println(n);
				if(n.equals("uname")) {
					String name = c.getValue();
					out.println("<h1>Hi , Hello "+name+"<h1>");
				}
			}
		}else {
			out.println("<h1>Login</h1>");
		}
		
	}

}