package com.te.console.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.beans.Employee;

@WebServlet("/registerprocess")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		register(req, resp);
	}
	
	public void register(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("firstname");
		String uname = req.getParameter("username");
		String pass = req.getParameter("pwd");
		String role = req.getParameter("role");
		String email = req.getParameter("email");
		Integer age = Integer.parseInt(req.getParameter("age"));
		Double salary = Double.parseDouble(req.getParameter("salary"));
		
		com.te.console.dao.Register reg = new com.te.console.dao.Register();
		if (reg.createDetails(name, uname, pass, age, email, role, salary)) {
			req.setAttribute("name", req.getParameter("username"));
			req.getRequestDispatcher("./RegisterSuccess.jsp").forward(req, resp);
		} else {
			String urlName = "./registername.jsp";
			resp.sendRedirect(urlName);
		}
	}
}	
	