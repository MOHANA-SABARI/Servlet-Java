package comhttpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession obj = request.getSession();
		String xqe = (String) obj.getAttribute("user");
		String paa = (String) obj.getAttribute("paass");
		
		out.println("<h1>NAME :"+xqe+"</h1>");
		out.println("<br><hr><h1>Password :"+paa+"</h1>");
		
	}
}
