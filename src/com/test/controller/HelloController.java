package com.test.controller;

import java.math.BigDecimal;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController implements Controller{
    Log log = org.apache.commons.logging.LogFactory.getLog(HelloController.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		log.info("Hello World");
		System.out.println(BigDecimal.valueOf(1000).setScale(2,BigDecimal.ROUND_HALF_UP));
		return new ModelAndView("hello");
	}
	
	public static void main(String[] args) {
		System.out.println(BigDecimal.valueOf(1000).setScale(2,BigDecimal.ROUND_HALF_UP));	
	}
	
	
}