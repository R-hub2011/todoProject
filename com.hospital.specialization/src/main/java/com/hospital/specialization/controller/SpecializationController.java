package com.hospital.specialization.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.hospital.specialization.SpecializationApplication;
import com.hospital.specialization.model.Specialization;
import com.hospital.specialization.repository.SpecializationRepository;

@RestController
@RequestMapping("/Specialization")
public class SpecializationController {
	
	@Autowired SpecializationRepository specializationRepository;
	
	
	@GetMapping("/all")
	public List<Specialization> getAllSpecialization() {
		
		return this.specializationRepository.findAll();	
	}
	
	@GetMapping("/{id}")
	public Optional<Specialization> getSpecialization(@PathVariable(value = "id") int specializationId) {
		return this.specializationRepository.findById(specializationId);
	}
	

	@PostMapping("/addSpecialization")
	public Specialization createNewSpecialization(@RequestBody Specialization specialization) {
		return this.specializationRepository.save(specialization);
		
	}
	
	
//	@PutMapping("/updateSpecialization/{id}")
//	public Specialization updateSpecialization(@PathVariable(value = "id" )int specializationId, @RequestBody Specialization specialization){
//		
//		Specialization s = specializationRepository.findOne(specializationId);
//	
//		s.setSpecializationName(specialization.getSpecializationName());
//
//		return this.specializationRepository.save(specialization);
//		
//	}
	


	@DeleteMapping("/{id}")
	public void deleteSpecialization(@PathVariable (value = "id") int specializationId) {
		
	specializationRepository.deleteById(specializationId);

	}
	
	
	
}
