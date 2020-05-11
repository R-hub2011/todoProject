package com.rohith.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohith.demo.model.RohithTable;
import com.rohith.demo.repo.RohithRepo;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	RohithRepo repo;
	
	/*
	 * @RequestMapping("/home") public String home() { return "home.jsp";
	 * 
	 * }
	 */

		@RequestMapping("/addData")
		public String addData(RohithTable rohithTable) {
			repo.save(rohithTable);
			return "home.jsp";
		}
}
