package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class GreetController {
	
	@RequestMapping("/greet")
	public String greetUser(Model model ) {
		model.addAttribute("message","great dat");
		return "success";
	}
	
	@RequestMapping("/hello")
	public String sayHello(ModelMap modeol1) {
		modeol1.addAttribute("message","Hello I have Good Day");
		return "success";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser() {
		ModelAndView modelAndView=new ModelAndView("success","message","Welcome to MVC");
		return modelAndView;
	}
	
}
