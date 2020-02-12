package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.Login_service;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String usrname,password,msg;
		usrname=request.getParameter("usrname");
		password=request.getParameter("password");
		msg=Login_service.AuthenticateUser(usrname, password);
		if (msg.equals("Sucsess")) {
			
			request.getRequestDispatcher("loginsucsess.jsp").forward(request, response);
		}
		else {
			
			response.sendRedirect("logineerror.jsp");
			
		}
		
	}

}
