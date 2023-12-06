package com.te.console.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.dao.UpdateName;

@WebServlet("/update1")
public class UpdateName1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String change2 = req.getParameter("changename");
		if(change2.equals("name")) {
			name(req,resp);
		}
	}
	
	public void name(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException{
		String uname = req.getParameter("username");
		String name = req.getParameter("firstname");
		UpdateName name1 = new UpdateName();
		if(name1.editName(uname, name)) {
			resp.sendRedirect("./editNameSuccess.jsp");
		}
		
	}
}
