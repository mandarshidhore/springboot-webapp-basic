package com.sssm.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sssm.springbootwebapp.model.ThreeUserInputs;

@Controller
public class UserInputController {
	
	// e.g. url - http://localhost:8080/acceptfirstname?first=R2
	@RequestMapping("/acceptfirstname")
	public ModelAndView acceptfirstname(String first) {
		System.out.println(">> acceptfirstname");
		ModelAndView mav = new ModelAndView();
		// here, query param key (first) matches argument name (first) - thus
		// @RequestParam need not be specified
		mav.addObject("f_name", first);
		mav.setViewName("input");
		return mav;
	}
	
	// e.g. url - http://localhost:8080/acceptlastname?last=D2
	@RequestMapping("/acceptlastname")
	public ModelAndView acceptlastname(@RequestParam("last") String lastName) {
		System.out.println(">> acceptlastname");
		ModelAndView mav = new ModelAndView();
		// here, query param key (last) does not match argument name (lastName) - thus
		// @RequestParam needs to be specified
		mav.addObject("l_name", lastName);
		mav.setViewName("input");
		return mav;
	}
	
	// beauty of Spring MVC - maps query params directly to POJO!
	// e.g. url - http://localhost:8080/acceptthreeuserinputs?fi=1&si=C3PO&ti=BB8
	@RequestMapping("/acceptthreeuserinputs")
	public ModelAndView acceptthreeuserinputs(ThreeUserInputs tui) {
		System.out.println(">> acceptthreeuserinputs");
		ModelAndView mav = new ModelAndView();
		mav.addObject("tui", tui);
		mav.setViewName("input");
		return mav;
	}

}
