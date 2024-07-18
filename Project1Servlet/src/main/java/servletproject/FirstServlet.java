package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		
//		String name = request.getParameter("username");
//		String password = request.getParameter("pass");
		String a = request.getParameter("num1");
		String b = request.getParameter("num2");
		String ope = request.getParameter("task");
		
		int a1 = Integer.parseInt(request.getParameter("num1"));
		int b1 = Integer.parseInt(request.getParameter("num2"));
		
//		int a1 = Integer.parseInt(a);
//		int b1 = Integer.parseInt(b);
//		
		PrintWriter out = response.getWriter();
		
		//Servlet ServletResponse= ServletResponse.getRequestDispatcher(String hello);	
//		request.setAttribute("username2", name);
		request.setAttribute("numm",a );
		request.setAttribute("numm2", b);
		
		request.setAttribute("aaa",a1 );
		request.setAttribute("aa", b1);
		
		if(ope.equalsIgnoreCase("add")) {
//			out.println("<h1>Validated your Password...!"+"</h1>");
//			out.println("\n<h1>Name :"+name+"</h1>");
			RequestDispatcher obj=request.getRequestDispatcher("/mServlet");
			obj.forward(request, response);
		}
		
		if(ope.equalsIgnoreCase("subtract") || ope.equalsIgnoreCase("sub")) {
//			out.println("<h1>Validated your Password...!"+"</h1>");
//			out.println("\n<h1>Name :"+name+"</h1>");
			RequestDispatcher obj=request.getRequestDispatcher("/SeconFervlet");
			obj.forward(request, response);
		}
		
		if(ope.equalsIgnoreCase("mul")) {
			RequestDispatcher obj=request.getRequestDispatcher("/SeconLervlet");
			obj.forward(request, response);
		}
//		if(password.equalsIgnoreCase("moha")) {
////			out.println("<h1>Validated your Password...!"+"</h1>");
////			out.println("\n<h1>Name :"+name+"</h1>");
//			
//			
//			RequestDispatcher obj=request.getRequestDispatcher("/SecondServlet");
//			obj.forward(request, response);
//		}else {
//			out.println("<h1>Failed..!"+"</h1>");
//			RequestDispatcher obj=request.getRequestDispatcher("index.html");
//			obj.include(request, response);
//		}
		
//		out.println("<h1>Name :"+name+"</h1>");
//		out.println("<h1>Password :"+password+"</h1>");
		
	}

}
