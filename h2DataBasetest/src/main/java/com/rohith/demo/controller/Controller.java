package com.rohith.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rohith.demo.model.RohithTable;
import com.rohith.demo.repo.RohithRepo;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	RohithRepo repo;

	
	/*
	 * @RequestMapping("/home") public String home1() { return "home.jsp";
	 * 
	 * }
	 * 
	 * @RequestMapping(path = "/aa") public String home() {
	 * 
	 * return "SYYSSSSSJk"; }
	 */

	@RequestMapping(path = "/addData", produces = { "application/json" })
	public String addData(RohithTable rohithTable) {
		repo.save(rohithTable);
		return "home.jsp";
	}

	@RequestMapping("/getData")
	@ResponseBody
	public List<RohithTable> getData() {
		return repo.findAll();
	}
}
