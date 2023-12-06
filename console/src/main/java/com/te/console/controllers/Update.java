package com.te.console.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.dao.UpdateEmail;
import com.te.console.dao.UpdateName;

@WebServlet("/update")
public class Update extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String change1 = req.getParameter("change");
		if (change1.equals("mail")) {
			email(req, resp);
		}
		
		
	}

	public void email(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {

		String uname = req.getParameter("username");
		String email = req.getParameter("email");
		UpdateEmail mail = new UpdateEmail();
		if (mail.editEmail(uname, email)) {
			resp.sendRedirect("./editSuccess.jsp");
		}

	}
}
