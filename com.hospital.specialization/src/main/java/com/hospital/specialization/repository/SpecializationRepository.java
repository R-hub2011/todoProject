package com.hospital.specialization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.specialization.model.Specialization;

@Repository
public interface SpecializationRepository  extends JpaRepository<Specialization, Integer>{

	



}
