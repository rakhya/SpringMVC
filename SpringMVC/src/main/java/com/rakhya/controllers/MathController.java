package com.rakhya.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rakhya.services.AddService;
import com.rakhya.services.SubtractService;

@Controller
public class MathController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		AddService a = new AddService();
		
		int k = a.add(i, j);
		ModelAndView mv = new ModelAndView("displayAdd");
		mv.addObject("result", k);
		return mv;
	}
	
	@RequestMapping("/subtract")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		SubtractService a = new SubtractService();
		
		int k = a.subtract(i, j);
		ModelAndView mv = new ModelAndView("displaySub");
		mv.addObject("result", k);
		return mv;
	}
}

