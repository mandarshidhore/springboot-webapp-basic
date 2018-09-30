package com.sssm.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInputController {
	
	@RequestMapping("/acceptfirstname")
	public ModelAndView acceptfirstname(String first) {
		System.out.println(">> acceptfirstname");
		ModelAndView mav = new ModelAndView();
		// in this case, since query param key matches argument name, @RequestParam does not have to be specified
		mav.addObject("f_name", first);
		mav.setViewName("input");
		return mav;
	}
	
	@RequestMapping("/acceptlastname")
	public ModelAndView acceptlastname(@RequestParam("last") String lastName) {
		System.out.println(">> acceptlastname");
		ModelAndView mav = new ModelAndView();
		// in this case, since query param name does not matches argument name, @RequestParam has to be specified
		mav.addObject("l_name", lastName);
		mav.setViewName("input");
		return mav;
	}

}
