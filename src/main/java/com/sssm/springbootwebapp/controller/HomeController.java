package com.sssm.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// this method gets rid of whitelabel error (encountered in absence of default mapping)
	// it redirects to @RequestMapping("/home") method
	@RequestMapping("/")
	public String welcome() {
		System.out.println(">> welcome");
		System.out.println("redirecting to /home");
		return "redirect:/home";
	}

	// @RequestMapping("/home") or @RequestMapping("home") has same effect
	@RequestMapping("/home")
	public String helloWorld() {
		System.out.println(">> helloWorld");
		// path to jsp - if jsp is directly under webapp, then no need to add /WEB-INF/
		return "/WEB-INF/home.jsp";
	}
}
