package com.rakhya.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rakhya.services.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		AddService a = new AddService();
		
		int k = a.add(i, j);
		
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("result", k);
		return mv;
	}
}

