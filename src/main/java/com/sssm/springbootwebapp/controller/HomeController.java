package com.sssm.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// this method gets rid of localhost:8080 whitelabel error (encountered in absence of default mapping)
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
		// if application.properties file does not contain prefix and suffix for jsp pages
		// 	1. use return "/WEB-INF/home.jsp";
		//	2. if jsp is directly under webapp, use return "home.jsp";
		// if application.properties file contains prefix and suffix for jsp pages
		//	1. just use return "home";
		return "home";
	}

}
