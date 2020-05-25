package com.rohith.webApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohith.webApplication.repo.Repo;

@RestController
public class Controller {
	
	@Autowired
	Repo repo;
	
	@RequestMapping("/home")
	public String home() {
		return "Strign ";
	}
	

	
}
