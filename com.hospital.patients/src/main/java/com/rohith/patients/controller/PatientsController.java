package com.rohith.patients.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohith.patients.model.Patients;
import com.rohith.patients.repository.PatientRepository;

@RestController
@RequestMapping("Patients")
public class PatientsController {
	
	@Autowired
	PatientRepository patientRepository;
	
	
	@GetMapping("/all")
	public List<Patients> getAllPatients() {
		
		return  this.patientRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Patients> getPateintbyId(@PathVariable (value ="id") int pateintId) {
		return this.patientRepository.findById(pateintId);
	}
	
	@PostMapping("/addPatient")
	public Patients createNewPatient(@RequestBody Patients patients) {
		
		return this.patientRepository.save(patients);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable (value = "id")int patientId) {
		
		patientRepository.deleteById(patientId);
	}
}
