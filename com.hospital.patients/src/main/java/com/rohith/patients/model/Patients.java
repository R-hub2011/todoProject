package com.rohith.patients.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patients {
	
	@Id
	@Column(name="patient_Id")
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="patient_address")
	private String patientAddress;
	
	@Column(name="patient_phonenumber")
	private String patientPhonenumber;
	
	@Column(name="patient_age")
	private int patientAge;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientPhonenumber() {
		return patientPhonenumber;
	}

	public void setPatientPhonenumber(String patientPhonenumber) {
		this.patientPhonenumber = patientPhonenumber;
	}

	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", patientAddress="
				+ patientAddress + ", patientPhonenumber=" + patientPhonenumber + ", patientAge=" + patientAge + "]";
	}


	
	
	

}
