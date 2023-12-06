package com.te.cars.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.cars.beans.AdminInfo;
import com.te.cars.service.AdminService;

@Controller
public class CarControllers {

	@Autowired(required = false)
	private AdminService service;
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "AdminLogin";
	}
	
	@PostMapping("/login")
	public String authenticate(Integer id, String password, ModelMap map, HttpServletRequest request) {
		AdminInfo info = service.authenticate(id, password);

		HttpSession session = request.getSession(true);
		session.setAttribute("isLoggedIn", info);
//			session.setMaxInactiveInterval(60);
		map.addAttribute("user", info);
		return "Welcome";

	}
}
