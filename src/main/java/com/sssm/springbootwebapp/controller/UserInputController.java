package com.sssm.springbootwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sssm.springbootwebapp.model.ThreeUserInputs;

@Controller
public class UserInputController {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	// e.g. url - http://localhost:8080/acceptfirstname?first=R2
	@RequestMapping("/acceptfirstname")
	public ModelAndView acceptfirstname(String first) {
		LOGGER.info(">> acceptfirstname");
		ModelAndView mav = new ModelAndView();
		// here, query param key (first) matches argument name (first) - thus
		// @RequestParam need not be specified
		mav.addObject("f_name", first);
		mav.setViewName("input");
		return mav;
	}
	
	// e.g. url - http://localhost:8080/acceptlastname?last=D2
	// here, query param key (last) does not match argument name (lastName) - thus
	// @RequestParam needs to be specified
	@RequestMapping("/acceptlastname")
	public ModelAndView acceptlastname(@RequestParam("last") String lastName) {
		LOGGER.info(">> acceptlastname");
		ModelAndView mav = new ModelAndView();
		mav.addObject("l_name", lastName);
		mav.setViewName("input");
		return mav;
	}
	
	// beauty of Spring MVC - maps query params directly to POJO!
	// e.g. url - http://localhost:8080/acceptthreeuserinputs?fi=1&si=C3PO&ti=BB8
	@RequestMapping("/acceptthreeuserinputs")
	public ModelAndView acceptthreeuserinputs(ThreeUserInputs tui) {
		LOGGER.info(">> acceptthreeuserinputs");
		ModelAndView mav = new ModelAndView();
		mav.addObject("tui", tui);
		mav.setViewName("input");
		return mav;
	}

}
