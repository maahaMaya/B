package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoControllers {

	@RequestMapping(value = "/page1", method = RequestMethod.GET)
	public String Page1(Model m) {

		m.addAttribute("msg", "this is Spring Web MVC");
		int x = 100;
		m.addAttribute("x", x);

		return "TestPage1";
	}

	@RequestMapping(value = "/page2", method = RequestMethod.GET)
	public String Page2() {
		return "TestPage2";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String LoginPage(Model m) {
		return "Login";
	}

	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public String LoginPages(@RequestParam("txtUser") String user,

			@RequestParam("txtPwd") String pwd, Model m) {

		if (user.equals("sourav") && pwd.equals("12345"))
			return "redirect:/page1";
		else {
			m.addAttribute("msg", "Please check username/password");
		}
		return "Login";
	}

}
