package com.test.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	Log log = org.apache.commons.logging.LogFactory.getLog(WelcomeController.class);
	@RequestMapping({"/welcome","/"})
	public String welcome(){
		log.info("Welcome World");
		return "hello";		
	}
	
	@RequestMapping({"/save"})
	public String save(String userName,Model model){
	    System.out.println(userName);
	    model.addAttribute("userName", userName);	    
		return "hello";		
	}
	
}
