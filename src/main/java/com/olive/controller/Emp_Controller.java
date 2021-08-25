package com.olive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Emp_Controller {
	
	@GetMapping("/data")
	public String showData(
			@RequestParam("ename") String name ,
			@RequestParam(value="id",required = false ) Integer id ,	
			Model model) {
		
		System.out.println("NAme :: " + name);
		System.out.println("Id :: " + id);
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "home";
	}

}
