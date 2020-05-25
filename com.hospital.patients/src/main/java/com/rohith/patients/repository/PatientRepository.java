package com.rohith.patients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohith.patients.model.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Integer> {

}
