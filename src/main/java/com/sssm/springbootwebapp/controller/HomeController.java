package com.sssm.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// url - http://localhost:8080
	// this gets rid of localhost:8080 whitelabel error (that is in
	// absence of default mapping) by redirecting to @RequestMapping("/home") method
	// note - if @Controller is changed to @RestController, redirect:/home will be
	// printed on screen
	@RequestMapping("/")
	public String welcome() {
		System.out.println(">> welcome");
		System.out.println("redirecting to /home");
		return "redirect:/home";
	}

	// @RequestMapping("/home") or @RequestMapping("home") has same effect
	// url - http://localhost:8080/home
	@RequestMapping("/home")
	public String helloWorld() {
		System.out.println(">> helloWorld");
		// if application.properties file does not contain prefix and suffix for jsp pages
		// 	1. use -> return "/WEB-INF/home.jsp";
		//	2. if jsp is directly under webapp, use -> return "home.jsp";
		// if application.properties file contains prefix and suffix for jsp pages
		//	1. just use -> return "home";
		return "home";
	}

}
