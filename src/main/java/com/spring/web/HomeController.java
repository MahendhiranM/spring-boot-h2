package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person) {
		repo.save(person);
		return "home";
	}
}
