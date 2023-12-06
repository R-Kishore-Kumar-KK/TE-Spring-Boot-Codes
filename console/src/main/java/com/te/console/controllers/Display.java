package com.te.console.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.beans.Employee;
import com.te.console.dao.DeleteDetails;
import com.te.console.dao.Login;
import com.te.console.dao.ShowDetails;

@WebServlet("/display")
public class Display extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		authentication(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ShowDetails view = new ShowDetails();
		DeleteDetails delete = new DeleteDetails();
		String action = req.getParameter("action");
		String name = req.getParameter("name");
		if (action.equals("show")) {

			List<Employee> record = view.showRecord(name);
			req.setAttribute("data", record);
			for (Employee employeeInfo : record) {
				req.setAttribute("name", employeeInfo.getName());
				req.setAttribute("uname", employeeInfo.getUsername());
				req.setAttribute("pass", employeeInfo.getPassword());
				req.setAttribute("age", employeeInfo.getAge());
				req.setAttribute("email", employeeInfo.getEmail());
				req.setAttribute("role", employeeInfo.getRole());
				req.setAttribute("salary", employeeInfo.getSalary());
			}
			req.getRequestDispatcher("./viewdetails.jsp").include(req, resp);

		} else if (action.equals("delete")) {
			if (delete.deleteRecord(name)) {
				resp.sendRedirect("./DeletedSuccess.jsp");
			}
		} else if (action.equals("email")) {
			List<Employee> record = view.showRecord(name);
			req.setAttribute("data1", record);
			for (Employee employeeInfo : record) {
				req.setAttribute("uname", employeeInfo.getUsername());
				req.setAttribute("email", employeeInfo.getEmail());
			}
			req.getRequestDispatcher("./editMail.jsp").include(req, resp);
		} else if (action.equals("nam")) {
			List<Employee> record = view.showRecord(name);
			req.setAttribute("data1", record);
			for (Employee employeeInfo : record) {
				req.setAttribute("uname", employeeInfo.getUsername());
				req.setAttribute("name", employeeInfo.getName());
			}
			req.getRequestDispatcher("./editName.jsp").include(req, resp);
		} else if (action.equals("salary")) {
			List<Employee> record = view.showRecord(name);
			req.setAttribute("data1", record);
			for (Employee employeeInfo : record) {
				req.setAttribute("uname", employeeInfo.getUsername());
				req.setAttribute("salary", employeeInfo.getSalary());
			}
			req.getRequestDispatcher("./editSalary.jsp").include(req, resp);
		}


	}

	public void authentication(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("username");
		String pass = req.getParameter("password");

		Login test = new Login();
		if (test.validate(name, pass)) {

			req.setAttribute("uname", req.getParameter("username"));
			req.getRequestDispatcher("./LoginSuccess.jsp").forward(req, resp);

		} else {
			req.getRequestDispatcher("./loginFailure.jsp").include(req, resp);
		}
	}

}

