package com.rohith.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohith.springboot.model.Employee;
import com.rohith.springboot.repositary.EmployeeRepositry;

@RestController
@RequestMapping("/api/v1/")
public class Controller {
	
	
	@Autowired
	private EmployeeRepositry empRepo;
	
	
	//get emp
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmp(){
		
		return this.empRepo.findAll();
	}
	
	//get emp by id
	
	
	//save emp 
	@PostMapping("employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.empRepo.save(employee);
		
	}
	
	//update emp
	
	//delete emp
	

}
