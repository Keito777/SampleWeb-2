package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {
	
	@RequestMapping("/")
	public String start() {
		return "input.html";
	}
	
	@RequestMapping("/register")
	public ModelAndView register
	(@ModelAttribute RegisterBean rb_object, ModelAndView mv_object) {
		mv_object.addObject("registerbean", rb_object);
		mv_object.setViewName("register.html");
		return mv_object;
	}

}
