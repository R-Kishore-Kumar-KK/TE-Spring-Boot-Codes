package com.te.console.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.dao.UpdateEmail;
import com.te.console.dao.UpdateSalary;

@WebServlet("/update2")
public class UpdateSalary1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String change3 = req.getParameter("changesalary");
		if (change3.equals("salary")) {
			salary(req, resp);
		}
	}
	
	public void salary(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {

		String uname = req.getParameter("username");
		Double salary = Double.parseDouble(req.getParameter("salary"));
		UpdateSalary sal = new UpdateSalary();
		if (sal.editSalary(uname, salary)) {
			resp.sendRedirect("./editSalarySuccess.jsp");
		}

	}
}
