package com.hospital.specialization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "specialization_table")
public class Specialization {
	
	@Id
	@Column(name="specialization_id")
	private int specializationId;
	
	@Column(name="specialization_name")
	private String specializationName;
	
	
	public int getSpecializationId() {
		return specializationId;
	}
	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}
	public String getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
	
	
	@Override
	public String toString() {
		return "Specialization [specializationId=" + specializationId + ", specializationName=" + specializationName
				+ "]";
	}

	
}
